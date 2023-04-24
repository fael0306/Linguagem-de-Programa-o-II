public class Mulher extends PessoaIMC {

	public String resultIMC() {

		// IMC < 19 : Abaixo do peso ideal
		// 19 ≤ IMC ≤ 25.8: Peso ideal
		// IMC > 25.8 : Acima do peso ideal

		double imc;

		imc = calculaIMC(super.getPeso(), super.getAltura());

		if (imc < 19) {
			return String.format("IMC: %.2f\nAbaixo do peso ideal.", imc);
		} else if (imc >= 19 && imc <= 25.8) {
			return String.format("IMC: %.2f\nPeso ideal.", imc);
		} else {
			return String.format("IMC: %.2f\nAcima do peso ideal.", imc);
		}
	}

	public Mulher(String nome, String datanascimento, double peso, double altura) {
		super(nome, datanascimento, peso, altura);
		// TODO Auto-generated constructor stub
	}

}