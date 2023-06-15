package entities;

public class ContaCorrente extends ContaBancaria {

	private double taxaJuros;
	private double limiteSaque;
	private double taxaServico;

	public ContaCorrente(String nome, Integer numero, Double saldo, String data_abertura) {
		super(nome, numero, saldo, data_abertura);
		this.taxaJuros = 7.0;
		this.limiteSaque = 200.00;
		this.taxaServico = 50.00;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}
	

	public void aplicarRendimentos() {
		double saldoDevedor = 0.0;
		if (saldo < 0) {
			saldoDevedor = saldo * (-1);
		}
		
		saldo = saldo - (taxaJuros * saldoDevedor + taxaServico);
	}
}
