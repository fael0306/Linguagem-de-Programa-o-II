public class FuncCntrd extends Funcionario {
    private int dependentes;
    private float salariofamilia;
    private float valorPorDep = 9.58F;
    public float aliquotaIR = 0.15F;

    public FuncCntrd(String nome, String cdemp, float salario, int dependentes) {
        super(nome, cdemp, salario);
        this.dependentes = dependentes;
        calcularSalario();
    }

    public float calculaSalario() {
        salariofamilia = dependentes * valorPorDep;
        float salariobase = super.getSalario() + salariofamilia;
        float salarioliq = salariobase * (1 - aliquotaIR);
        return salarioliq;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
        calcularSalario(); // Recalcula o salário líquido quando o número de dependentes é modificado
    }

    public float getSalariofamilia() {
        return salariofamilia;
    }

    public void setSalariofamilia(float salariofamilia) {
        this.salariofamilia = salariofamilia;
    }

    public float getValorPorDep() {
        return valorPorDep;
    }

    public void setValorPorDep(float valorPorDep) {
        this.valorPorDep = valorPorDep;
        calcularSalario(); // Recalcula o salário líquido quando o valor do salário família é modificado
    }

    public float getAliquotaIR() {
        return aliquotaIR;
    }

    public void setAliquotaIR(float aliquotaIR) {
        this.aliquotaIR = aliquotaIR;
        calcularSalario(); // Recalcula o salário líquido quando a alíquota de IR é modificado
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCódigo: %s\nSalário-base: %.2f\nSalário-líquido: %.2f\n", getNome(), getCdemp(), calculaSalario(), getSalario());
    }
}
