public class Pessoa {

	private String nome;
	private String datanascimento;

	public Pessoa(String nome, String datanascimento) {
		setNome(nome);
		setDatanascimento(datanascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
}