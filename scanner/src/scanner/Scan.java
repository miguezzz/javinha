package scanner;

import java.util.Scanner;

public class Scan { 
	//ctrl + shift + f: identar
	public static void main(String[] args) {
		//ler string
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine(); //se retirarmos o line, sera lida apenas a primeira palavra
		System.out.println("Voce digitou o texto: " + x);
		
		//ler double
		Double y = sc.nextDouble();
		System.out.println("Voce digitou o numero: " + y);
		
		//para ler um caractere
		char z = sc.next().charAt(0);
		System.out.println("Voce digitou o caractere: " + z);
		
		System.out.println("");
		System.out.println("Resumidamente:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
		//
		//
		//
		
		Scanner sc1 = new Scanner(System.in);
		
		int w;
		String s1, s2, s3;
		
		w = sc1.nextInt(); //quebra de linha pendente
		sc1.nextLine(); //problema resolvido
		s1 = sc1.nextLine();
		s2 = sc1.nextLine();
		s3 = sc1.nextLine();
		
		System.out.println(w);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc1.close();
	}

}
