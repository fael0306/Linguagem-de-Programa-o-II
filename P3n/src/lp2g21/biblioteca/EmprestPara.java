package lp2g21.biblioteca;

import java.util.GregorianCalendar;

public class EmprestPara {

    public EmprestPara(GregorianCalendar dataemprestimo, GregorianCalendar datadevolucao, int codigoUsuario) {
        this.dataemprestimo = dataemprestimo;
        this.datadevolucao = datadevolucao;
        this.codigoUsuario = codigoUsuario;
    }

    GregorianCalendar dataemprestimo, datadevolucao;
    int codigoUsuario;
    
    public GregorianCalendar getDataemprestimo() {
        return dataemprestimo;
    }

    public void setDataemprestimo(GregorianCalendar dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public GregorianCalendar getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(GregorianCalendar datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String toString(){
        String imp;

        imp = "Data de empréstimo: " + getDataemprestimo() + 
        "\nData de devolução: " + getDatadevolucao() +
        "\nCódigo do usuário: " + getCodigoUsuario();

        return imp;
    }
}
