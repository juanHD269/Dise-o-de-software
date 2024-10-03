package PackageAnimal;

class perro extends mammal {
    public perro(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(perro another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "perro[" + super.toString() + "]";
    }
}