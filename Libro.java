public class Libro {
    String isbn;
    String titulo;
    String autor;
    int numPaginas;

    public void mostrarIsbn() {
        System.out.println("Este es el ISBN del libro:  " + isbn);
    }

    public void mostrarTitulo() {
        System.out.println("Este es el titulo del libro: " + titulo);
    }

    public void mostrarAutor() {
        System.out.println("Este es el autor del libro: " + autor);
    }

    public void mostrarNumPaginas() {
        System.out.println("Este es el numero de pagina del libro: " + numPaginas);
    }

}