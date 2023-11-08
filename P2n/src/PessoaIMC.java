import java.text.DecimalFormat;

public abstract class PessoaIMC extends Pessoa {
  protected float peso;
  protected float altura;
  protected long numCPF;

  public PessoaIMC(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura) {
    super(nome, sobreNome, dia, mes, ano);
    this.peso = peso;
    this.altura = altura;
    this.numCPF = numCPF;
  }

  public float calculaIMC() {
    return peso / (altura * altura);
  }

  public abstract String resultIMC();

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("#.##");

    return String.format("\n\nNome: %s\nData de Nascimento: %d/%d/%d\nPeso: %s\nAltura: %s\nCPF: %d",
      getNome() + " " + getSobreNome(), getDia(), getMes(), getAno(), df.format(peso), df.format(altura), numCPF);
  }
}