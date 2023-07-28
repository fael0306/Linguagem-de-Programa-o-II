import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a quantidade de funcionários que deseja cadastrar: ");
            int qtd = Integer.parseInt(entrada.nextLine());

            ArrayList<Funcionario> funcList = new ArrayList<>();

            for (int i = 0; i < qtd; i++) {
                Scanner entrada2 = new Scanner(System.in);
                System.out.println("Contratado ou Executivo (c ou e)? ");
                String ce = entrada2.nextLine().toLowerCase();

                while (!ce.equals("c") && !ce.equals("e")) {
                    System.out.println("Contratado ou Executivo (c ou e)?\nDigite c ou e.\n");
                    ce = entrada2.nextLine().toLowerCase();
                }

                Funcionario funcionario;
                if (ce.equals("c")) {
                    funcionario = cadastrarContratado();
                } else {
                    funcionario = cadastrarExecutivo();
                }

                funcList.add(funcionario);
            }

            for (Funcionario funcionario : funcList) {
                System.out.println(funcionario.toString());
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Você precisa digitar um número.");
        }
    }

    public static FuncCntrd cadastrarContratado() {
        Scanner nomeemp2 = new Scanner(System.in);
        System.out.println("\nNome do empregado: ");
        String nomeemp = nomeemp2.nextLine();

        Scanner codigo2 = new Scanner(System.in);
        System.out.println("\nCódigo: ");
        String codigo = codigo2.nextLine();

        Scanner salario2 = new Scanner(System.in);
        System.out.println("\nSalário: ");
        float salario = Float.parseFloat(salario2.nextLine());

        Scanner dep2 = new Scanner(System.in);
        System.out.println("\nNúmero de dependentes: ");
        int dep = Integer.parseInt(dep2.nextLine());

        return new FuncCntrd(nomeemp, codigo, salario, dep);
    }

    public static FuncExct cadastrarExecutivo() {
        Scanner nomeemp2 = new Scanner(System.in);
        System.out.println("\nNome do empregado: ");
        String nomeemp = nomeemp2.nextLine();

        Scanner codigo2 = new Scanner(System.in);
        System.out.println("Código: ");
        String codigo = codigo2.nextLine();

        Scanner salario2 = new Scanner(System.in);
        System.out.println("Salário: ");
        float salario = Float.parseFloat(salario2.nextLine());

        Scanner grat2 = new Scanner(System.in);
        System.out.println("Gratificação: ");
        float grat = Float.parseFloat(grat2.nextLine());

        Scanner dep2 = new Scanner(System.in);
        System.out.println("Número de dependentes: ");
        int dep = Integer.parseInt(dep2.nextLine());

        return new FuncExct(nomeemp, codigo, salario, dep, grat);
    }
}

class Funcionario {
    protected String nome;
    protected String codigo;
    protected float salario;
    protected int numDependentes;

    public Funcionario(String nome, String codigo, float salario, int numDependentes) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        this.numDependentes = numDependentes;
    }

    public float calcularSalario() {
        // Implementar o cálculo do salário
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCódigo: " + codigo + "\nSalário: " + salario + "\nDependentes: " + numDependentes;
    }
}

class FuncCntrd extends Funcionario {
    public FuncCntrd(String nome, String codigo, float salario, int numDependentes) {
        super(nome, codigo, salario, numDependentes);
    }

    // Se houver diferenças específicas para o cálculo de salário, implemente aqui
}

class FuncExct extends Funcionario {
    private float gratificacao;

    public FuncExct(String nome, String codigo, float salario, int numDependentes, float gratificacao) {
        super(nome, codigo, salario, numDependentes);
        this.gratificacao = gratificacao;
    }

    // Se houver diferenças específicas para o cálculo de salário, implemente aqui

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + gratificacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGratificação: " + gratificacao;
    }
}
