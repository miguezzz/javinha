package entities;

public class Triangle extends Polygon {

	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Double calculateArea() {
		return (width * height) / 2;
	}
}
