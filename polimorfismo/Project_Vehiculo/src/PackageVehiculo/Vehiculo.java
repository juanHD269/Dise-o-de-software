package PackageVehiculo;

class Vehiculo {
    protected String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelerar(int kmh) {
        this.velocidad += kmh;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h";
    }
}

class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String matricula, int numeroPuertas) {
        super(matricula);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numeroPuertas;
    }
}

class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Remolque [Peso: " + peso + " kg]";
    }
}

class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null; // Inicialmente no tiene remolque
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int kmh) {
        super.acelerar(kmh);
        if (remolque != null && velocidad > 100) {
            System.out.println("¡El camión con remolque está yendo demasiado rápido!");
        }
    }

    @Override
    public String toString() {
        String info = super.toString();
        if (remolque != null) {
            info += ", " + remolque.toString();
        }
        return info;
    }
}