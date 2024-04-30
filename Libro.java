public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numpaginas;

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
        System.out.println("Este es el numero de pagina del libro: " + numpaginas);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numpaginas;
    }

    public void setNumPaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numpaginas + "]";
    }

}