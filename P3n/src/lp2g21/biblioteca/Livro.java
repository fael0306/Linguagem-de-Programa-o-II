package lp2g21.biblioteca;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Livro {
    
    String codigoLivro;
    String tituloLivro;
    String categoria;
    int qtd;
    int emprestados;
    ArrayList<EmprestPara> hist;

   

    public Livro(String codigoLivro, String tituloLivro, String categoria, int qtd, int emprestados,
            ArrayList<EmprestPara> hist) {
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.categoria = categoria;
        this.qtd = qtd;
        this.emprestados = emprestados;
        this.hist = hist;
    }

    public void empresta() throws CopiaNaoDisponivelEx {
        if(emprestados < qtd){
            emprestados++;
        }
        else{
            throw new CopiaNaoDisponivelEx("Todas as cópias estão emprestadas.");
        }
    }

    public void devolve() throws NenhumaCopiaEmprestadaEx {
        if(emprestados>0){
            emprestados--;
        }
        else{
            throw new NenhumaCopiaEmprestadaEx("Não há cópias emprestadas para devolver.");
        }
    }

    public void addUsuarioHist(GregorianCalendar datadelocacao, GregorianCalendar datadedevolucao, int codigoUsuario) {
        EmprestPara emprest2 = new EmprestPara(datadelocacao, datadedevolucao, codigoUsuario);
        hist.add(emprest2);
    }

}