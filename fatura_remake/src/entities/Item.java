package entities;

public class Item {
	private Integer qtd;
	private Double precoUnit;
	private String nome;
	
	public Item(String nome, Double precoUnit, Integer qtd) {
		this.nome = nome;
		this.precoUnit = precoUnit;
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}
	public Double getPrecoUnit() {
		return precoUnit;
	}
	public Integer getQtd() {
		return qtd;
	}
}
