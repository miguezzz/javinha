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
			
			products[i] = new Product(name, price); //allocate product on i position
		}
		
		double sum = 0.0;
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName());
			System.out.println(products[i].getPrice());
			System.out.println("");
			sum += products[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE: %.2f\n", sum / products.length);
		
		sc.close();
	}

}
