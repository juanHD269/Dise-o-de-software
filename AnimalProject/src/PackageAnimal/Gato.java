package PackageAnimal;

class Gato extends mammal {
    public Gato(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Gato[" + super.toString() + "]";
    }
}