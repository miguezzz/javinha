package application;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		double largura = 9.5;
		double comprimento = 10.0;
		
		Retangulo r = new Retangulo(largura, comprimento);
		
		r.imprimeValores();
	}
}
