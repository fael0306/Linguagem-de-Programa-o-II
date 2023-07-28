public class FuncExct extends FuncCntrd {
    private float grat;

    public FuncExct(String nome, String cdemp, float salario, int dependentes, float grat) {
        super(nome, cdemp, salario, dependentes);
        this.grat = grat;
    }

    public float getGrat() {
        return grat;
    }

    public void setGrat(float grat) {
        this.grat = grat;
    }

    public float calculaSalario(float aliquotaIR) {
        float salarioliq = super.calculaSalario(aliquotaIR) + grat;
        return salarioliq;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCódigo: %s\nSalário-base: %.2f\nSalário-líquido: %.2f\nGratificação: %.2f",
                getNome(), getCdemp(), getSalario(), calculaSalario(aliquotaIR), grat);
    }
}
