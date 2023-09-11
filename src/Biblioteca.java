import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) { livros.add(livro);}

    public void listarLivros(){
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    public static void main (String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "babva");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "sg");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();
    }
}
