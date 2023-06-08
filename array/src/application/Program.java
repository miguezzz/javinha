package application;

import java.util.Locale;
import java.util.Scanner;



/* Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas. */

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas? ");
		int p = sc.nextInt();
		
		double[] vect = new double[p]; //declara o vetor
		
		System.out.println("");
		System.out.printf("Digite as alturas das %d pessoas\n", p);
		
		//recebe as alturas
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura %d = %.2f\n", i + 1, vect[i]); //imprime as alturas
			soma += vect[i]; //soma as alturas
		}
		
		System.out.println("");
		System.out.printf("Heights' average: %.2f\n", soma/p); //imprime a media
		
		sc.close();
	}
}
