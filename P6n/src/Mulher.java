public class Mulher extends PessoaIMC {

    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    public String resultIMC() {
        // IMC < 19: Abaixo do peso ideal
        // 19 ≤ IMC ≤ 25.8: Peso ideal
        // IMC > 25.8: Acima do peso ideal

        double imc = calculaIMC();

        if (imc < 19) {
            return String.format("IMC: %.2f\nAbaixo do peso ideal.", imc);
        } else if (imc <= 25.8) {
            return String.format("IMC: %.2f\nPeso ideal.", imc);
        } else {
            return String.format("IMC: %.2f\nAcima do peso ideal.", imc);
        }
    }
}
