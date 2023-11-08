public class Homem extends PessoaIMC {

  public Homem(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura) {
    super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
  }

  public String resultIMC() {

    // IMC < 20.7 : Abaixo do peso ideal
    // 20.7 ≤ IMC ≤ 26.4: Peso ideal
    // IMC > 26.4 : Acima do peso ideal

    double imc;

    imc = calculaIMC();

    if (imc < 20.7) {
      return String.format("IMC: %.2f\nAbaixo do peso ideal", imc);
    } else if (imc >= 20.7 && imc <= 26.4) {
      return String.format("IMC: %.2f\nPeso ideal", imc);
    } else {
      return String.format("IMC: %.2f\nAcima do peso ideal", imc);
    }
  }

  public String toString() {
    String retorno, infopessoa;

    infopessoa = super.toString();

    retorno = infopessoa + "\nGênero: Masculino" + "\n" + resultIMC();

    return retorno;
  }
}