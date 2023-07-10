package entities;

import java.util.Random;

public class Jogo {
	private static final int VETOR_POSICOES = 100;
	private static final int QTD_CAIXAS = 50;

	private Caixa[] caixas;
	private Jogador jogador;

	public Jogo() {
		this.caixas = geraVetor();
		this.jogador = new Jogador();
	}

	public void iniciarJogo() {
		for (int rodada = 1; rodada <= 20; rodada++) {
			int indiceCaixa = rodada - 1;

			if (indiceCaixa >= VETOR_POSICOES) {
				break; // Jogo termina se todas as caixas forem abertas
			}

			Caixa caixa = caixas[indiceCaixa];
			if (caixa != null) {
				caixa.abertura(jogador);
			}

			System.out.println("Rodada " + rodada + ":");
			System.out.println("Vida: " + jogador.getVida());
			System.out.println("Pontuacao: " + jogador.getPontuacao());
			System.out.println("Forca: " + jogador.getForca());
			System.out.println();
		}

		System.out.println("Pontuacao final: " + jogador.getPontuacao());
	}

	public Caixa[] geraVetor() {
		Caixa[] vetor = new Caixa[VETOR_POSICOES];
		Random random = new Random();

		for (int i = 0; i < QTD_CAIXAS; i++) {
			int randomIndex = random.nextInt(VETOR_POSICOES);
			Caixa caixa = null;

			int tipoCaixa = random.nextInt(3);
			switch (tipoCaixa) {
			case 0:
				caixa = new Tesouro();
				break;
			case 1:
				caixa = new Vida();
				break;
			case 2:
				caixa = new Dano();
				break;
			}

			vetor[randomIndex] = caixa;
		}

		return vetor;
	}
}
