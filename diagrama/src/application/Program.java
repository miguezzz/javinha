package application;

import java.util.ArrayList;

import entities.Conta;
import entities.ContaCartaoCredito;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) {
		
		ArrayList<Conta> cliente = new ArrayList<>();
		
		Conta Joao = new ContaPoupanca("Joao", 123456, 0.0, "14/06", "12/05");
		Conta Jose = new ContaCorrente("Jose", 144765, 0.0, "14/06");
		Conta Maria = new ContaCartaoCredito("Maria", 555998, 0.0, "14/06");
		
		cliente.add(Joao);
		cliente.add(Jose);
		cliente.add(Maria);
		
		((ContaPoupanca) Joao).creditar(100.00);
		((ContaCorrente) Jose).creditar(20.00);
		double fatura = 500.0;
		((ContaCartaoCredito) Maria).setFatura(fatura);
		
		for (Conta clientes : cliente) {
			System.out.println(clientes.getNome());
			System.out.println("Conta: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println();
		}
		
		((ContaPoupanca) Joao).aplicarRendimentos();
		((ContaCorrente) Jose).aplicarRendimentos();
		
		for (Conta clientes : cliente) {
			System.out.println(clientes.getNome());
			System.out.println("Conta: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println();
		}
		
		((ContaCartaoCredito) Maria).cobrarJuros();
		
		for (Conta clientes : cliente) {
			System.out.println(clientes.getNome());
			System.out.println("Conta: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println();
		}
		
		((ContaCartaoCredito) Maria).pagar();
		
		for (Conta clientes : cliente) {
			System.out.println(clientes.getNome());
			System.out.println("Conta: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println();
		}
	}
}
