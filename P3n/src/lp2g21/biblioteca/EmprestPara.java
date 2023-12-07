package lp2g21.biblioteca;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class EmprestPara implements Serializable {

  GregorianCalendar dataemprestimo, datadevolucao, dataDevol;
  int codigoUsuario;

  public EmprestPara(GregorianCalendar dataemprestimo, GregorianCalendar datadevolucao, int codigoUsuario) {
    this.dataemprestimo = dataemprestimo;
    this.datadevolucao = datadevolucao;
    this.codigoUsuario = codigoUsuario;
  }

  public GregorianCalendar getdataDevol() {
    return dataDevol;
  }

  public void setdataDevol(GregorianCalendar dataDevol) {
    this.dataDevol = dataDevol;
  }

  public GregorianCalendar getDataemprestimo() {
    return dataemprestimo;
  }

  public void setDataemprestimo(GregorianCalendar dataemprestimo) {
    this.dataemprestimo = dataemprestimo;
  }

  public GregorianCalendar getDatadevolucao() {
    return datadevolucao;
  }

  public void setDatadevolucao(GregorianCalendar datadevolucao) {
    this.datadevolucao = datadevolucao;
  }

  public int getCodigoUsuario() {
    return codigoUsuario;
  }

  public void setCodigoUsuario(int codigoUsuario) {
    this.codigoUsuario = codigoUsuario;
  }

  public String toString() {
    String imp;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    if (datadevolucao != null) {
      // Livro já foi devolvido
      imp = "Data de empréstimo: " + dateFormat.format(dataemprestimo.getTime()) +
             "\nData de devolução programada: " + dateFormat.format(dataDevol.getTime())  +
             "\nData de devolução: " + dateFormat.format(datadevolucao.getTime()) +
             "\nCódigo do usuário: " + codigoUsuario;
  } else {
      // Livro está pendente
      imp = "Data de empréstimo: " + dateFormat.format(dataemprestimo.getTime()) +
             "\nData de devolução programada: " + (dataDevol != null ? dateFormat.format(dataDevol.getTime()) : "Pendente") +
             "\nData de devolução: Pendente" +
             "\nCódigo do usuário: " + codigoUsuario;
  }

    return imp;
  }
}