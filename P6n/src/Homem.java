public class Homem extends PessoaIMC {

	public String resultIMC() {

		// IMC < 20.7 : Abaixo do peso ideal
		// 20.7 ≤ IMC ≤ 26.4: Peso ideal
		// IMC > 26.4 : Acima do peso ideal

		double imc;

		imc = calculaIMC(super.getPeso(), super.getAltura());

		if (imc < 20.7) {
			return String.format("IMC: %.2f\nAbaixo do peso ideal.", imc);
		} else if (imc >= 20.7 && imc <= 26.4) {
			return String.format("IMC: %.2f\nPeso ideal.", imc);
		} else {
			return String.format("IMC: %.2f\nAcima do peso ideal.", imc);
		}
	}

	public Homem(String nome, String datanascimento, double peso, double altura) {
		super(nome, datanascimento, peso, altura);
		// TODO Auto-generated constructor stub
	}
}