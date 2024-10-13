package PackageInclucion;

public class PolimorfismoInclucion {
    private int horasTrabajadas;
    private double sueldoPorHora;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }
}

class EmpleadoSinHorasExtras extends PolimorfismoInclucion {
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}

class EmpleadoConHorasDobles extends PolimorfismoInclucion {
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 2;
    }
}

class EmpleadoConHorasTriples extends PolimorfismoInclucion {
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 3;
    }
}
