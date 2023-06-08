package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products you want to add? ");
		int quantity = sc.nextInt();
		
		Product[] products = new Product[quantity]; //create vect for products
		
		for (int i = 0; i < products.length; i++) {
			sc.nextLine(); //clear the \n
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			products[i] = new Product(name, price); //allocates product on i position
		}
		
		double sum;
		for (int i = 0; i < products.length; i++) {
			System.out.println();
		}
	}

}
