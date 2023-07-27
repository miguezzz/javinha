package application;

import entities.ArrayQueue;

public class Program_Queue {
	public static void main(String[] args) {
		
		ArrayQueue filinha = new ArrayQueue();
		
		filinha.add(98);
		filinha.add(50);
		filinha.add(98);
		filinha.add(50);
		filinha.add(98);
		filinha.add(50);
		filinha.add(98);
		filinha.add(50);
		filinha.add(98);
		filinha.add(50);
		filinha.add(98);
		filinha.add(50);
	
		
		while(! filinha.isEmpty()) {
			System.out.println("Elemento: " + filinha.remove());
		}
	}
}
