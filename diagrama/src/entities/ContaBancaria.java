package entities;

public abstract class ContaBancaria extends Conta{
	
	public ContaBancaria(String nome, Integer numero, Double saldo, String data_abertura) {
		super(nome, numero, saldo, data_abertura);
	}
	
	public void creditar(double amount) {
		saldo += amount;
	}
	public void debitar(double amount) {
		saldo -= amount;
	}
	
	public abstract void aplicarRendimentos();
}
