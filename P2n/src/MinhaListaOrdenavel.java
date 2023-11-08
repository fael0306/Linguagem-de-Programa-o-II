import java.util.*;

public class MinhaListaOrdenavel {

  private ArrayList < PessoaIMC > listapessoa = new ArrayList < PessoaIMC > ();

  public void add(PessoaIMC p) {
    listapessoa.add(p);
  }

  public PessoaIMC get(int index) {
    return listapessoa.get(index);
  }

   // Alfabética (A-Z)
  public Comparator < PessoaIMC > nomeAZC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p1.getNome().compareTo(p2.getNome());
    }
  };

  // Alfabética (Z-A)
  public Comparator < PessoaIMC > nomeZAC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p2.getNome().compareTo(p1.getNome());
    }
  };

  // Menor peso
  public Comparator<PessoaIMC> pesoC = new Comparator<PessoaIMC>() {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
        return Double.compare(p1.peso, p2.peso);
    }
};

// Maior peso
  public Comparator<PessoaIMC> peso2C = new Comparator<PessoaIMC>() {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
        return Double.compare(p2.peso, p1.peso);
    }
};

  // Menor altura
  public Comparator<PessoaIMC> alturaC = new Comparator<PessoaIMC>() {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
        return Double.compare(p1.altura, p2.altura);
    }
};

  // Maior altura
  public Comparator<PessoaIMC> altura2C = new Comparator<PessoaIMC>() {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
        return Double.compare(p2.altura, p1.altura);
    }
};

// Menor IMC
public Comparator<PessoaIMC> IMCC = new Comparator<PessoaIMC>() {
  public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p1.calculaIMC(), p2.calculaIMC());
  }
};

// Maior IMC
public Comparator<PessoaIMC> IMC2C = new Comparator<PessoaIMC>() {
  public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p2.calculaIMC(), p1.calculaIMC());
  }
};

  public ArrayList < PessoaIMC > ordena(final int c) {

    Comparator < PessoaIMC > comparador = null;

    switch (c) {
    case 1:
      comparador = nomeAZC;
      break;
    case 2:
      comparador = nomeZAC;
      break;
    case 3:
      comparador = pesoC;
      break;
    case 4:
      comparador = peso2C;
      break;
    case 5:
      comparador = alturaC;
      break;
    case 6:
      comparador = altura2C;
      break;
    case 7:
      comparador = IMCC;
      break;
    case 8:
      comparador = IMC2C;
      break;
    }

    if (comparador != null) {
      Collections.sort(listapessoa, comparador);
      return listapessoa;
    }
    // Tratar este erro posteriormente
    else {
      System.out.println("Você digitou uma constante inválida. Programa encerrado.");
      System.exit(0);
      return null;
    }
  }
}
