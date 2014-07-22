package chess;

import static chess.Color.Branco;
import static chess.Color.Preto;
import static chess.ColunaTabuleiro.D;
import static chess.ColunaTabuleiro.E;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TabuleiroTest {

	private Tabuleiro subject;
	
	// http://pt.wikipedia.org/wiki/Tabuleiro_(xadrez)
	
	@Before
	public void before() {		
	}
	
	@Test
	public void peaoBrancoAtacaReiPreto_reiPretoEmCheck() {
		List<Peca> branco = new ArrayList<Peca>();
		branco.add(new PecaBuilder().criaPeao(Branco, new Posicao(4, D)).build());;
		
		List<Peca> preto = new ArrayList<Peca>();
		preto.add(new PecaBuilder().criaRei(Preto, new Posicao(5, E)).build());;
		
		subject = new Tabuleiro(preto, branco);		
		
		assertTrue("Rei preto deveria estar em cheque", subject.isReiPretoEmCheque());
	}
	
	@Test
	public void peaoBrancoNaoAtacaReiPreto_reiPretoEmCheck() {
		List<Peca> branco = new ArrayList<Peca>();
		branco.add(new PecaBuilder().criaPeao(Branco, new Posicao(2, D)).build());;
		
		List<Peca> preto = new ArrayList<Peca>();
		preto.add(new PecaBuilder().criaRei(Preto, new Posicao(5, E)).build());;
		
		subject = new Tabuleiro(preto, branco);
		
		assertFalse("Rei preto deveria estar em cheque", subject.isReiPretoEmCheque());
	}

}
