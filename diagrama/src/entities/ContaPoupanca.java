package entities;

public class ContaPoupanca extends ContaBancaria {
	private String data_aniversario;
	@SuppressWarnings("unused")
	private Double taxaRendimento;

	public ContaPoupanca(Integer numero, Double saldo, String data_abertura, String data_aniversario) {
		super(numero, saldo, data_abertura);
		this.data_aniversario = data_aniversario;
		this.taxaRendimento = 0.1;
	}
	
	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public String getData_Aniversario() {
		return data_aniversario;
	}
	
	public void aplicarRendimentos() {
		this.saldo = saldo + (saldo * taxaRendimento);
	}
	
}
