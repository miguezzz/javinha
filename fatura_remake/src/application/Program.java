package application;

import java.util.ArrayList;
import java.util.Locale;

import entities.Fatura;
import entities.Item;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//carrinho de itens
		ArrayList<Item> carrinho = new ArrayList<Item>();
		
		//criando itens
		Item pringles = new Item("lata_Pringles", 4.50, 2);
		Item chocolate = new Item("choc_milka", 15.50, 5);
		
		//adicionando itens ao carrinho
		carrinho.add(pringles);
		carrinho.add(chocolate);
		
		//criando fatura
		Fatura fatura = new Fatura("Victor", "198.198.198-99", carrinho);
		fatura.setItens(carrinho);
		
		//imprimindo infos
		System.out.println("Nome: " + fatura.getNome());
		System.out.println("CPF: " + fatura.getCPF());
		System.out.println();
		
		//lista de itens
		System.out.println("Lista de itens:");
		for (Item itens : carrinho) {
			System.out.println("*" + itens.getNome());
			System.out.println("Quantidade: " + itens.getQtd());
			System.out.println("Preco Unitario: " + itens.getPrecoUnit());
			System.out.println();
		}
		
		double total = fatura.obtemPreco();
		System.out.println("Total a ser pago: " + total);
	}

}
