import java.util.InputMismatchException;
import java.util.Scanner;

public class P1nX {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (!ValidaCPF.isCPF(args[5])) {
      System.out.println("Digite um CPF válido!");
      args[5] = scanner.next();
    }

    while(!ValidaData.isDia(args[2])){
      System.out.println("Digite um dia válido!");
      args[2] = scanner.next();
    }

    while(!ValidaData.isMes(args[3])){
      System.out.println("Digite um mês válido!");
      args[3] = scanner.next();
    }

    while(!ValidaData.isAno(args[4])){
      System.out.println("Digite um ano válido!");
      args[4] = scanner.next();
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
    int k = 0;
    while (k < qtd) {

      System.out.println("\nDigite o nome: ");
      String nome = leitura.nextLine();

      if (nome.equals("")) {
        break;
      }

      System.out.println("\nDigite o sobrenome: ");
      String sobrenome = leitura.nextLine();

      int dia;
      System.out.println("\nDigite o dia do nascimento: ");
      while (true) {
            try {
                dia = leitura.nextInt();
                if (ValidaData.isDia(dia)) {
                    break;
                } else {
                    System.out.println("Digite um dia válido!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor numérico válido!");
                leitura.nextLine();
            }
        }

      int mes;
      System.out.println("\nDigite o mês do nascimento: ");
      while (true) {
            try {
                mes = leitura.nextInt();
                if (ValidaData.isMes(mes)) {
                    break;
                } else {
                    System.out.println("Digite um mês válido!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor numérico válido!");
                leitura.nextLine();
            }
        }

      int ano;
      System.out.println("\nDigite o ano do nascimento: ");
      while (true) {
            try {
                ano = leitura.nextInt();
                if (ValidaData.isAno(ano)) {
                    break;
                } else {
                    System.out.println("Digite um ano válido!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor numérico válido!");
                leitura.nextLine();
            }
        }

      System.out.println("\nDigite o CPF: ");
      String numCPFstr = leitura.next();
      while (!ValidaCPF.isCPF(numCPFstr)) {
        System.out.println("Digite um CPF válido!");
        numCPFstr = leitura.next();
      }
      long numCPF = ValidaCPF.toLong(numCPFstr);
      leitura.nextLine();

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
      String genero = leitura.nextLine();

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
      k++;
    }

    leitura.close();
    scanner.close();

    int conthomem = 0, contmulher = 0;

    for (int n = 0; n < pessoas.length; n++) {
      if (pessoas[n] != null) {
        System.out.println("\n");
        System.out.println(pessoas[n].toString());
        if (pessoas[n] instanceof Homem) {
          conthomem++;
        }
        if (pessoas[n] instanceof Mulher) {
          contmulher++;
        }
      }
    }

    System.out.println("\n\nQuantidade de pessoas: " + Pessoa.numPessoas());
    System.out.println("\nA quantidade de homens é: " + conthomem);
    System.out.println("\nA quantidade de mulheres é: " + contmulher);
  }
}