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

}
