import java.util.Scanner;

public class P1nX {
    public static void main(String[] args) {
        Pessoa pessoalc = new Pessoa(args[0],args[1],Integer.parseInt(args[2]),
        Integer.parseInt(args[3]),Integer.parseInt(args[4]),Long.parseLong(args[5]),
        Float.parseFloat(args[6]),Float.parseFloat(args[7]));

        System.out.println(pessoalc.toString());

        Scanner leitura = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de pessoas que você deseja adicionar: ");
        int qtd = leitura.nextInt();
        leitura.close();

        Pessoa[] pessoas = new Pessoa[qtd];
        
        Scanner scanner = new Scanner(System.in);

        for(int k=0;k<qtd;k++){

            System.out.println("\nDigite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("\nDigite o sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("\nDigite o dia do nascimento: ");
            int dia = scanner.nextInt();

            System.out.println("\nDigite o mês do nascimento: ");
            int mes = scanner.nextInt();

            System.out.println("\nDigite o ano do nascimento: ");
            int ano = scanner.nextInt();

            System.out.println("\nDigite o CPF: ");
            long numCPF = scanner.nextLong();

            System.out.println("\nDigite o peso: ");
            float peso = scanner.nextFloat();

            System.out.println("\nDigite o altura: ");
            float altura = scanner.nextFloat();

            if (numCPF == 0 || peso == 0.0 || 
            altura == 0.0) {
                pessoas[k] = new Pessoa(nome,sobrenome,dia,mes,ano);
            } else {
                pessoas[k] = new Pessoa(nome,sobrenome,dia,mes,ano,numCPF,peso,altura);
              }
        }

        scanner.close();

        for(int k=0;k<qtd;k++){
            System.out.println(pessoas[k].toString());
        }
    }
}