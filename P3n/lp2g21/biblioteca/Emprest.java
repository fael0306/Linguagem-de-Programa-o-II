package lp2g21.biblioteca;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Emprest implements Serializable {

  GregorianCalendar datadeemprestimo, dataDevol;
  String codigolivro;

  public GregorianCalendar getDataDevol() {
    return dataDevol;
  }

  public void setDataDevol(GregorianCalendar dataDevol) {
    this.dataDevol = dataDevol;
  }

  public GregorianCalendar getDatadeemprestimo() {
    return datadeemprestimo;
  }

  GregorianCalendar datadevolucao;

  public Emprest(GregorianCalendar datadeemprestimo, String codigoLivro) {
    this.datadeemprestimo = datadeemprestimo;
    this.codigolivro = codigoLivro;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

  public void devolverLivro() {
    this.datadevolucao = new GregorianCalendar();
  }

  public String toString() {
   return "";
  }
}