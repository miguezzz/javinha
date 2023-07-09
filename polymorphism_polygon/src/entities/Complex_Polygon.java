package entities;

import java.util.ArrayList;

public class Complex_Polygon extends Polygon {

	ArrayList<Polygon> polygons;

	public Complex_Polygon() {
		this.polygons = new ArrayList<>();
	}
	
	public void addPolygon(Polygon polygon) {
		polygons.add(polygon);
	}

	public ArrayList<Polygon> getPolygons() {
		return polygons;
	}

	public void setPolygons(ArrayList<Polygon> polygons) {
		this.polygons = polygons;
	}

	public Double calculateArea() {

		double totalArea = 0.0;

		for (Polygon polygon : polygons) {
			totalArea += polygon.calculateArea();
		}

		return totalArea;
	}
}
