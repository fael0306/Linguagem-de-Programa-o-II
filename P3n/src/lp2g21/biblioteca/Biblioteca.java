package lp2g21.biblioteca;

import java.util.Hashtable;

public class Biblioteca {
    Hashtable<Integer, Usuario> usuarios;
    Hashtable<Integer, Livro > livros;

    public Biblioteca(Hashtable<Integer, Usuario> usuarios, Hashtable<Integer, Livro> livros) {
        this.usuarios = usuarios;
        this.livros = livros;
    }

    public Biblioteca(String arquivoUsuarios, String arquivoLivros){
    }


}
