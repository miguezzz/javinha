package fatura;

public class Item {
	private int qtd;
	private double preco_unitario;
	private String nome;
	
	//construtor
	public Item(int qtd, double preco_unitario, String nome) {
		this.qtd = qtd;
		this.preco_unitario = preco_unitario;
		this.nome = nome;
	}
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
