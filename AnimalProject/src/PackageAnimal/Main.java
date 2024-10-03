package PackageAnimal;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Misty");
        perro perro1 = new perro("Rex");
        perro perro2 = new perro("Buddy");

        System.out.println(gato.toString());
        gato.greets();

        System.out.println(perro1.toString());
        perro1.greets();

        perro1.greets(perro2);  
    }
}