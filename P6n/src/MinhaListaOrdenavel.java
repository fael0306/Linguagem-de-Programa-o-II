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

	public int orderbynomeaux(PessoaIMC pessoa1, PessoaIMC pessoa2) {
		return pessoa1.getNome().compareTo(pessoa2.getNome());
	}

	public void orderbynomeAZ() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (orderbynomeaux(listapessoa.get(i), listapessoa.get(j)) > 0) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public void orderbynomeZA() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (orderbynomeaux(listapessoa.get(i), listapessoa.get(j)) < 0) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public void orderbypesocrescente() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (listapessoa.get(i).getPeso() > listapessoa.get(j).getPeso()) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public void orderbypesodecrescente() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (listapessoa.get(i).getPeso() < listapessoa.get(j).getPeso()) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public void orderbyaltura() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (listapessoa.get(i).getAltura() < listapessoa.get(j).getAltura()) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public void orderbyIMC() {
		PessoaIMC aux;
		for (int i = 0; i <= listapessoa.size(); i++) {
			for (int j = i + 1; j < listapessoa.size(); j++) {
				if (listapessoa.get(i).calculaIMC(listapessoa.get(i).getPeso(),
						listapessoa.get(i).getAltura()) > listapessoa.get(j).calculaIMC(listapessoa.get(j).getPeso(),
								listapessoa.get(j).getAltura())) {
					aux = listapessoa.get(i);
					listapessoa.set(i, listapessoa.get(j));
					listapessoa.set(j, aux);
				}
			}
		}
	}

	public ArrayList<PessoaIMC> ordena(final int c) {

		if (c == a) {
			this.orderbynomeAZ();
		} else if (c == b) {
			this.orderbynomeZA();
		} else if (c == x) {
			this.orderbypesocrescente();
		} else if (c == d) {
			this.orderbyaltura();
		} else if (c == e) {
			this.orderbyIMC();
		} else {
			System.out.println("Você digitou um número inválido. Programa encerrado.");
			System.exit(0);
		}
		return listapessoa;
	}
}
