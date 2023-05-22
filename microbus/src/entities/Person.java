package entities;

public class Person {
	private String name;
	private String cpf;
	private double weight;

	public Person(String name, String cpf, double weight) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
