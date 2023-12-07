package lp2g21.biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main implements Serializable {

  static Biblioteca biblioteca;
  static Hashtable < Integer, Usuario > usuarios = new Hashtable < > ();
  static Hashtable < String, Livro > livros = new Hashtable < > ();

  private static void manutencao() {

    Scanner op = new Scanner(System.in);
    System.out.println("\n1 - Iniciar uma Biblioteca do zero\n2 - Carregar os arquivos da biblioteca");
    int escolha = op.nextInt();
    
switch (escolha) {
    case 1:
      biblioteca = new Biblioteca(usuarios, livros);
      biblioteca.salvaArquivo(usuarios, "usuarios");
      biblioteca.salvaArquivo(livros, "livros");
      System.out.println("\nBiblioteca criada com sucesso.");
      break;
    case 2:
      biblioteca = new Biblioteca("usuarios", "livros");
      break;
    default:
      System.out.println("\nVocê digitou errado. Tente novamente.");
      manutencao();
    }
  }

  private static void cadastro() {

    Scanner op2 = new Scanner(System.in);
    System.out.println("\n1 - Cadastrar usuários\n2 - Cadastrar livros\n3 - Salvar em arquivo");
    int escolha = op2.nextInt();

    switch (escolha) {
      case 1:
        Scanner nome1 = new Scanner(System.in);
        System.out.println("\nDigite o nome: ");
        String nome = nome1.nextLine();

        Scanner sobreNome1 = new Scanner(System.in);
        System.out.println("\nDigite o sobrenome: ");
        String sobreNome = sobreNome1.nextLine();
        
        Scanner dia1 = new Scanner(System.in);
        System.out.println("\nDigite o dia do nascimento: ");
        int dia = dia1.nextInt();
     
        Scanner mes1 = new Scanner(System.in);
        System.out.println("\nDigite o mês do nascimento: ");
        int mes = mes1.nextInt();
     
        Scanner ano1 = new Scanner(System.in);
        System.out.println("\nDigite o ano do nascimento: ");
        int ano = ano1.nextInt();
        
        Scanner CPF1 = new Scanner(System.in);
        System.out.println("\nDigite o CPF: ");
        long numCPF = CPF1.nextLong();
      
        Scanner peso1 = new Scanner(System.in);
        System.out.println("\nDigite o peso: ");
        int peso = peso1.nextInt();
      
        Scanner altura1 = new Scanner(System.in);
        System.out.println("\nDigite a altura: ");
        float altura = altura1.nextFloat();
     
        Scanner endereco1 = new Scanner(System.in);
        System.out.println("\nDigite o endereço: ");
        String endereco = endereco1.nextLine();
     
        Scanner codigo1 = new Scanner(System.in);
        System.out.println("\nDigite o código do usuário: ");
        int codigoUsuario = codigo1.nextInt();
      
        Usuario usuario = new Usuario(nome, sobreNome, dia, mes, ano, numCPF, peso, altura,
        endereco, codigoUsuario);
        
        biblioteca.cadastroUsuario(usuario);
        break;

      case 2:
        Scanner codigolivro1 = new Scanner(System.in);
        System.out.println("\nDigite o código do livro: ");
        String codigoLivro = codigolivro1.nextLine();
        
        Scanner titulolivro1 = new Scanner(System.in);
        System.out.println("\nDigite o título do livro: ");
        String tituloLivro = titulolivro1.nextLine();
  
        Scanner categoria1 = new Scanner(System.in);
        System.out.println("\nDigite a categoria do livro: ");
        String categoria = categoria1.nextLine();
   
        Scanner qtd1 = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de cópias: ");
        int qtd = qtd1.nextInt();
   
        // Cópias emprestadas inicializa com 0
        // Array de histórico inicializa zerado também

        ArrayList <EmprestPara> hist = new ArrayList<EmprestPara>();
        
        Livro livro = new Livro(codigoLivro,tituloLivro,categoria,qtd,0,hist);
        biblioteca.cadastraLivro(livro);
        break;

      case 3:
        Scanner op3 = new Scanner(System.in);
    
        System.out.println("\n1 - Salvar usuários\n2 - Salvar livros");
        int escolha2 = op3.nextInt();
    
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("Escolha inválida.");
            System.out.println("\n1 - Salvar usuários\n2 - Salvar livros");
            escolha2 = op3.nextInt();
        }
       
        if (escolha2 == 1) {
            biblioteca.salvaArquivo(biblioteca.usuarios, "usuarios");
        } else if (escolha2 == 2) {
            biblioteca.salvaArquivo(biblioteca.livros, "livros");
        }
        break;
  
      default:
        System.out.println("\nVocê digitou errado. Tente novamente.");
        cadastro();
        break;
    }
  }

  private static void emprestimo() {
    Scanner op3 = new Scanner(System.in);
    System.out.println("\n1 - Exibir livros\n2 - Realizar empréstimo\n3 - Fazer uma devolução\n4 - Voltar ao Menu Principal");
    int escolha = op3.nextInt();

    switch(escolha){
      case 1:
        System.out.println(biblioteca.imprimeLivros());
        break;
      case 2:
        Usuario usuario = null;
        Livro livro = null;
        Scanner cdlivro = new Scanner(System.in);
        System.out.println("\nDigite o código do livro: ");
        String cdlivro1 = cdlivro.nextLine();

        try {
          livro = biblioteca.getLivro(cdlivro1);
        } catch (LivroNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          emprestimo();
        }

        Scanner cdusuario = new Scanner(System.in);
        System.out.println("\nDigite o código do usuário: ");
        int cdusuario1 = cdusuario.nextInt();

        try {
          usuario = biblioteca.getUsuario(cdusuario1);
        } catch (UsuarioNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          emprestimo();
        }

        biblioteca.emprestaLivro(usuario, livro);
        break;

      case 3:
        Usuario usuario2 = null;
        Livro livro2 = null;
        Scanner cdlivro2 = new Scanner(System.in);
        System.out.println("\nDigite o código do livro: ");
        String cdlivro3 = cdlivro2.nextLine();

        try {
          livro2 = biblioteca.getLivro(cdlivro3);
        } catch (LivroNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          emprestimo();
        }

        Scanner cdusuario2 = new Scanner(System.in);
        System.out.println("\nDigite o código do usuário: ");
        int cdusuario3 = cdusuario2.nextInt();

        try {
          usuario2 = biblioteca.getUsuario(cdusuario3);
        } catch (UsuarioNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          emprestimo();
        }

        biblioteca.devolveLivro(usuario2, livro2);
        break;
      
      case 4:
        main(null);
        break;
      
      default:
        System.out.println("\nVocê digitou errado. Tente novamente.");
        emprestimo();
        break;
        
      }
  }

  private static void gerarRelatorio() {
    Scanner op4 = new Scanner(System.in);
    System.out.println("\n1 - Listar acervo de livros\n2 - Listar usuários\n3 - Detalhar usuário específico\n4 - Detalhar livro específico\n5 - Voltar ao Menu Principal");
    int escolha = op4.nextInt();

    switch (escolha) {
      case 1:
        System.out.println(biblioteca.imprimeLivros());
        gerarRelatorio();
        break;
      
      case 2:
        System.out.println(biblioteca.imprimeUsuarios());
        gerarRelatorio();
        break;
      
      case 3:
        Usuario usuario = null;
        Scanner cdusuario = new Scanner(System.in);
        System.out.println("\nDigite o código do usuário: ");
        int cdusuario2 = cdusuario.nextInt();

        try {
          usuario = biblioteca.getUsuario(cdusuario2);
        } catch (UsuarioNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          gerarRelatorio();
        }
        System.out.println(usuario.toString());
        break;

      case 4:
        Livro livro = null;
        Scanner cdlivro = new Scanner(System.in);
        System.out.println("\nDigite o código do livro: ");
        String cdlivro2 = cdlivro.nextLine();

        try {
          livro = biblioteca.getLivro(cdlivro2);
        } catch (LivroNaoCadastradoEx e) {
          System.out.println(e.getMessage());
          gerarRelatorio();
        }
        System.out.println(livro.toString());
        break;
      
      case 5:
        main(null);
        break;

      default:
        System.out.println("\nVocê digitou errado. Tente novamente.");
        gerarRelatorio();
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Executa a manutenção inicial da biblioteca
    manutencao();

    // Menu principal
    int opcao;
    do {
        System.out.println("\nMenu Principal:");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Empréstimo");
        System.out.println("3 - Gerar Relatório");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        
        opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        switch (opcao) {
            case 1:
                cadastro();
                break;
            case 2:
                emprestimo();
                break;
            case 3:
                gerarRelatorio();
                break;
            case 0:
                System.out.println("Saindo do programa. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 0);
    
    scanner.close();
}
}