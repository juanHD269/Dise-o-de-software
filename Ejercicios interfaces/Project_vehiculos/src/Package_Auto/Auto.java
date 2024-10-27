package Package_Auto;


class Vehiculo {
 protected int gasolina;
 protected String tipo;

 public Vehiculo(int gasolinaInicial) {
     this.gasolina = gasolinaInicial;
 }

 public void Conducir() {
     String articulo = tipo.equals("auto") ? "El" : "La";
     if (gasolina > 0) {
         System.out.println(articulo + " " + tipo + " está conduciendo");
     } else {
         System.out.println(articulo + " " + tipo + " no tiene suficiente gasolina");
     }
 }

 public boolean Retanquear(int cantidad) {
     if (cantidad > 0) {
         gasolina += cantidad;
         System.out.println("Se agregaron " + cantidad + " galones de gasolina. Total: " + gasolina);
         return true;
     }
     return false;
 }
}


class Moto extends Vehiculo {
 public Moto(int gasolinaInicial) {
     super(gasolinaInicial);
     this.tipo = "motocicleta";
 }
}


class Auto extends Vehiculo {
 public Auto(int gasolinaInicial) {
     super(gasolinaInicial);
     this.tipo = "auto";
 }
}