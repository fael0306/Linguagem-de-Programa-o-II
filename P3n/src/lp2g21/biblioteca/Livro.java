package lp2g21.biblioteca;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Livro {

  String codigoLivro;
  String tituloLivro;
  String categoria;
  int qtd;
  int emprestados;
  ArrayList < EmprestPara > hist;

  public String getCodigoLivro() {
    return codigoLivro;
  }

  public void setCodigoLivro(String codigoLivro) {
    this.codigoLivro = codigoLivro;
  }

  public String getTituloLivro() {
    return tituloLivro;
  }

  public void setTituloLivro(String tituloLivro) {
    this.tituloLivro = tituloLivro;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }

  public int getEmprestados() {
    return emprestados;
  }

  public void setEmprestados(int emprestados) {
    this.emprestados = emprestados;
  }

  public ArrayList < EmprestPara > getHist() {
    return hist;
  }

  public void setHist(ArrayList < EmprestPara > hist) {
    this.hist = hist;
  }

  public Livro(String codigoLivro, String tituloLivro, String categoria, int qtd, int emprestados,
    ArrayList < EmprestPara > hist) {
    this.codigoLivro = codigoLivro;
    this.tituloLivro = tituloLivro;
    this.categoria = categoria;
    this.qtd = qtd;
    this.emprestados = emprestados;
    this.hist = hist;
  }

  public void empresta() throws CopiaNaoDisponivelEx {
    if (emprestados < qtd) {
      emprestados++;
    } else {
      throw new CopiaNaoDisponivelEx("Todas as cópias estão emprestadas.");
    }
  }

  public void devolve() throws NenhumaCopiaEmprestadaEx {
    if (emprestados > 0) {
      emprestados--;
    } else {
      throw new NenhumaCopiaEmprestadaEx("Não há cópias emprestadas para devolver.");
    }
  }

  public void addUsuarioHist(GregorianCalendar datadelocacao, GregorianCalendar datadedevolucao, int codigoUsuario) {
    EmprestPara emprest2 = new EmprestPara(datadelocacao, datadedevolucao, codigoUsuario);
    hist.add(emprest2);
  }

  public String toString() {
    String imp;

    imp = "Código do livro: " + getCodigoLivro() +
      "\nTítulo do livro: " + getTituloLivro() +
      "\nCategoria do livro: " + getCategoria() +
      "\nQuantidade total: " + getQtd() +
      "\nQuantidade emprestado: " + getEmprestados() +
      "\nHistórico: " + getHist();

    return imp;
  }

}