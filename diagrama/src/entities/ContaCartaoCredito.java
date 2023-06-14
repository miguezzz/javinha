package entities;

public class ContaCartaoCredito extends Conta {
	
	public ContaCartaoCredito(int numero, double saldo, String dataAbertura) {
		super(numero, saldo, dataAbertura);
	}
	
	public void pagar() {
		this.saldo = 0.0;
	}
	
	public void cobrarJuros() {
		saldo = saldo * 1.05;
	}
}
