public class Homem extends PessoaIMC {

    public String resultIMC() {
        double imc = calculaIMC(super.getPeso(), super.getAltura());

        final double IMC_ABAIXO_PESO_IDEAL = 20.7;
        final double IMC_PESO_IDEAL_MIN = 20.7;
        final double IMC_PESO_IDEAL_MAX = 26.4;

        if (imc < IMC_ABAIXO_PESO_IDEAL) {
            return String.format("IMC: %.2f\nAbaixo do peso ideal.", imc);
        } else if (imc >= IMC_PESO_IDEAL_MIN && imc <= IMC_PESO_IDEAL_MAX) {
            return String.format("IMC: %.2f\nPeso ideal.", imc);
        } else {
            return String.format("IMC: %.2f\nAcima do peso ideal.", imc);
        }
    }

    public Homem(String nome, String datanascimento, double peso, double altura) {
        super(nome, datanascimento, peso, altura);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nData de nascimento: %s\nPeso: %.2f kg\nAltura: %.2f m",
                super.getNome(), super.getDataNascimento(), super.getPeso(), super.getAltura());
    }
}
