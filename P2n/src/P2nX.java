import java.util.Scanner;

public class P2nX {

	public static void main(String[] args) {

		MinhaListaOrdenavel objeto = new MinhaListaOrdenavel();

		objeto.add(new Homem("Rafael", "Manteiga", 3, 6, 1999, 17183623742L, 70F, 1.70F));
		objeto.add(new Homem("Gabriel", "Manteiga", 3, 6, 1999, 17183653730L, 70F, 1.70F));
		objeto.add(new Homem("Carlos Eduardo", "Balbino", 21, 5, 1967, 83927107700L, 110F, 1.68F));
		objeto.add(new Homem("Isaias Luiz", "dos Santos", 27, 10, 1974, 85457655415L, 70F, 1.65F));
		objeto.add(new Homem("Isaias Luiz", "dos Santos Junior", 4, 4, 1996, 11764822463L, 80F, 1.80F));
		objeto.add(new Mulher("Isabella","Oliveira dos Santos",28,9,1999,11764832426L,55F,1.67F));
		objeto.add(new Mulher("Isabel Cristina", "da Silva Manteiga", 12, 1, 1963, 73681288704L, 80F, 1.60F));
		objeto.add(new Mulher("Daniela", "Oliveira dos Santos", 2, 11, 1975, 92984320468L, 65F, 1.59F));
		objeto.add(new Mulher("Isadora Maria", "Oliveira dos Santos", 6, 9, 2007, 11764827422L, 45F, 1.60F));
		objeto.add(new Mulher("Fernanda Angélica", "Alves de Souza Gomes", 5, 1, 1980, 12455966755L, 70F, 1.95F));

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
				// Acrescentar métodos de ordenação (todos os dados podem ser ordenados)
				// Nome
				// Sobrenome
				// Idade (maior e menor)
				// Peso (maior e menor)
				// Altura (maior e menor)
				// IMC (maior e menor)
				// CPF (maior e menor)

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
