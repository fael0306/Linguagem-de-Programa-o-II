import java.util.Scanner;

public class P1nX {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (!ValidaCPF.isCPF(args[5])) {
      System.out.println("Digite um CPF válido!");
      args[5] = scanner.next();
    }

    Pessoa pessoalc = new Pessoa(args[0], args[1], Integer.parseInt(args[2]),
      Integer.parseInt(args[3]), Integer.parseInt(args[4]), ValidaCPF.toLong(args[5]),
      Float.parseFloat(args[6]), Float.parseFloat(args[7]));

    System.out.println("");
    System.out.println(pessoalc.toString());

    Scanner leitura = new Scanner(System.in);
    System.out.println("\nDigite a quantidade de pessoas que você deseja adicionar: ");
    int qtd = leitura.nextInt();
    leitura.nextLine();

    Pessoa[] pessoas = new Pessoa[qtd];

    for (int k = 0; k < qtd; k++) {

      System.out.println("\nDigite o nome: ");
      String nome = leitura.nextLine();

      System.out.println("\nDigite o sobrenome: ");
      String sobrenome = leitura.nextLine();

      System.out.println("\nDigite o dia do nascimento: ");
      int dia = leitura.nextInt();

      System.out.println("\nDigite o mês do nascimento: ");
      int mes = leitura.nextInt();

      System.out.println("\nDigite o ano do nascimento: ");
      int ano = leitura.nextInt();

      System.out.println("\nDigite o CPF: ");
      long numCPF = leitura.nextLong();
      while (!ValidaCPF.isCPF(Long.toString(numCPF))) {
        System.out.println("Digite um CPF válido!");
        numCPF = leitura.nextLong();
      }

      System.out.println("\nDigite o peso: ");
      String peso = leitura.next();
      float pesof;
      pesof = Float.parseFloat(peso);
      leitura.nextLine();

      System.out.println("\nDigite o altura: ");
      String altura = leitura.nextLine();
      float alturaf;
      alturaf = Float.parseFloat(altura);

      System.out.println("\nDigite o gênero (M ou F): ");
      String genero = leitura.next();

      if (numCPF == 0 || pesof == 0.0 ||
        alturaf == 0.0) {
        if (genero.equalsIgnoreCase("m")) {
          pessoas[k] = new Homem(nome, sobrenome, dia, mes, ano);
        } else if (genero.equalsIgnoreCase("f")) {
          pessoas[k] = new Mulher(nome, sobrenome, dia, mes, ano);
        } else {
          pessoas[k] = new Pessoa(nome, sobrenome, dia, mes, ano);
        }
      } else {
        if (genero.equalsIgnoreCase("m")) {
          pessoas[k] = new Homem(nome, sobrenome, dia, mes, ano, numCPF, pesof, alturaf);
        } else if (genero.equalsIgnoreCase("f")) {
          pessoas[k] = new Mulher(nome, sobrenome, dia, mes, ano, numCPF, pesof, alturaf);
        } else {
          pessoas[k] = new Pessoa(nome, sobrenome, dia, mes, ano, numCPF, pesof, alturaf);
        }
      }
    }

    leitura.close();
    scanner.close();

    int conthomem = 0, contmulher = 0;

    for (int k = 0; k < qtd; k++) {
      System.out.println("\n");
      System.out.println(pessoas[k].toString());
      if (pessoas[k] instanceof Homem) {
        conthomem++;
      }
      if (pessoas[k] instanceof Mulher) {
        contmulher++;
      }
    }

    System.out.println("\n\nQuantidade de pessoas: " + Pessoa.numPessoas());
    System.out.println("\nA quantidade de homens é: " + conthomem);
    System.out.println("\nA quantidade de mulheres é: " + contmulher);
  }
}