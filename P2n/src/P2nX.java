import java.util.InputMismatchException;
import java.util.Scanner;

public class P2nX {

  public static void main(String[] args) {

    MinhaListaOrdenavel objeto = new MinhaListaOrdenavel();

    objeto.add(new Homem("Rafael", "Manteiga", 3, 6, 1999, 17183623742L, 70F, 1.70F));
    objeto.add(new Homem("Gabriel", "Manteiga", 3, 6, 1999, 17183653730L, 70F, 1.70F));
    objeto.add(new Homem("Carlos", "Balbino", 21, 5, 1967, 83927107700L, 110F, 1.68F));
    objeto.add(new Homem("Isaias", "dos Santos", 27, 10, 1974, 85457655415L, 70F, 1.65F));
    objeto.add(new Homem("Isaias", "dos Santos Junior", 4, 4, 1996, 11764822463L, 80F, 1.80F));
    objeto.add(new Mulher("Isabella", "Oliveira dos Santos", 28, 9, 1999, 11764832426L, 55F, 1.67F));
    objeto.add(new Mulher("Isabel", "da Silva Manteiga", 12, 1, 1963, 73681288704L, 80F, 1.60F));
    objeto.add(new Mulher("Daniela", "Oliveira dos Santos", 2, 11, 1975, 92984320468L, 65F, 1.59F));
    objeto.add(new Mulher("Isadora", "Oliveira dos Santos", 6, 9, 2007, 11764827422L, 45F, 1.60F));
    objeto.add(new Mulher("Fernanda", "Alves de Souza Gomes", 5, 1, 1980, 12455966755L, 70F, 1.95F));

    Scanner l1 = new Scanner(System.in);

    int o1;
    do {
      System.out.println("1.Imprimir lista");
      System.out.println("2.Sair");

      try {
        o1 = l1.nextInt();
        if (o1 < 1 || o1 > 2) {
          System.out.println("Opção inválida. Tente novamente.");
        } else if (o1 == 1) {
          Scanner l = new Scanner(System.in);
          int o;
          do {
            System.out.println("Escolha seu modo de ordenação.");
            System.out.println("1.Nome (A-Z)");
            System.out.println("2.Nome (Z-A)");
            System.out.println("3.Sobrenome (A-Z)");
            System.out.println("4.Sobrenome (Z-A)");
            System.out.println("5.Menor peso");
            System.out.println("6.Maior peso");
            System.out.println("7.Menor altura");
            System.out.println("8.Maior altura");
            System.out.println("9.Menor IMC");
            System.out.println("10.Maior IMC");
            System.out.println("11.Menor CPF");
            System.out.println("12.Maior CPF");
            System.out.println("13.Gênero (H-M)");
            System.out.println("14.Gênero (M-H)");

            try {
              o = l.nextInt();
              if (o < 1 || o > 14) {
                System.out.println("Opção inválida. Tente novamente.");
              } else {
                objeto.ordena(o);

                for (int n = 0; n <= 9; n++) {
                  System.out.println(objeto.get(n).toString());
                }
              }
            } catch (InputMismatchException e) {
              System.out.println("Entrada inválida. Tente novamente.");
              l.nextLine();
              o = 0;
            }
          } while (o < 1 || o > 14);

          l.close();
        }
      } catch (InputMismatchException e) {
        System.out.println("Opção inválida. Tente novamente.");
        l1.nextLine();
        o1 = 0;
      }
    } while (o1 < 1 || o1 > 2);

    l1.close();
  }
}