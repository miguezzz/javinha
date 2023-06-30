package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		System.out.println("How many employees? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee " + "#" + i + " data:");
			System.out.println("Outsorced (y/n)? ");
			char outsorced = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Hours worked: ");
			int hours = sc.nextInt();
			System.out.println("Value/hour: ");
			Double vph = sc.nextDouble();

			if (outsorced == 'n') {
				employees.add(new Employee(name, hours, vph));
			} else {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsorcedEmployee(name, hours, vph, additionalCharge));
			}

		}
		
		System.out.println("PAYMENTS: ");
		for (Employee employee : employees) {
			System.out.printf("%s - $%.2f\n", employee.getName(), employee.payment());
		}
		
		sc.close();
	}
}
