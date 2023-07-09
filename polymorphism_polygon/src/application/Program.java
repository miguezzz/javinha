package application;

import entities.Circle;
import entities.Complex_Polygon;
import entities.Polygon;
import entities.Rectangle;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Polygon circle = new Circle(5.0);
		Polygon rectangle = new Rectangle(10.0, 2.0);
		Polygon triangle = new Triangle(3.0, 4.0);

		System.out.println("Circle area: " + circle.calculateArea());
		System.out.println("Rectangle area: " + rectangle.calculateArea());
		System.out.println("Triangle area: " + triangle.calculateArea());

		Complex_Polygon complexPolygon = new Complex_Polygon();

		complexPolygon.addPolygon(circle);
		complexPolygon.addPolygon(rectangle);
		complexPolygon.addPolygon(triangle);

		System.out.println("Complex Polygon area: " + complexPolygon.calculateArea());

	}
}
