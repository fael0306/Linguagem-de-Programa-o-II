package lp2g21.biblioteca;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Emprest implements Serializable {

  GregorianCalendar datadeemprestimo, datadevolucao;
  String codigolivro;

  public Emprest(GregorianCalendar datadeemprestimo, String codigoLivro) {
    this.datadeemprestimo = datadeemprestimo;
    this.codigolivro = codigoLivro;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

   public GregorianCalendar getDatadeemprestimo() {
    return datadeemprestimo;
  }

  public void devolverLivro() {
    this.datadevolucao = new GregorianCalendar();
  }

  public String toString() {
   return "";
  }
}