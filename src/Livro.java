public class Livro {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo; //this é usado para acessar o atributo da instância atual
        this.autor = autor;
        this.editora = editora;
    }
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getEditora() {return editora;}

    public String toString() { //toString é usado para representar o livro em formatoi de string
    return  "Livro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", editora='" + editora +'}';
    }
}