package PackageAnimal;

class mammal extends Animal {
    public mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "mammal[" + super.toString() + "]";
    }
}