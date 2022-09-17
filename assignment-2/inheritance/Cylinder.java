public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius, colour);
        this.height = height;
    }

    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }

    public String toString() {
        return ("volumeofcylinder" + getVolume());

    }

}