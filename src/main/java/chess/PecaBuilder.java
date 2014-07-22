package chess;

public class PecaBuilder {
	
	private Peca peca;	
	
	public PecaBuilder criaPeao(Color cor, Posicao posicao) {
		peca = new Peao(cor, posicao);
		return this;
	}
	
	public PecaBuilder criaRei(Color cor, Posicao posicao) {
		peca = new Rei(cor, posicao);
		return this;
	}
	
	
	public Peca build() {
		return peca;
	}	

}
