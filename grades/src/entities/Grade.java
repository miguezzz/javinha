package entities;

public class Grade {
	private String date;
	private Double value;
	
	public Grade(String date, double value) {
		this.date = date;
		this.value = value;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
