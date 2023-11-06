import java.util.Scanner;

public class P2nX {

	public static void main(String[] args) {

		MinhaListaOrdenavel objeto = new MinhaListaOrdenavel();

		objeto.add(new Homem("Rafael", "Manteiga", 3, 6, 1999, 17183623742L, 70, 1.70F));
		objeto.add(new Homem("Gabriel", "Manteiga", 3, 6, 1999, 17183653730L, 70, 1.70F));
		objeto.add(new Homem("Carlos Eduardo", "Balbino", 21, 5, 1967, 0L, 110, 1.65F));
		// Criar mais 2 objetos Homem e 5 objetos Mulher
	
		try {
			Scanner l1 = new Scanner(System.in);
			System.out.println("1.Imprimir lista");
			System.out.println("2.Sair");
			int o1 = Integer.parseInt(l1.nextLine());

			if (o1 == 1) {
				Scanner l = new Scanner(System.in);
				System.out.println("Escolha seu modo de ordenação.");
				System.out.println("1.Alfabetica (A-Z)");
				System.out.println("2.Alfabetica (Z-A)");
				System.out.println("3.Menor Peso");
				System.out.println("4.Maior Altura");
				System.out.println("5.Menor IMC");
				int o = Integer.parseInt(l.nextLine());

				// E se não for um número de 1 a 5? Tratar.

				objeto.ordena(o);

				for (int n = 0; n <= 9; n++) {
					System.out.println(objeto.get(n).toString());
				}

				l.close();

			// Tratar os erros abaixo
			} else if (o1 == 2) {
				System.exit(0);
			} else {
				System.out.println("Você escolheu uma opção inválida. O programa será encerrado.");
				System.exit(0);
			}

			l1.close();

		} catch (NumberFormatException e) {
			System.out.println("Você digitou uma opção inválida. O programa será encerrado");
			System.exit(0);
		}
	}
}
