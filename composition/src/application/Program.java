package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("");
		System.out.println("Enter worker data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Level: ");
		String level = sc.nextLine();
		System.out.println("Base salary: ");
		double base_salary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), base_salary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int contracts = sc.nextInt();
		
		for (int i = 1; i <= contracts; i++) {
			System.out.println("Enter contract " + i + " data:");
			System.out.println("Date (DD/MM/YYYY): ");
			LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
			System.out.println("Value per hour: ");
			double valperhour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int duration = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valperhour, duration);
			worker.addContract(contract);
		}
		
		System.out.println("");
		System.out.println("Enter month to calculate income: ");
		int month = sc.nextInt();
		System.out.println("Enter the year to calculate income: ");
		int year = sc.nextInt();
		

		System.out.printf("Name: %s\nDepartment: %s\nIncome for%d/%d: %.2f", name, departmentName, worker.income(month, year));

		sc.close();
	}
}