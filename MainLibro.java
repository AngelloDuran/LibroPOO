import java.util.Scanner;

public class MainLibro {

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Ingresa el ISBN del libro: ");
        String isbn = p1.nextLine();
        System.out.println("Ingresa el Titulo del libro: ");
        String tittle = p1.nextLine();
        System.out.println("Ingresa el autor del libro: ");
        String autor = p1.nextLine();
        System.out.println("Ingresa el Numero de pagina del libro: ");
        int numPaginas = p1.nextInt();
        Libro p2 = new Libro();
        p2.isbn = isbn;
        p2.titulo = tittle;
        p2.autor = autor;
        p2.numPaginas = numPaginas;
        p2.mostrarIsbn();
        p2.mostrarTitulo();
        p2.mostrarAutor();
        p2.mostrarNumPaginas();
    }
}