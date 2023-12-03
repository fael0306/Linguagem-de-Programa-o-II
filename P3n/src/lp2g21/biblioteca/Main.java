package lp2g21.biblioteca;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    private static void manutencao(){

        Biblioteca biblioteca;

        Scanner op = new Scanner(System.in);
        System.out.println("\n1 - Iniciar uma Biblioteca do zero\n2 - Carregar os arquivos da biblioteca");
        int escolha = op.nextInt();

        switch (escolha) {
            case 1:
                Hashtable<Integer, Usuario> usuarios = new Hashtable<>();
                Hashtable<String, Livro> livros = new Hashtable<>();
                biblioteca = new Biblioteca(usuarios, livros);
                biblioteca.salvaArquivo(usuarios, "usuarios");
                biblioteca.salvaArquivo(livros, "livros");
                System.out.println("\nBiblioteca criada com sucesso.");
                break;
            case 2:
                biblioteca = new Biblioteca("usuarios","livros");
                break;
            default:
                System.out.println("\nEscolha uma opção válida.");
                return;
        }

    }
    
    private static void cadastro(){
        
    }

    private static void emprestimo(){

    }

    private static void gerarRelatorio(){

    }

    public static void main(String[] args) {
        
    }    
}
