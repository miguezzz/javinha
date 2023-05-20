package exercise;

import java.util.Scanner;

public class Sum {
	public static int somarInteiros(int x, int y) {
		int soma = x + y;
		
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, x2;
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		
		System.out.println("SOMA = " + somarInteiros(x1, x2));
		
		sc.close();
	}
}
