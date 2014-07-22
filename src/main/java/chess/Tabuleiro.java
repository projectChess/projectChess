package chess;

import java.util.List;

public class Tabuleiro {
	
	private List<Peca> preto;
	private List<Peca> branco;
	private Peca reiPreto;
	
	public Tabuleiro() {
		this.preto = null;
		this.branco = null;
	}
	
	public Tabuleiro(List<Peca> preto, List<Peca> branco) {
		this.preto = preto;
		this.branco = branco;
		this.reiPreto = getReiPreto();
	}
	
	private Peca getReiPreto() {
		return preto.get(0);
	}

	public boolean isReiPretoEmCheque() {
		Peca peao = getPeaoBranco();
		if (peao.posicoesAtaque().contains(reiPreto.getPosicao()) )
			return true;
		
		return false;
	}

	private Peca getPeaoBranco() {
		return branco.get(0);
	}	
	
}
