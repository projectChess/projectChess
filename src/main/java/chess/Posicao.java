package chess;

public class Posicao {
	
	private int linha;
	private ColunaTabuleiro coluna;
	
	public Posicao(int linha, ColunaTabuleiro coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public ColunaTabuleiro getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	@Override
	public boolean equals(Object obj) {
		Posicao posicao = (Posicao)obj;
		
		return linha == posicao.getLinha() &&
				   coluna == posicao.getColuna();
	}

}

enum ColunaTabuleiro {
	A,
	B,
	C,
	D,
	E,
	F,
	G,
	H;	
	
	public static ColunaTabuleiro colunaAEsquerda(ColunaTabuleiro posicao) {
		switch (posicao) {
			case A:
				return null;
			case B:
				return A;
			case C:
				return B;
			case D:
				return C;
			case E:
				return D;
			case F:
				return E;
			case G:
				return F;
			case H:
				return G;
			default: 
				return null;
		}		
	}
	
	public static ColunaTabuleiro colunaADireita(ColunaTabuleiro posicao) {
		switch (posicao) {
			case A:
				return B;
			case B:
				return C;
			case C:
				return D;
			case D:
				return E;
			case E:
				return F;
			case F:
				return G;
			case G:
				return H;
			case H:
				return null;
			default: 
				return null;
		}		
	}
}
