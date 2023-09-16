import java.time.LocalDate;
import java.time.Period;


public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private LocalDate datanascimento;
	private float peso;
	private float altura;
	private char genero;
	private static int cont=0;
	private String status;
	
	private Pessoa pai;
	private Pessoa mae;
	
	public String status() {
		return nome +" está "+ status;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}
	
	public String getstatus() {
		return status;
	}
	
	private int idade() {
		LocalDate hoje = LocalDate.now();
		LocalDate nascimento = datanascimento;
		
		Period idade = Period.between(nascimento, hoje);
		
		return idade.getYears();
	}
	
	public Pessoa(String nome){
		cont++;
		setNome(nome);
	}

	public Pessoa(){
		cont++;
	}

	public Pessoa(String nome, String sobrenome, LocalDate datanascimento, float peso, float altura, char genero) {
		cont++;
		setNome(nome);
		setSobrenome(sobrenome);
		setDatanascimento(datanascimento);
		setPeso(peso);
		setAltura(altura);
		setGenero(genero);
	}
	
	public String toString() {
		if(datanascimento!=null){
		return String.format("Nome: %s %s\nIdade: %s\nPeso: %s\nAltura: %s\nGênero: %s",nome, sobrenome, idade(), peso, altura, genero);
	}
	else{
		return String.format("Nome: %s %s\nPeso: %s\nAltura: %s\nGênero: %s",nome, sobrenome, peso, altura, genero);
	}
}
	
	public static String cont(){
		return "Existem "+cont+" pessoas";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		if(peso<2.5) {
			System.out.println(peso+"? Por favor, entre com um peso coerente.");
		}
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
		if(altura>=2.50 || altura<0.50){
			System.out.println(altura+"? Tem certeza que possui esta altura?");
		}
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
}