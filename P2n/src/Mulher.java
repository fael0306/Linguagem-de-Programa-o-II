public class Mulher extends PessoaIMC {

	public Mulher(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura) {
		super(nome, sobreNome, dia, mes, ano, numCPF);
		//TODO Auto-generated constructor stub
	}

	public String resultIMC() {

		// IMC < 19 : Abaixo do peso ideal
		// 19 ≤ IMC ≤ 25.8: Peso ideal
		// IMC > 25.8 : Acima do peso ideal

		double imc;

		imc = calculaIMC();

		if (imc < 19) {
			return String.format("IMC: %.2f\nAbaixo do peso ideal.", imc);
		} else if (imc >= 19 && imc <= 25.8) {
			return String.format("IMC: %.2f\nPeso ideal.", imc);
		} else {
			return String.format("IMC: %.2f\nAcima do peso ideal.", imc);
		}
	}

	public String toString() {
		String retorno, infopessoa;
	
		infopessoa = super.toString();
		
		retorno = infopessoa+"\nGênero: Feminino"+"\n"+resultIMC();
	
		return retorno;
	  }
}