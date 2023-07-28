public class Funcionario {
    private String nome;
    private String cdemp;
    private float salario;
    private float salarioliq;

    public Funcionario(String nome, String cdemp, float salario) {
        this.nome = nome;
        this.cdemp = cdemp;
        this.salario = salario;
        calcularSalarioLiquido(0); // Assumindo desconto inicial de 0%
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        calcularSalarioLiquido(0); // Recalcula o salário líquido ao modificar o salário base
    }

    public String getCdemp() {
        return cdemp;
    }

    public void setCdemp(String cdemp) {
        this.cdemp = cdemp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioliq() {
        return salarioliq;
    }

    private void calcularSalarioLiquido(float desconto) {
        salarioliq = salario * (1 - (desconto / 100));
    }

    public void aplicarDesconto(float desconto) {
        calcularSalarioLiquido(desconto);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCódigo: %s\nSalário-base: %.2f\nSalário líquido: %.2f", nome, cdemp, salario, salarioliq);
    }
}
