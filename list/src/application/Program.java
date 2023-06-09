package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Marina");
		list.add("Victor");
		list.add("Maite");
		list.add("Miles");
		list.add("Kira");
		list.add(2, "Vicente"); // in position 2, add Vicente

		list.add("Kakaka");
		list.remove("Kakaka");
		list.remove(5); // kira

		System.out.println("list size = " + list.size());
		System.out.println("");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		list.add("Adriana");
		list.add("Altair");
		list.add("Antonio");
		list.add("Bruna");
		list.add("Batman");

		list.removeIf(x -> x.charAt(0) == 'A'); // retorna se x comeca com A. se for true, remove. else, nao remove
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		System.out.println("Index of Miles: " + list.indexOf("Miles")); // retorna o indice do elemento da lista
		System.out.println("Index of Juliana: " + list.indexOf("Juliana")); // retorna -1 caso nao exista

		System.out.println("-----------------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList()); // filtra o
																											// que
																											// comeca
																											// com M e
																											// cria uma
																											// nova
																											// lista so
																											// com isso.
																											// passa pro
																											// stream
																											// dps volta
																											// pro List.

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null); // retorna o primeiro
																								// elemento com a
																								// condicao dada
		System.out.println(name);

		System.out.println("-----------------------------------");

		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // retorna nulo caso nao
																								// encontre o elemento
		System.out.println(name1);
	}

}
