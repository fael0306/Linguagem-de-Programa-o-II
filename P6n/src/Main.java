import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MinhaListaOrdenavel objeto = new MinhaListaOrdenavel();

        objeto.add(new Homem("Rafael", "03/06/1999", 63, 1.70));
        objeto.add(new Homem("Gabriel", "03/06/1999", 75, 1.80)); // Gabriel e Rafael são gêmeos
        objeto.add(new Homem("Carlos", "21/05/1967", 110, 1.65));
        objeto.add(new Homem("Isabel", "12/01/1963", 80, 1.60));
        objeto.add(new Homem("Adriano", "21/04/1987", 85, 1.71));
        objeto.add(new Homem("Diego", "29/03/1985", 81, 1.63));
        objeto.add(new Homem("Carla", "07/10/1991", 70, 1.85));
        objeto.add(new Homem("Rafaela", "14/07/1994", 60, 1.55));
        objeto.add(new Homem("Guilherme", "16/04/2006", 70, 1.65));
        objeto.add(new Homem("Cristiano", "05/01/1998", 90, 1.88));

        try {
            Scanner l1 = new Scanner(System.in);
            System.out.println("1. Imprimir lista");
            System.out.println("2. Sair");
            int o1 = Integer.parseInt(l1.nextLine());

            if (o1 == 1) {
                Scanner l = new Scanner(System.in);
                System.out.println("Escolha seu modo de ordenação.");
                System.out.println("1. Alfabética (A-Z)");
                System.out.println("2. Alfabética (Z-A)");
                System.out.println("3. Menor Peso");
                System.out.println("4. Maior Altura");
                System.out.println("5. Menor IMC");
                int o = Integer.parseInt(l.nextLine());

                objeto.ordena(o);

                for (Homem homem : objeto) {
                    System.out.println(homem.toString());
                }
            } else if (o1 == 2) {
                System.exit(0);
            } else {
                System.out.println("Você escolheu uma opção inválida. O programa será encerrado.");
                System.exit(0);
            }

        } catch (NumberFormatException e) {
            System.out.println("Você digitou uma opção inválida. O programa será encerrado.");
            System.exit(0);
        }
    }
}
