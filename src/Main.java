import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção que você deseja:\n 1: Adicionar Livro \n 2: Ler Livro \n 3: Alterar livro \n 4: Remover Livro \n 5: Sair.");

        while (true) {
            System.out.println("\nDigite uma opção de 1 a 5: ");
            int opcao = scanner.nextInt();

            Biblioteca biblioteca = new Biblioteca();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite o autor: ");
                    String autor = scanner.nextLine();

                    System.out.println("Digite a editora: ");
                    String editora = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, editora);
                    biblioteca.adicionarLivro(new Livro(titulo, autor, editora));
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;

            }
        }
    }
}
