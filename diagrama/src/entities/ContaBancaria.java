package entities;

public abstract class ContaBancaria extends Conta{
	
	public ContaBancaria(Integer numero, Double saldo, String data_abertura) {
		super(numero, saldo, data_abertura);
	}
	
	public void creditar(double amount) {
		saldo -= amount;
	}
	public void debitar(double amount) {
		saldo += amount;
	}
	
	abstract void aplicarRendimentos();
}
