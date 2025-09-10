package shapes;

public class Main {
	public static void main(String args[]) {
		Shape triangle1 = new Triangle(10, 20);
		Shape rectangle1 = new Rectangle(20, 30);
		Shape circle1 = new Circle(2);

		System.out.println("Area of triangle: " + triangle1.getArea());
		System.out.println("Area of rectangle: " + rectangle1.getArea());
		System.out.println("Area of Circle: " + circle1.getArea());
	}
}
