package Package_FiguraGeometrica;

abstract class FiguraGeometrica {
    protected int valor1;

    public abstract double getArea();
    public abstract double getPerimetro();

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
}

class Circulo extends FiguraGeometrica {
    public Circulo(int radio) {
        this.valor1 = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * valor1;
    }
}

class Cuadrado extends FiguraGeometrica {
    public Cuadrado(int lado) {
        this.valor1 = lado;
    }

    @Override
    public double getArea() {
        return valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return 4 * valor1;
    }
}

class Rectangulo extends FiguraGeometrica {
    private int valor2;

    public Rectangulo(int base, int altura) {
        this.valor1 = base;
        this.valor2 = altura;
    }

    @Override
    public double getArea() {
        return valor1 * valor2;
    }

    @Override
    public double getPerimetro() {
        return 2 * (valor1 + valor2);
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}

class Triangulo extends FiguraGeometrica {
    private int valor2;

    public Triangulo(int base, int altura) {
        this.valor1 = base;
        this.valor2 = altura;
    }

    @Override
    public double getArea() {
        return (valor1 * valor2) / 2.0;
    }

    @Override
    public double getPerimetro() {
        return 3 * valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}

class Cubo extends Cuadrado {
    public Cubo(int lado) {
        super(lado);
    }

    @Override
    public double getArea() {
        return 6 * super.getArea();
    }
}