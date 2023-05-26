package entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getNetSalary() {
		return this.grossSalary - this.tax;
	}
	
	public double increaseSalary(double percentage) {
		return getNetSalary() + getNetSalary() * (percentage / 100);
	}
}
