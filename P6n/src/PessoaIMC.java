import java.text.DecimalFormat;

public abstract class PessoaIMC extends Pessoa {

    private double peso, altura;

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        setPeso(peso);
        setAltura(altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("\nNome: %s\nData de nascimento: %s\nPeso: %s\nAltura: %s\n%s",
                super.getNome(), super.getDatanascimento(), df.format(getPeso()), df.format(getAltura()), resultIMC());
    }
}
