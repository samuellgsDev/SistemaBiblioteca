import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String titulo = scanner.next();

        System.out.println("Digite o autor: ");
        String autor = scanner.next();

        System.out.println("Digite a editora: ");
        String editora = scanner.next();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro(titulo, autor, editora));

        biblioteca.listarLivros();
    }

}
