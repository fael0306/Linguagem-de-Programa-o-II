import java.text.DecimalFormat;

public abstract class PessoaIMC extends Pessoa {

	private double peso, altura;

	public PessoaIMC(String nome, String datanascimento, double peso, double altura) {
		super(nome, datanascimento);
		setPeso(peso);
		setAltura(altura);
	}

	public double getPeso() {
		DecimalFormat df = new DecimalFormat("#.##");
		df.format(peso);
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

	public double calculaIMC(double peso, double altura) {

		double imc;

		imc = peso / (altura * altura);

		return imc;
	}

	public abstract String resultIMC();

	public String toString() {

		DecimalFormat df = new DecimalFormat("#.##");

		return String.format("\nNome: %s\nData de nascimento: %s\nPeso: %s\nAltura: %s\n%s", super.getNome(),
				super.getDatanascimento(), df.format(getPeso()), df.format(getAltura()), resultIMC());
	}

}