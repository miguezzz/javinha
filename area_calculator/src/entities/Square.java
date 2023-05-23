package entities;

public class Square {
	double edge;
	public Square(double edge) {
		super();
		this.edge = edge;
	}
	
	public double squareArea() {
		return edge * edge;
	}
}
