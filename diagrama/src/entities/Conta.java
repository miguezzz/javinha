package entities;

public abstract class Conta {
	protected Integer numero;
	protected Double saldo;
	protected String data_abertura;
	
	public Conta(Integer numero, Double saldo, String data_abertura) {
		this.numero = numero;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getData_abertura() {
		return data_abertura;
	}
	
	public double obterSaldo() {
		return saldo;
	}
}
