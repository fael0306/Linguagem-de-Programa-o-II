package lp2g21.biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Hashtable;

public class Biblioteca {
  Hashtable < Integer, Usuario > usuarios;
  Hashtable < String, Livro > livros;

  public Biblioteca(Hashtable < Integer, Usuario > usuarios, Hashtable < String, Livro > livros) {
    this.usuarios = usuarios;
    this.livros = livros;
  }

  public Biblioteca(String arquivoUsuarios, String arquivoLivros) {
    leArquivo(arquivoUsuarios);
    leArquivo(arquivoLivros);
  }

  public void cadastroUsuario(Usuario usuario) {
    if (!usuarios.containsKey(usuario.getCodigoUsuario())) {
      usuarios.put(usuario.getCodigoUsuario(), usuario);
    } else {
      System.out.println("Código de usuário já existente.");
    }
  }

  public void cadastraLivro(Livro livro) {
    if (!livros.containsKey(livro.getCodigoLivro())) {
      livros.put(livro.getCodigoLivro(), livro);
    } else {
      System.out.println("Código de livro já existente.");
    }
  }

  public void salvaArquivo(Hashtable < ? , ? > tabela, String arquivo) {
    try {
      ObjectOutputStream arq = new ObjectOutputStream(new FileOutputStream(arquivo));
      arq.writeObject(tabela);
      System.out.println("Tabela salva com sucesso!");
      arq.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @SuppressWarnings("unchecked")
  public void leArquivo(String arquivo) {
    try (ObjectInputStream arq = new ObjectInputStream(new FileInputStream(arquivo))) {
      if (arquivo.contains("usuarios")) {
        usuarios = (Hashtable < Integer, Usuario > ) arq.readObject();
        System.out.println("Cadastro de usuários lido com sucesso.");
      } else if (arquivo.contains("livros")) {
        livros = (Hashtable < String, Livro > ) arq.readObject();
        System.out.println("Acervo de livros lido com sucesso.");
      } else {
        System.out.println("Nome do arquivo inexistente.");
      }
    } catch (ClassNotFoundException | IOException e) {
      System.out.println(e.toString());
    }
  }

  public void emprestaLivro(Usuario usuario, Livro livro) {
    try {
      livro.empresta();
    } catch (CopiaNaoDisponivelEx e) {
      System.out.println(e.getMessage());
    }
    GregorianCalendar dataemprestimo = (GregorianCalendar) GregorianCalendar.getInstance();
    GregorianCalendar datadevolucao = (GregorianCalendar) dataemprestimo.clone();
    datadevolucao.add(GregorianCalendar.DAY_OF_MONTH, 7);
    livro.addUsuarioHist(dataemprestimo, datadevolucao, usuario.getCodigoUsuario());
  }

  public void devolveLivro(Usuario usuario, Livro livro) {
    try {
      livro.devolve();
    } catch (NenhumaCopiaEmprestadaEx e) {
      System.out.println(e.getMessage());
    }
    GregorianCalendar datadevolucao = (GregorianCalendar) GregorianCalendar.getInstance();
    GregorianCalendar dataemprestimo = (GregorianCalendar) datadevolucao.clone();
    dataemprestimo.add(GregorianCalendar.DAY_OF_MONTH, -7);
    livro.addUsuarioHist(dataemprestimo, datadevolucao, usuario.getCodigoUsuario());

    // Buscando empréstimo mais recente referente ao livro no histórico
    EmprestPara emprestatual = livro.getHist().get(livro.getHist().size() - 1);
    emprestatual.setdataDevol(datadevolucao);

    if (datadevolucao.after(emprestatual.getdataDevol())) {
      long diasdeatraso = (datadevolucao.getTimeInMillis() - dataemprestimo.getTimeInMillis()) / (24 * 60 * 60 * 1000);
      float multa = diasdeatraso * 15; // Multa de R$15 por dia
      System.out.println("Devolução com atraso de " + diasdeatraso + "dias. Multa de R$" + multa);
      System.out.println("Por favor, pague a multa na biblioteca.");
    }
  }

  public String imprimeLivros() {
    String strresultado = "";
    if (livros != null) {
      ArrayList < Livro > listadelivros = new ArrayList < > (livros.values());
      listadelivros.sort(Comparator.comparing(Livro::getTituloLivro));

      for (Livro livro: listadelivros) {
        strresultado = strresultado + livro.getTituloLivro() + "\n";
      }
    } else {
      strresultado = "Nenhum livro encontrado.";
    }
    return strresultado;
  }

  public String imprimeUsuarios() {
    String strresultado = "";
    if (usuarios != null) {
      ArrayList < Usuario > listadeusuarios = new ArrayList < > (usuarios.values());
      listadeusuarios.sort(Comparator.comparing(Usuario::getNome));

      for (Usuario usuario: listadeusuarios) {
        strresultado = strresultado + usuario.getNome() + "\n";
      }
    } else {
      strresultado = "Nenhum usuário encontrado.";
    }
    return strresultado;
  }

  public Livro getLivro(String cod) throws LivroNaoCadastradoEx {
    Livro livro = livros.get(cod);
    if (livro == null) {
      throw new LivroNaoCadastradoEx("Livro não está disponível no momento.");
    }
    return livro;
  }

  public Usuario getUsuario(int cod) throws UsuarioNaoCadastradoEx {
    Usuario usuario = usuarios.get(cod);
    if (usuario == null) {
      throw new UsuarioNaoCadastradoEx("Usuário inexistente.");
    }
    return usuario;
  }
}