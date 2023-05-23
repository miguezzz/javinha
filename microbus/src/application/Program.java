package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MicroBus;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		MicroBus bus = new MicroBus(1000, 44); //cria onibus

		Person braida = new Person("Braida", "123.456.345-00", 104); //cria pessoa
		bus.addPerson(braida, 12); //add pessoa ao onibus em um respectivo lugar
		
		System.out.println("Current weight inside the bus: " + bus.currentWeight() + " Kg"); //mostra o peso total atual no onibus
		System.out.println("");
		
		System.out.println("Type a number and see if there's a person on the seat and who's it: ");
		System.out.println(bus.getPerson()[sc.nextInt()].getName()); //retorna o nome da pessoa que esta no assento escolhido
		System.out.println("");
		
		Person over = new Person("malba", "999.999.999-99", 997);
		bus.addPerson(over, 22); //peso max vai ser atingido
		
		sc.close();
	}

}
