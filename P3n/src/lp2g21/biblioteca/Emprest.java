package lp2g21.biblioteca;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Emprest implements Serializable {

  GregorianCalendar datadeemprestimo;
  String codigolivro;

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
    String imp;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    imp = "Data de empréstimo: " + (datadeemprestimo != null ? dateFormat.format(datadeemprestimo.getTime()) : "Pendente") +
              "\nData de devolução: " + (datadevolucao != null ? dateFormat.format(datadevolucao.getTime()) : "Pendente") +
          "\nCódigo do livro: " + codigolivro;

    return imp;
  }
}