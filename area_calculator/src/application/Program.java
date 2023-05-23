package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Square;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to area calculator! Please type the figure you want the area to be calculated: ");
		String figure = sc.nextLine();
		
		System.out.println("Amazing! now tell us its dimentions: ");
		Double size = sc.nextDouble();
		
		if (figure.equals("Square")) {
			Square square = new Square(size);
			
			System.out.println("Great! Your square has " + square.squareArea() + " u.a.");
		}
		else if (figure.equals("Circle")) {
			Circle circle = new Circle(size);
			
			System.out.println("Great! Your circle has " + circle.circleArea() + "u.a.");
		}
		else {
			System.out.println("Sorry, we cannot calculate the area of that figure yet (coming soon).");
		}
		
		
		sc.close();
	}
}
