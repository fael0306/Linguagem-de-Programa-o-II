public class Funcionario {

	public String nome, cdemp;
	public float salario;
	public float salarioliq;

	public Funcionario(String nome, String cdemp, float salario) {
		float salarioliq = salario;
	}

	public float calculaSalario(float desconto) {

		salarioliq = salario * (1 - (desconto / 100));

		return salarioliq;
	}

	//public String toString() {
	//	return String.format("Nome: %s\nCódigo: %s\nSalário-base: %s", cdemp, salario);
	//}

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

	public void setSalarioliq(float salarioliq) {
		this.salarioliq = salarioliq;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
