package PackagePolimorfismoSobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado();
        Figura circunferencia = new Circunferencia();
        Figura triangulo = new Triangulo();

        cuadrado.dibujar();
        circunferencia.dibujar();
        triangulo.dibujar();
    }
}

abstract class Figura {
    abstract void dibujar();
}

class Cuadrado extends Figura {
    void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }
}

class Circunferencia extends Figura {
    void dibujar() {
        System.out.println("Dibujando una Circunferencia");
    }
}

class Triangulo extends Figura {
    void dibujar() {
        System.out.println("Dibujando un Triángulo");
    }
}
