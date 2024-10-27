package Package_Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

// Interfaz Prestable
interface Prestable {
    void prestar();
    void devolver();
    boolean prestado();
}

// Clase Publicacion
abstract class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public abstract String toString();
}

// Clase Libro que implementa Prestable
class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Libro [Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion +
                ", Prestado: " + (prestado ? "Sí" : "No") + "]";
    }
}

// Clase Revista
class Revista extends Publicacion {
    private int numero;

    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revista [Código: " + codigo + ", Título: " + titulo + ", Año: " + anioPublicacion +
                ", Número: " + numero + "]";
    }
}

// Clase principal para menú interactivo
public class Biblioteca {
    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Mostrar Publicaciones");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    agregarRevista();
                    break;
                case 3:
                    prestarLibro();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 5:
                    mostrarPublicaciones();
                    break;
                case 6:
                    System.out.println("¡Gracias por usar la biblioteca!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);
    }

    // Métodos para interactuar con el usuario
    private static void agregarLibro() {
        System.out.print("Ingrese el código del libro: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        publicaciones.add(new Libro(codigo, titulo, anio));
        System.out.println("Libro agregado con éxito.");
    }

    private static void agregarRevista() {
        System.out.print("Ingrese el código de la revista: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el título de la revista: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el número de la revista: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        publicaciones.add(new Revista(codigo, titulo, anio, numero));
        System.out.println("Revista agregada con éxito.");
    }

    private static void prestarLibro() {
        System.out.print("Ingrese el código del libro a prestar: ");
        String codigo = scanner.nextLine();

        for (Publicacion pub : publicaciones) {
            if (pub instanceof Libro && pub.getCodigo().equals(codigo)) {
                ((Libro) pub).prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado o ya prestado.");
    }

    private static void devolverLibro() {
        System.out.print("Ingrese el código del libro a devolver: ");
        String codigo = scanner.nextLine();

        for (Publicacion pub : publicaciones) {
            if (pub instanceof Libro && pub.getCodigo().equals(codigo)) {
                ((Libro) pub).devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado o no estaba prestado.");
    }

    private static void mostrarPublicaciones() {
        if (publicaciones.isEmpty()) {
            System.out.println("No hay publicaciones en la biblioteca.");
        } else {
            for (Publicacion pub : publicaciones) {
                System.out.println(pub);
            }
        }
    }
}
