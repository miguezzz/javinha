package entities;

public class Tesouro extends Caixa {
	public void abertura(Jogador jogador) {
		jogador.aumentarPontuacao(10);
	}
}
