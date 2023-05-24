package entities;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		return "Enter rectangle width and height: "
				+ String.format("%.2f", width)
				+ String.format("%.2f", height);
	}
}
