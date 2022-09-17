public class Circle {
    double radius;
    static String colour;

    Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getArea() {
        double area = (radius * radius) * Math.PI;
        return area;
    }

    public String toString() {
        return ("areaofcircle" + getArea());
    }
}
