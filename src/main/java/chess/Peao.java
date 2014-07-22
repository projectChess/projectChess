package chess;

import java.util.ArrayList;
import java.util.List;

public class Peao extends Peca {

	public Peao(Color cor, Posicao posicao) {
		super(cor, posicao);
	}
	
	@Override
	protected boolean isPeao() {
		return true;
	}

	@Override
	public List<Posicao> posicoesAtaque() {
		List<Posicao> posicoesAtaque = new ArrayList<Posicao>();
		posicoesAtaque.add(posicaoAtaqueEsquerda());		
		posicoesAtaque.add(posicaoAtaqueDireita());		
		
		return posicoesAtaque;
	}

	private Posicao posicaoAtaqueDireita() {
		int linha = getLinha();
		ColunaTabuleiro coluna = getColunaDireita();
		return new Posicao(linha, coluna);
	}

	private Posicao posicaoAtaqueEsquerda() {
		int linha = getLinha();
		ColunaTabuleiro coluna = getColunaEsquerda();
		return new Posicao(linha, coluna);
	}
	
	private int getLinha() {
		return getPosicao().getLinha() + 1;
	}
	
	private ColunaTabuleiro getColunaEsquerda() {
		ColunaTabuleiro coluna = getPosicao().getColuna();
		return ColunaTabuleiro.colunaAEsquerda(coluna);
	}
	
	private ColunaTabuleiro getColunaDireita() {
		ColunaTabuleiro coluna = getPosicao().getColuna();
		return ColunaTabuleiro.colunaADireita(coluna);
	}
	
}
