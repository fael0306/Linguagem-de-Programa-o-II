
public class FuncExct extends FuncCntrd {

	private float grat;

	public FuncExct(String nome, String cdemp, float salario, int dependentes, float grat) {
		super(nome, cdemp, salario, dependentes);

		// TODO Auto-generated constructor stub
	}

	public float calculaSalario() {

		float salarioliq;

		salarioliq = super.calculaSalario(aliquotaIR) + grat;

		return salarioliq;
	}

	public String toString() {
		return String.format("Nome: %s\nC�digo: %s*\nSal�rio-base: %s\nSal�rio-l�quido: %s\nGratifica��o: %s", super.getNome(),
				super.getCdemp(), calculaSalario(), grat);
	}
}
