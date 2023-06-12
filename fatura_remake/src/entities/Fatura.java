package entities;

import java.util.ArrayList;

public class Fatura {
	private String nome;
	private String CPF;
	private ArrayList<Item> itens;
	
	public Fatura(String nome, String CPF, ArrayList<Item> itens) {
		this.nome = nome;
		this.CPF = CPF;
		this.itens = new ArrayList<Item>();
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}
	
	
	public Double obtemPreco() {
		double total = 0.0;
		for (Item item : itens) {
			total += item.getPrecoUnit() * item.getQtd();
		}
		return total;
	}
}
