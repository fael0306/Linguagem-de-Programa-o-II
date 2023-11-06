import java.util.*;

public class MinhaListaOrdenavel {

	final int a = 1;
	final int b = 2;
	final int x = 3;
	final int d = 4;
	final int e = 5;

	private ArrayList<PessoaIMC> listapessoa = new ArrayList<PessoaIMC>();

	public void add(PessoaIMC p) {
		listapessoa.add(p);
	}

	public PessoaIMC get(int index) {
		return listapessoa.get(index);
	}

	public Comparator<PessoaIMC> pesoC = new Comparator<PessoaIMC>() {
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return (int) Math.round(p2.getPeso() - p1.getPeso());
        }
    };

	public Comparator<PessoaIMC> nomeAZC = new Comparator<PessoaIMC>() {
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return p1.getNome().compareTo(p2.getNome());
        }
    };

	public Comparator<PessoaIMC> nomeZAC = new Comparator<PessoaIMC>() {
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return p2.getNome().compareTo(p1.getNome());
        }
    };

	public Comparator<PessoaIMC> alturaC = new Comparator<PessoaIMC>() {
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return (int) Math.round(p2.getAltura() - p1.getAltura());
        }
    };

	public Comparator<PessoaIMC> IMCC = new Comparator<PessoaIMC>() {
        public int compare(PessoaIMC p1, PessoaIMC p2) {
            return (int) Math.round(p2.calculaIMC()-p1.calculaIMC());
        }
    };

	public ArrayList<PessoaIMC> ordena(final int c) {

		Comparator<PessoaIMC> comparador = null;

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
				comparador = alturaC;
				break;
			case 5:
				comparador = IMCC;
				break;
        }

		if(comparador!=null){
			Collections.sort(listapessoa,comparador);
			return listapessoa;
		}
		// Tratar este erro posteriormente
		else{
			System.out.println("Você digitou uma constante inválida. Programa encerrado.");
            System.exit(0);
            return null;
		}
	}
}
