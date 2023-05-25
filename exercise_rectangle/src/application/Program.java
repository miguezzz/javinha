package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, height;
		
		System.out.println("Enter width: ");
		width = sc.nextDouble();
		
		System.out.println("Enter height: ");
		height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, height);
		
		System.out.println("");
		System.out.println("Enter rectangle width and height:");
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getHeight());
		System.out.printf("AREA = %.2f\n", (rectangle.getWidth() * rectangle.getHeight()));
		System.out.printf("PERIMETER = %.2f\n", (rectangle.getWidth() * 2) + (rectangle.getHeight() * 2));
		System.out.printf("DIAGONAL = %.2f\n", Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0)));
	
		sc.close();
	}

}
