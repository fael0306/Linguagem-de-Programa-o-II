public class Homem extends Pessoa {

  public Homem(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura) {
    super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
  }

  public Homem(String nome, String sobreNome, int dia, int mes, int ano) {
    super(nome, sobreNome, dia, mes, ano);
  }

  public String toString() {
    String retorno, infopessoa;

    infopessoa = super.toString();
    
    retorno = infopessoa+"\nGênero: Masculino";

    return retorno;
  }
}