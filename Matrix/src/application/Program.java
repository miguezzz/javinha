package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matrix order: ");
		int order = sc.nextInt();
		int[][] matrix = new int[order][order];
		
		//get matrix values
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < order; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//print matrix
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < order; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Main diagonal:");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j)
				{
					System.out.printf("%d ", matrix[i][j]);
				}
			}
			System.out.println();
		}
		
		int neg_numbers = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] < 0)
				{
					neg_numbers++;
				}
			}
		}
		System.out.println("Negative numbers: " + neg_numbers);
		
		sc.close();
	}

}
