package entities;

public class OutsorcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return (this.hours * valuePerHour) + (this.additionalCharge * 1.1);
	}
}
