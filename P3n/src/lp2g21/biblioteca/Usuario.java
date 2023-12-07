package lp2g21.biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Usuario extends Pessoa implements Serializable {

  private static final long serialVersionUID = 1L;


  String endereco;
  int codigoUsuario;
  ArrayList < Emprest > Hist;

  public Usuario() {}

  public Usuario(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura,
    String endereco, int codigoUsuario) {
    super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
    this.endereco = endereco;
    this.codigoUsuario = codigoUsuario;
    this.Hist = new ArrayList<>();
  }

  public void addLivroHist(GregorianCalendar datadelocacao, String codLivro) {
    Emprest emprestimo = new Emprest(datadelocacao, codLivro);
    Hist.add(emprestimo);
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getCodigoUsuario() {
    return codigoUsuario;
  }

  public void setCodigoUsuario(int codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public ArrayList < Emprest > getHist() {
    return Hist;
  }

  public void setHist(ArrayList < Emprest > hist) {
    Hist = hist;
  }

  public String toString() {
    String imp;

    imp = super.toString() +
      "\nEndereço " + getEndereco() +
      "\nCódigo do usuário: " + getCodigoUsuario() +
      "\nHistórico: ";

    ArrayList<Emprest> historico = getHist();
    for (Emprest historico1 : historico) {
       imp = imp + historico1.toString() + "\n";
    }

    return imp;
  }
}