package entities;

public class Circle {
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double circleArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

}
