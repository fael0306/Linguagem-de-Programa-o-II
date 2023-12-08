package lp2g21.biblioteca;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Emprest implements Serializable {

  GregorianCalendar datadeemprestimo, datadevolucao;
  String codigolivro;

    public Emprest(GregorianCalendar datadeemprestimo, GregorianCalendar datadevolucao, String codigolivro) {
    this.datadeemprestimo = datadeemprestimo;
    this.datadevolucao = datadevolucao;
    this.codigolivro = codigolivro;
  }

  public GregorianCalendar getDatadeemprestimo() {
    return datadeemprestimo;
  }

  public void setDatadeemprestimo(GregorianCalendar datadeemprestimo) {
    this.datadeemprestimo = datadeemprestimo;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

  public void setDatadevolucao(GregorianCalendar datadevolucao) {
    this.datadevolucao = datadevolucao;
  }

  public String getCodigolivro() {
    return codigolivro;
  }

  public void setCodigolivro(String codigolivro) {
    this.codigolivro = codigolivro;
  }

  public String toString() {
   return "";
  }
}