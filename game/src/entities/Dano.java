package entities;

import java.util.Random;

public class Dano extends Caixa {
	public void abertura(Jogador jogador) {
		Random random = new Random();
		
		int forcaReduzida = random.nextInt(5);
		jogador.diminuirForca(forcaReduzida);
		
		if (jogador.getForca() <= 0) {
			jogador.diminuirVida();
			jogador.resetForca();
		}
	}

}
