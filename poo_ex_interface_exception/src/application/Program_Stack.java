package application;

import entities.ArrayStack;

public class Program_Stack {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		
//		stack.remove();
		stack.add(12);
		stack.add(24);
		stack.add(4);
		stack.remove();
		stack.add(5);
		
		while (!stack.isEmpty()) {
			System.out.println("Elemento: " + stack.remove());
		}
	}
}
