package entities;

public class ContaCartaoCredito extends Conta {

	private double fatura;

	public ContaCartaoCredito(String nome, int numero, double saldo, String dataAbertura) {
		super(nome, numero, saldo, dataAbertura);
	}

	public Double getFatura() {
		return fatura;
	}

	public void setFatura(Double fatura) {
		this.fatura = fatura;
	}

	public void pagar() {
		this.saldo = saldo - fatura;
	}

	public void cobrarJuros() {
		fatura = fatura * 1.05;
	}
}
