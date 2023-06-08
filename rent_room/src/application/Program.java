package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];	
		
		System.out.println("How many rooms will be rented? ");
		int qty_rooms = sc.nextInt();
		
		for (int i = 1; i <= qty_rooms; i++) {
			System.out.println("");
			System.out.printf("Rent #%d\n", i);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].toString());
			}
		}
		
		sc.close();
	}
}
