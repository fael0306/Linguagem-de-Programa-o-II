import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String ce;
		String nomeemp;
		String codigo;
		float salario;
		int dep;
		int qtd;
		float grat;

		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite a quantidade de funcionários que deseja cadastrar: ");
			qtd = Integer.parseInt(entrada.nextLine());
			ArrayList funcList = new ArrayList(qtd);
			for (int i = 0; i < qtd; i++) {

				Scanner entrada2 = new Scanner(System.in);
				System.out.println("Contratado ou Executivo (c ou e)? ");
				ce = entrada2.nextLine();

				while (ce.equals("e")==false && ce.equals("c")==false) {
					System.out.println("Contratado ou Executivo (c ou e)?\nDigite c ou e.\n");
					ce = entrada2.nextLine();
				}
				if (ce.equals("c") || ce.equals("C")) {
					Scanner nomeemp2 = new Scanner(System.in);
					System.out.println("\nNome do empregado: ");
					nomeemp = nomeemp2.nextLine();

					Scanner codigo2 = new Scanner(System.in);
					System.out.println("\nCódigo: ");
					codigo = codigo2.nextLine();

					Scanner salario2 = new Scanner(System.in);
					System.out.println("\nSalário: ");
					salario = Float.parseFloat(salario2.nextLine());

					Scanner dep2 = new Scanner(System.in);
					System.out.println("\nNúmero de dependentes: ");
					dep = Integer.parseInt(dep2.nextLine());

					FuncCntrd funccntrd = new FuncCntrd(nomeemp, codigo, salario, dep);
					funcList.add(i,funccntrd);
				}
				if (ce.equals("e") || ce.equals("E")) {
					Scanner nomeemp2 = new Scanner(System.in);
					System.out.println("\nNome do empregado: ");
					nomeemp = nomeemp2.nextLine();

					Scanner codigo2 = new Scanner(System.in);
					System.out.println("Código: ");
					codigo = codigo2.nextLine();

					Scanner salario2 = new Scanner(System.in);
					System.out.println("Salário: ");
					salario = Float.parseFloat(salario2.nextLine());

					Scanner grat2 = new Scanner(System.in);
					System.out.println("Gratificação: ");
					grat = Float.parseFloat(grat2.nextLine());

					Scanner dep2 = new Scanner(System.in);
					System.out.println("Número de dependentes: ");
					dep = Integer.parseInt(dep2.nextLine());

					FuncExct funcexct = new FuncExct(nomeemp, codigo, salario, dep, grat);
					funcList.add(i,funcexct);
				}

			}

			for (int contador = 0; contador < qtd; contador++) {
				System.out.println(funcList.get(contador).toString());
			}

		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida. Você precisa digitar um número.");
		}
	}
}
