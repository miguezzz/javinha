package application;

import entities.MicroBus;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		MicroBus bus = new MicroBus(1000, 44);

		Person p = new Person("Braida", "123123123", 104);

		bus.addPerson(p, 12);
		System.out.println(bus.getPerson()[12].getName());
	}

}
