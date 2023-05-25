package entities;

public class Student {
	private String name;
	private double g1, g2, g3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getG1() {
		return g1;
	}
	public void setG1(double g1) {
		this.g1 = g1;
	}
	public double getG2() {
		return g2;
	}
	public void setG2(double g2) {
		this.g2 = g2;
	}
	public double getG3() {
		return g3;
	}
	public void setG3(double g3) {
		this.g3 = g3;
	}
	
	public double getAverage(double g1, double g2, double g3) {
		return (g1 + g2 + g3) / 3;
	}
	
	public boolean approved(double average) {
		if(average >= 6)
		{
			return true;
		}
		else
			return false;
	}
	
	public double missingPoints(double average) {
		if (average < 6) {
			return 6 - average;
		}
		else
			return 0;
	}
}
