package entities;

public abstract class Conta {
	protected String nome;
	protected Integer numero;
	protected Double saldo;
	protected String data_abertura;

	public Conta(String nome, Integer numero, Double saldo, String data_abertura) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
	}

	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getData_abertura() {
		return data_abertura;
	}

	public void obterSaldo() {
		System.out.println(saldo);
	}
}