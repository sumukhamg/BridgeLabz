package shapes;

public class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 2 * Math.PI * radius * radius;
	}
}
