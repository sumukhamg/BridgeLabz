package area_of_a_shape;

public class App {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(10, 20);
        Shape rectangle1 = new Rectangle(20, 30);
        Shape circle1 = new Circle(2);

        System.out.println(triangle1.getArea());
        System.out.println(rectangle1.getArea());
        System.out.println(circle1.getArea());
    }
}
