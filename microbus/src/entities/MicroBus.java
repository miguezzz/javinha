package entities;


public class MicroBus {
	private Person[] people;
	private double maxWeight;

	public MicroBus(double maxWeight, int numSeats) {
		super();
		this.maxWeight = maxWeight;
		people = new Person[numSeats];
	}

	public Person[] getPerson() {
		return people;
	}

	public void setPerson(Person[] people) {
		this.people = people;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double currentWeight() {

		double currWeight = 0;

		for (int i = 0; i < this.people.length; i++) {
			if (people[i] != null) {
				// peso total vai ser calculado
				currWeight += people[i].getWeight();
			}
		}
		return currWeight;
	}

	
	public void addPerson(Person person, int numSeats) {

		double currentWeight = 0;

		for (int j = 0; j < this.people.length; j++) {
			if (people[j] != null) {
				currentWeight += people[j].getWeight();
			}
		}

		if (currentWeight + person.getWeight() < this.maxWeight) {
			this.people[numSeats] = person;
		} else {
			System.out.println("Max weight's been surpassed!");
		}
	}
}
