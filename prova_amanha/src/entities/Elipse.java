package entities;

public class Elipse extends Forma implements Excentricidade {
	protected Double eixoMaior_a;
	protected Double eixoMenor_b;
	
	public Elipse(Double eixoMaior_a, Double eixoMenor_b) {
		this.eixoMaior_a = eixoMaior_a;
		this.eixoMenor_b = eixoMenor_b;
	}
	
	public double calculaArea() {
		return Math.PI * eixoMaior_a * eixoMenor_b;
	}
	
	public double calculaPerimetro() {
		return Math.PI * (Math.sqrt((2 * (eixoMaior_a * eixoMaior_a + eixoMenor_b * eixoMenor_b) - Math.pow(eixoMaior_a - eixoMenor_b, 2) / 2)));
	}
	
	public double calculaExcentricidade() {
		return Math.sqrt((1 - eixoMenor_b * eixoMenor_b) / eixoMaior_a * eixoMaior_a);
	}
	
	public void imprimeValores() {
		System.out.printf("Eixo a (maior): %.2f\nEixo b (menor): %.2f\nArea: %.2f\nPerimetro: %.2f\nExcentricidade: %.2f", 
				this.eixoMaior_a, this.eixoMenor_b, calculaArea(), calculaPerimetro(), calculaExcentricidade());
	}

	public Double getEixoMaior_a() {
		return eixoMaior_a;
	}

	public Double getEixoMenor_b() {
		return eixoMenor_b;
	}
	
	
}
