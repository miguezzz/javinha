package entities;

public class Jogador {
	private int vida;
	private int pontuacao;
	private int forca;

	public Jogador() {
		this.vida = 3;
		this.pontuacao = 0;
		this.forca = 10;
	}
	
	public void aumentarVida() {
		vida++;
	}
	
	public void diminuirVida() {
		vida--;
	}
	
	public void diminuirForca(int dano) {
		forca -= dano;
	}
	
	public void resetForca() {
		forca = 10;
	}
	
	public void aumentarPontuacao(int pontos) {
		pontuacao += pontos;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}
	
	public int getForca() {
		return this.forca;
	}
}
