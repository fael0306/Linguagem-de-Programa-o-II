package lp2g21.biblioteca;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

  static Biblioteca biblioteca;

  private static void manutencao() {

    Scanner op = new Scanner(System.in);
    System.out.println("\n1 - Iniciar uma Biblioteca do zero\n2 - Carregar os arquivos da biblioteca");
    int escolha = op.nextInt();
    
switch (escolha) {
    case 1:
      Hashtable < Integer, Usuario > usuarios = new Hashtable < > ();
      Hashtable < String, Livro > livros = new Hashtable < > ();
      biblioteca = new Biblioteca(usuarios, livros);
      biblioteca.salvaArquivo(usuarios, "usuarios");
      biblioteca.salvaArquivo(livros, "livros");
      System.out.println("\nBiblioteca criada com sucesso.");
      break;
    case 2:
      biblioteca = new Biblioteca("usuarios", "livros");
      break;
    default:
      System.out.println("\nEscolha uma opção válida.");
      return;
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
        Hashtable<Integer, Usuario> usuarios = new Hashtable<>();
        Hashtable<String, Livro> livros = new Hashtable<>();
        Scanner op3 = new Scanner(System.in);
    
        System.out.println("\n1 - Salvar usuários\n2 - Salvar livros");
        int escolha2 = op3.nextInt();
    
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("Escolha inválida.");
            System.out.println("\n1 - Salvar usuários\n2 - Salvar livros");
            escolha2 = op3.nextInt();
        }
       
        if (escolha2 == 1) {
            biblioteca.salvaArquivo(usuarios, "usuarios");
        } else if (escolha2 == 2) {
            biblioteca.salvaArquivo(livros, "livros");
        }
        break;
  
      default:
        break;
    }
  }

  private static void emprestimo() {

  }

  private static void gerarRelatorio() {

  }

  public static void main(String[] args) {
    manutencao();
    cadastro();
  }
}