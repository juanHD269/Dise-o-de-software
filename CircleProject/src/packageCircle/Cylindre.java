package packageCircle;

public class Cylindre extends Circle {

    private double height = 1.0;

    public Cylindre() {

    }

    public Cylindre(double radius) {
        super(radius);
    }

    public Cylindre(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylindre(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + ", radius=" + getRadius() + ", color=" + getColor() + "]";
    }
}