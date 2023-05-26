package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		
		double result = CurrencyConverter.calculator(dollar, quantity);
		System.out.printf("Amount to be paid in Reais: %.2f", result);
		
		
		
		sc.close();
	}

}
