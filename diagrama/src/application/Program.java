package application;

import entities.ContaCartaoCredito;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) {
		ContaPoupanca Joao = new ContaPoupanca(123456, 0.0, "14/06", "12/05");
		ContaCorrente Jose = new ContaCorrente(144765, 200.0, "14/06");
		ContaCartaoCredito Maria = new ContaCartaoCredito(555998, 1000.0, "14/06");
		
		Joao.creditar(100.00);
		Jose.debitar(20.00);
		Maria.
	}
}
