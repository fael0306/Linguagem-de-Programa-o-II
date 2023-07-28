import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinhaListaOrdenavel {

    private final List<PessoaIMC> listaPessoa = new ArrayList<>();

    public void add(PessoaIMC pessoa) {
        listaPessoa.add(pessoa);
    }

    public PessoaIMC get(int index) {
        return listaPessoa.get(index);
    }

    private int compareByNome(PessoaIMC pessoa1, PessoaIMC pessoa2) {
        return pessoa1.getNome().compareTo(pessoa2.getNome());
    }

    private int compareByPeso(PessoaIMC pessoa1, PessoaIMC pessoa2) {
        return Double.compare(pessoa1.getPeso(), pessoa2.getPeso());
    }

    private int compareByAltura(PessoaIMC pessoa1, PessoaIMC pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }

    private int compareByIMC(PessoaIMC pessoa1, PessoaIMC pessoa2) {
        return Double.compare(pessoa1.calculaIMC(), pessoa2.calculaIMC());
    }

    private void sortListByComparator(Comparator<PessoaIMC> comparator) {
        Collections.sort(listaPessoa, comparator);
    }

    public void orderByNomeAZ() {
        sortListByComparator(this::compareByNome);
    }

    public void orderByNomeZA() {
        sortListByComparator(Collections.reverseOrder(this::compareByNome));
    }

    public void orderByPesoCrescente() {
        sortListByComparator(this::compareByPeso);
    }

    public void orderByPesoDecrescente() {
        sortListByComparator(Collections.reverseOrder(this::compareByPeso));
    }

    public void orderByAltura() {
        sortListByComparator(this::compareByAltura);
    }

    public void orderByIMC() {
        sortListByComparator(this::compareByIMC);
    }

    public ArrayList<PessoaIMC> ordena(int opcao) {
        switch (opcao) {
            case 1:
                orderByNomeAZ();
                break;
            case 2:
                orderByNomeZA();
                break;
            case 3:
                orderByPesoCrescente();
                break;
            case 4:
                orderByAltura();
                break;
            case 5:
                orderByIMC();
                break;
            default:
                System.out.println("Opção inválida. Programa encerrado.");
                System.exit(0);
        }
        return new ArrayList<>(listaPessoa);
    }
}
