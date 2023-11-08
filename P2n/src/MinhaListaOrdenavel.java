import java.util.*;

public class MinhaListaOrdenavel {

  private ArrayList < PessoaIMC > listapessoa = new ArrayList < PessoaIMC > ();

  public void add(PessoaIMC p) {
    listapessoa.add(p);
  }

  public PessoaIMC get(int index) {
    return listapessoa.get(index);
  }

  // Nome (A-Z)
  public Comparator < PessoaIMC > nomeAZC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p1.getNome().compareTo(p2.getNome());
    }
  };

  // Nome (Z-A)
  public Comparator < PessoaIMC > nomeZAC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p2.getNome().compareTo(p1.getNome());
    }
  };

  // Sobrenome (A-Z)
  public Comparator < PessoaIMC > sobrenomeAZC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p1.getSobreNome().compareTo(p2.getSobreNome());
    }
  };

  // Sobrenome (Z-A)
  public Comparator < PessoaIMC > sobrenomeZAC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p2.getSobreNome().compareTo(p1.getSobreNome());
    }
  };

  // Menor peso
  public Comparator < PessoaIMC > pesoC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p1.peso, p2.peso);
    }
  };

  // Maior peso
  public Comparator < PessoaIMC > peso2C = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p2.peso, p1.peso);
    }
  };

  // Menor altura
  public Comparator < PessoaIMC > alturaC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p1.altura, p2.altura);
    }
  };

  // Maior altura
  public Comparator < PessoaIMC > altura2C = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p2.altura, p1.altura);
    }
  };

  // Menor IMC
  public Comparator < PessoaIMC > IMCC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p1.calculaIMC(), p2.calculaIMC());
    }
  };

  // Maior IMC
  public Comparator < PessoaIMC > IMC2C = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Double.compare(p2.calculaIMC(), p1.calculaIMC());
    }
  };

  // Menor CPF
  public Comparator < PessoaIMC > CPFC = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Long.compare(p1.numCPF, p2.numCPF);
    }
  };

  // Maior CPF
  public Comparator < PessoaIMC > CPFC2 = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return Long.compare(p2.numCPF, p1.numCPF);
    }
  };

  // Gênero A-Z
  // Masculino vem primeiro, pois começa com H de Homem
  public Comparator < PessoaIMC > Genero = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p1.getClass().getName().compareTo(p2.getClass().getName());
    }
  };

  // Gênero Z-A
  // Feminino vem primeiro, pois começa com M de Mulher
  public Comparator < PessoaIMC > Genero2 = new Comparator < PessoaIMC > () {
    public int compare(PessoaIMC p1, PessoaIMC p2) {
      return p2.getClass().getName().compareTo(p1.getClass().getName());
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
      comparador = sobrenomeAZC;
      break;
    case 4:
      comparador = sobrenomeZAC;
      break;
    case 5:
      comparador = pesoC;
      break;
    case 6:
      comparador = peso2C;
      break;
    case 7:
      comparador = alturaC;
      break;
    case 8:
      comparador = altura2C;
      break;
    case 9:
      comparador = IMCC;
      break;
    case 10:
      comparador = IMC2C;
      break;
    case 11:
      comparador = CPFC;
      break;
    case 12:
      comparador = CPFC2;
      break;
    case 13:
      comparador = Genero;
      break;
    case 14:
      comparador = Genero2;
      break;
    }

    Collections.sort(listapessoa, comparador);
    return listapessoa;
  }
}