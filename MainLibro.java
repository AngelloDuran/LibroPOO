import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {

        {
            Scanner p1 = new Scanner(System.in);
            System.out.println("Ingresa el ISBN del libro: ");
            String isbn = p1.nextLine();
            System.out.println("Ingresa el Titulo del libro: ");
            String titulo = p1.nextLine(); // Se corrigió el nombre de la variable "tittle" a "titulo"
            System.out.println("Ingresa el autor del libro: ");
            String autor = p1.nextLine();
            System.out.println("Ingresa el Numero de pagina del libro: ");
            int numPaginas = p1.nextInt();
            p1.nextLine(); // Se agrega una llamada a nextLine() para consumir el salto de línea pendiente
            Libro p2 = new Libro();
            p2.setIsbn(isbn);
            p2.setTitulo(titulo);
            p2.setAutor(autor);
            p2.setNumPaginas(numPaginas);
            p2.mostrarIsbn();
            p2.mostrarTitulo();
            p2.mostrarAutor();
            p2.mostrarNumPaginas();
            System.out.println(p2.toString());

        }
    }
}