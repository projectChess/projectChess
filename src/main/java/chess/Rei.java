package chess;

import java.util.List;

public class Rei extends Peca {

	public Rei(Color cor, Posicao posicao) {
		super(cor, posicao);
	}

	@Override
	public List<Posicao> posicoesAtaque() {
		return null;
	}


}
