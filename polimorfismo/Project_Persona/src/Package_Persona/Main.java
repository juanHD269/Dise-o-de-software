package Package_Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Pérez", "12345678", "Soltero");
        Empleado empleado = new Empleado("Ana", "Gómez", "87654321", "Casada", 2020, "A101");
        Estudiante estudiante = new Estudiante("Luis", "Martínez", "23456789", "Soltero", "Matemáticas");
        Profesor profesor = new Profesor("María", "Sánchez", "34567890", "Divorciada", 2018, "B202", "Ciencias");
        PersonalServicio personalServicio = new PersonalServicio("Carlos", "Ramírez", "45678901", "Soltero", 2019, "C303", "Administración");

        System.out.println("Información de Persona:");
        persona.imprimirInformacion();
        System.out.println("\nInformación de Empleado:");
        empleado.imprimirInformacion();
        System.out.println("\nInformación de Estudiante:");
        estudiante.imprimirInformacion();
        System.out.println("\nInformación de Profesor:");
        profesor.imprimirInformacion();
        System.out.println("\nInformación de Personal de Servicio:");
        personalServicio.imprimirInformacion();
    }
}
