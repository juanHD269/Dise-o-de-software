package PackageEmpleado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Secretario secretario = new Secretario("Ana Pérez", 1500);

        Vendedor vendedor1 = new Vendedor("Carlos López", 2000, 300);
        Vendedor vendedor2 = new Vendedor("Lucía Martínez", 2100, 400);

        ArrayList<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

        JefeDeZona jefeDeZona = new JefeDeZona("Luis Fernández", 5000, secretario, vendedores, "BMW");

        jefeDeZona.imprimir();

        jefeDeZona.incrementarSalario(10);
        System.out.println("\nDespués del incremento salarial:");
        jefeDeZona.imprimir();

        Vendedor vendedor3 = new Vendedor("Laura Ramírez", 2200, 350);
        jefeDeZona.altaVendedor(vendedor3);
        System.out.println("\nDespués de agregar un nuevo vendedor:");
        jefeDeZona.imprimir();
    }
}
