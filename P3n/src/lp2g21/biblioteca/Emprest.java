package lp2g21.biblioteca;

import java.util.GregorianCalendar;

public class Emprest {

    GregorianCalendar datadeemprestimo;
    GregorianCalendar datadevolucao;

    public Emprest(GregorianCalendar datadeemprestimo, String codigoLivro) {
        this.datadeemprestimo = datadeemprestimo;
    }

     public GregorianCalendar getDatadevolucao() {
        return datadevolucao;
    }

    public void devolverLivro(){
        this.datadevolucao = new GregorianCalendar();
    }
    
}
