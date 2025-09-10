package area_of_a_shape;

public class Circle implements Shape {
    double pi = Math.PI;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * pi * radius * radius;
    }

}
