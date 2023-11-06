import java.text.DecimalFormat;

public abstract class PessoaIMC extends Pessoa {
    protected float peso;
    protected float altura;

    public PessoaIMC(String nome, String sobreNome, int dia, int mes, int ano, long numCPF) {
        super(nome, sobreNome, dia, mes, ano);
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float calculaIMC() {
        return peso / (altura * altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("Nome: %s\nData de Nascimento: %d/%d/%d\nPeso: %s\nAltura: %s", getNome(), getDia(), getMes(), getAno(), df.format(peso), df.format(altura));
    }
}
