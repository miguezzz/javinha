package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Student;
import entities.Grade;


public class Program {

	public static void main(String[] args) {
		Student victor = new Student("Victor", "198.199.777-41");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite a nota da P1 de " + victor.getName() + ": ");
		double notaP1 = sc.nextDouble();
		victor.addNota("07/06/2023", notaP1);
		System.out.println("Digite a nota da P2 de " + victor.getName() + ": ");
		double notaP2 = sc.nextDouble();
		victor.addNota("14/06/2023", notaP2);
		System.out.println("Digite a nota da P3 de " + victor.getName() + ": ");
		double notaP3 = sc.nextDouble();
		victor.addNota("21/12/2023", notaP3);
		
		System.out.println("");
		
		System.out.println("A media de " + victor.getName() + " eh: ");
		System.out.println(victor.getMedia());
		
		System.out.println("");
		
		Student marina = new Student("Marina", "002.858.679-22");
			
		System.out.println("Digite a nota da P1 de " + marina.getName() + ": ");
		marina.addNota("07/06/2023", sc.nextDouble());
		System.out.println("Digite a nota da P2 de " + marina.getName() + ": ");
		marina.addNota("14/06/2023", sc.nextDouble());
		System.out.println("Digite a nota da P3 de " + marina.getName() + ": ");
		marina.addNota("21/12/2023", sc.nextDouble());
		
		System.out.println("");
		
		System.out.println("A media de " + marina.getName() + " eh: ");
		System.out.println(marina.getMedia());
		
		
		sc.close();
	}

}
