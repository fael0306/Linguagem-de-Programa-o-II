package lp2g21.biblioteca;

import java.util.GregorianCalendar;

public class Pessoa {
  String nome;
  String sobreNome;
  int dia;
  int mes;
  int ano;
  long numCPF;
  float peso;
  float altura;
  int idade;
  static int cont = 0;

  public static int numPessoas() {
    return cont;
  }

  public int getIdade() {
    int idade, mesnasc, mesatual, dianasc, diaatual;
    GregorianCalendar hoje = new GregorianCalendar();
    GregorianCalendar dataNasc = new GregorianCalendar(ano, mes - 1, dia);

    idade = hoje.get(GregorianCalendar.YEAR) - dataNasc.get(GregorianCalendar.YEAR);

    mesnasc = dataNasc.get(GregorianCalendar.MONTH);
    mesatual = hoje.get(GregorianCalendar.MONTH);

    dianasc = dataNasc.get(GregorianCalendar.DAY_OF_MONTH);
    diaatual = hoje.get(GregorianCalendar.DAY_OF_MONTH);

    if (mesnasc > mesatual || (mesnasc == mesatual && dianasc > diaatual)) {
      idade--;
    }

    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public Pessoa(String nome, String sobreNome, int dia, int mes, int ano, long numCPF, float peso, float altura) {
    this.nome = nome;
    this.sobreNome = sobreNome;
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.numCPF = numCPF;
    this.peso = peso;
    this.altura = altura;
    cont++;
  }

  public Pessoa(String nome, String sobreNome, int dia, int mes, int ano) {
    this.nome = nome;
    this.sobreNome = sobreNome;
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    cont++;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobreNome() {
    return sobreNome;
  }

  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public long getNumCPF() {
    return numCPF;
  }

  public void setNumCPF(long numCPF) {
    this.numCPF = numCPF;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public String toString() {
    String retorno;

    if (getNumCPF() == 0 || getPeso() == 0.0 || getAltura() == 0.0) {
      retorno = "Nome: " + getNome() +
        "\nSobrenome: " + getSobreNome() +
        "\nIdade: " + getIdade();
    } else {
      // Graças a CPF's que possam começar com 0, este if se faz necessário
      // Apenas posso usar o método toString após validar o CPF, de qualquer forma
      if (Long.toString(getNumCPF()).length() < 11) {
        retorno = "Nome: " + getNome() +
          "\nSobrenome: " + getSobreNome() +
          "\nIdade: " + getIdade() +
          "\nCPF: 0" + getNumCPF() +
          "\nPeso: " + getPeso() +
          "\nAltura: " + getAltura();
      } else {
        retorno = "Nome: " + getNome() +
          "\nSobrenome: " + getSobreNome() +
          "\nIdade: " + getIdade() +
          "\nCPF: " + getNumCPF() +
          "\nPeso: " + getPeso() +
          "\nAltura: " + getAltura();
      }
    }
    return retorno;
  }
}