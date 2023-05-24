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

	}

}
