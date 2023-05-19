package fatura;

import java.util.ArrayList;

public class Fatura {
	private String nome;
	private String cpf;
	private ArrayList<Item> itens;
	
	//construtor
	public Fatura(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.itens = new ArrayList<Item>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}


	public double obtemPreco() {
		double precoFinal = 0;
		for (Item item : itens) {
			precoFinal += item.getPreco_unitario() * item.getQtd();
		}
		return precoFinal;
	}
	
	public static void main(String[] args) {
		ArrayList<Item> carrinho = new ArrayList<Item>();
		
		//criando itens
		Item biscoito = new Item(2, 4.50, "Bisc_Cheetos");
		Item suco = new Item(4, 5.0, "DellVale_Uva");
		Item chocolate = new Item(1, 20.75, "Choc_Milka");
		
		
		//adicionando itens ao pedido
		carrinho.add(chocolate);
		carrinho.add(suco);
		carrinho.add(biscoito);
		
		//criando fatura
		Fatura fatura = new Fatura("Victor", "123.456.789.11");
		fatura.setItens(carrinho);
		
		//imprimindo nome e CPF
		System.out.println("Cliente: " + fatura.getNome());
		System.out.println("CPF: " + fatura.getCpf());
		System.out.println();
		
		//imprimindo a lista de itens
		for (Item item : carrinho) {
			System.out.println("Item: " + item.getNome());
			System.out.println("Quantidade: " + item.getQtd());
			System.out.println("Preco unit.: " + item.getPreco_unitario());
			System.out.println("");
		}
		
		double pagamentoTotal = fatura.obtemPreco();
		System.out.println("Total da fatura: " + pagamentoTotal);
		
		
	}
}