package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to type? ");
		int qty = sc.nextInt();
		int even_qty = 0;
		
		int[] vect = new int[qty]; 
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Type a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("EVEN NUMBERS:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				even_qty++;
			}
		}
		
		System.out.println("EVEN QUANTITY = " + even_qty);
		
		sc.close();
	}
}
