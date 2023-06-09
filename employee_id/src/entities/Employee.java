package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary = this.salary + (this.salary * (percentage / 100));
	}

	@Override
	public String toString() {
		return "Employee [id: " + id + ", name: " + name + ", salary: " + salary + "]";
	}
	
	
}
