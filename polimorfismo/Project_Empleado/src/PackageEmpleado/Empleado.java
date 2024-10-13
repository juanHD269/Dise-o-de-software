package PackageEmpleado;

import java.util.List;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    public void incrementarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }
}

class Secretario extends Empleado {
    public Secretario(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario");
    }
}

class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salario, double comision) {
        super(nombre, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor");
        System.out.println("Comisión: " + comision);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(porcentaje);
        comision += comision * porcentaje / 100;
    }
}

class JefeDeZona extends Empleado {
    private Secretario secretario;
    private List<Vendedor> vendedores;
    private String coche;

    public JefeDeZona(String nombre, double salario, Secretario secretario, List<Vendedor> vendedores, String coche) {
        super(nombre, salario);
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona");
        System.out.println("Coche: " + coche);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(porcentaje + 20);
    }

    public void altaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void bajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }
}
