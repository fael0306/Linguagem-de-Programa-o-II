package lp2g21.biblioteca;

import java.util.GregorianCalendar;

public class Emprest {

  GregorianCalendar datadeemprestimo;

  public GregorianCalendar getDatadeemprestimo() {
    return datadeemprestimo;
  }

  GregorianCalendar datadevolucao;

  public Emprest(GregorianCalendar datadeemprestimo, String codigoLivro) {
    this.datadeemprestimo = datadeemprestimo;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

  public void devolverLivro() {
    this.datadevolucao = new GregorianCalendar();
  }

  public String toString() {
    String imp;

    imp = "Data de empréstimo: " + getDatadeemprestimo() +
      "\nData de devolução: " + getDatadevolucao();

    return imp;
  }
}