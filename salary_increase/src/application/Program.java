package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		emp.setName(sc.nextLine());
		emp.setGrossSalary(sc.nextDouble());
		emp.setTax(sc.nextDouble());
		
		System.out.printf("Name: %s\nGross salary: %.2f\nTax: %.2f\n\n", emp.getName(), emp.getGrossSalary(), emp.getTax());
		System.out.println("Net Salary: $" + emp.getNetSalary());
		
		System.out.println("");
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();

		System.out.println("Updated data: " + emp.getName() + ", $" + emp.increaseSalary(percentage));
		
		
		sc.close();
	}
}
