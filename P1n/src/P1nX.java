import java.util.Scanner;

public class P1nX {
  public static void main(String[] args) {

    if (!ValidaCPF.isCPF(args[5])) {
      System.out.println("Digite um CPF válido!");
    } else {
      Pessoa pessoalc = new Pessoa(args[0], args[1], Integer.parseInt(args[2]),
        Integer.parseInt(args[3]), Integer.parseInt(args[4]), ValidaCPF.toLong(args[5]),
        Float.parseFloat(args[6]), Float.parseFloat(args[7]));
      System.out.println(pessoalc.toString());
    }
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

      System.out.println("\nDigite o peso: ");
      float peso = leitura.nextFloat();

      System.out.println("\nDigite o altura: ");
      float altura = leitura.nextFloat();

      if (numCPF == 0 || peso == 0.0 ||
        altura == 0.0) {
        pessoas[k] = new Pessoa(nome, sobrenome, dia, mes, ano);
      } else {
        pessoas[k] = new Pessoa(nome, sobrenome, dia, mes, ano, numCPF, peso, altura);
      }
    }

    leitura.close();

    for (int k = 0; k < qtd; k++) {
      System.out.println("\n");
      System.out.println(pessoas[k].toString());
    }
  }
}