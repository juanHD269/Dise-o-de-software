package PackageVehiculo;

public class Main {
	
    public static void main(String[] args) {
        Coche coche = new Coche("1234ABC", 4);
        System.out.println(coche);
        coche.acelerar(60);
        System.out.println(coche);

        Camion camion = new Camion("5678XYZ");
        System.out.println(camion);
        camion.acelerar(50);
        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        System.out.println(camion);
        camion.acelerar(60);
        System.out.println(camion);
    }
}