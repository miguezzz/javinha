package entities;

public class Retangulo extends Forma {
	
	protected Double largura;
	protected Double comprimento;
	
	public Retangulo(Double largura, Double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public double calculaArea() {
		return this.comprimento * this.largura;
	}

	@Override
	public double calculaPerimetro() {
		return (this.comprimento * 2) + (this.largura) * 2;
	}

	@Override
	public void imprimeValores() {
		System.out.printf("Largura: %.2f\nComprimento: %.2f\nArea: %.2f\nPerimetro: %.2f\n", 
				this.largura, this.comprimento, calculaArea(), calculaPerimetro());
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	
	public double getComprimento() {
		return this.comprimento;
	}
}
