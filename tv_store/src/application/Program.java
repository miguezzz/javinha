package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		product.setName(sc.nextLine());
		
		System.out.println("Price: ");
		product.setPrice(sc.nextDouble());
		
		System.out.println("Quantity in stock: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println("");
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product.toString());
		
		System.out.println("");
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		sc.close();

	}

}
