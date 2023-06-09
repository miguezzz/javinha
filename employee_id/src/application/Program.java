package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> list = new ArrayList<>();
	
		// reading data
		System.out.println("How many employees will be registered? ");
		int employee_qty = sc.nextInt();
		
		for (int i = 1; i <= employee_qty; i++) {
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		// updating salary
		System.out.println("Enter the employee id that will have a salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage(from 0 to 100): ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// listing employees
		System.out.println("List of employees:");
		
		for (Employee iterator : list) {
			System.out.println(iterator.toString());
		}
		
		sc.close();
	}

}
