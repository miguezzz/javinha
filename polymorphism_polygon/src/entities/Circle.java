package entities;

public class Circle extends Polygon {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Double calculateArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
