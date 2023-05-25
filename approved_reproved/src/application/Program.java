package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("Enter student's name: ");
		stu.setName(sc.nextLine());
		
		System.out.println("Enter 1st grade: ");
		stu.setG1(sc.nextDouble());
		System.out.println("Enter 2nd grade: ");
		stu.setG2(sc.nextDouble());
		System.out.println("Enter 3rd grade: ");
		stu.setG3(sc.nextDouble());
		
		
		double average = stu.getAverage(stu.getG1(), stu.getG2(), stu.getG3());
		
		System.out.println(stu.getName());
		System.out.println("FINAL GRADE = " + stu.getAverage(stu.getG1(), stu.getG2(), stu.getG3()));
		
		if (stu.approved(average) == true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
			System.out.println("MISSING " + stu.missingPoints(average) + " POINTS");
		}
		
		sc.close();
	}
}
