package lp2g21.biblioteca;

import java.util.ArrayList;

public class Livro {
    
    String codigoLivro;
    String tituloLivro;
    String categoria;
    int qtd;
    int emprestados;
    ArrayList<EmprestPara> Hist;

    public Livro(String codigoLivro, String tituloLivro, String categoria, int qtd, int emprestados) {
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.categoria = categoria;
        this.qtd = qtd;
        this.emprestados = emprestados;
    }

    public void empresta() throws CopiaNaoDisponivelEx{
        if(emprestados < qtd){
            EmprestPara emprest = EmprestPara();
            Hist.add(emprest);
            emprestados++;
        }
        else{
            throw new CopiaNaoDisponivelEx("Todas as cópias estão emprestadas.");
        }
    }

    public void devolve() throws NenhumaCopiaEmprestadaEx{
        if(emprestados>0){
            emprestados--;
        }
        else{
            throw new NenhumaCopiaEmprestadaEx("Não há cópias emprestadas para devolver.");
        }
    }

}
