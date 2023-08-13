public class FuncCntrd extends Funcionario {

	private int dependentes;
	private float salariofamilia;
	private float valorPorDep = 9.58F;
	public float aliquotaIR = 0.15F;

	public FuncCntrd(String nome, String cdemp, float salario, int dependentes) {
		super(nome, cdemp, salario);
	}

	public float calculaSalario() {

		float salarioliq;

		salarioliq = super.calculaSalario(aliquotaIR);

		return salarioliq;
	}

	public float calculaSalario(int dependentes) {

		float salariobase, salariofamilia = dependentes * valorPorDep;

		salariobase = salario + salariofamilia;

		calculaSalario();

		return salariobase;

	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
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
	}

	public float getAliquotaIR() {
		return aliquotaIR;
	}

	public void setAliquotaIR(float aliquotaIR) {
		this.aliquotaIR = aliquotaIR;
	}

	public String toString() {
		return String.format("Nome: %s\nCódigo: %s\nSalário-base: %s\nSalário-líquido: %s\n", super.getNome(), super.getCdemp(),
				calculaSalario(dependentes), calculaSalario());
	}

}