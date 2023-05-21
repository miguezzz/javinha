package entities;

import java.util.ArrayList;

public class Student extends Person {
	private ArrayList<Grade> grades;
	
	public Student(String name, String cpf) {
		super(name, cpf);
		grades = new ArrayList<Grade>();
	}
	
	public Double getMedia() {
		double total = 0;
		
		for (Grade grade : grades) {
			total += grade.getValue();
		}
		
		return total / grades.size();
	}
	
	public void addNota(String date, double value) {
		grades.add(new Grade(date, value));
	}
}
