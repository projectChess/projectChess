package chess;

import java.util.List;

public abstract class Peca {
	
	private Posicao posicao;	
	private Color cor;
	
	public Peca(Color cor, Posicao posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	protected boolean isPeao() {
		return false;
	}

	public abstract List<Posicao> posicoesAtaque();

	

}

enum Color {
	Preto,
	Branco
}
