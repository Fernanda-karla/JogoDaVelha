package com.jogodavelha;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class jogoTest {
	
	private Jogo jogo;
	
	@Before
	public void novoJogo() {
		jogo = new Jogo();
	}

	@Test
	public void criarJogo() {
		novoJogo();
		assertFalse("O Jogo iniciou finalizado", jogo.acabou());
		
	}
	
	@Test
	public void definirPrimeiroJogador() {
		novoJogo();
		jogo.setMarcaPrimeiroJogadorX(true);
		assertTrue(jogo.isMarcaPrimeiroJogadorX());
	}
	
	@Test
	public void definirPrimeiroJogadorDeNovo() {
		novoJogo();
		jogo.setMarcaPrimeiroJogadorX(true); //x
		jogo.setMarcaPrimeiroJogadorX(false); //o
		assertFalse(jogo.isMarcaPrimeiroJogadorX());
	}
	
	@Test
	public void desenharPrimeiraMarca() {
		novoJogo();
		jogo.setMarcaPrimeiroJogadorX(true);
		jogo.desenharMarca(1, 0);
		assertTrue(jogo.isMarcaXNaPosicao(1, 0));
	}
	
	@Test(expected=ExcecaoJogoDaVelha.class)
	public void desenharMarcaEmUmaCelulaOcupada() {
		jogo.setMarcaPrimeiroJogadorX(true);
		jogo.desenharMarca(0, 1);
	    jogo.desenharMarca(0, 1);
	}
	
	@Test(expected=ExcecaoJogoDaVelha.class)
	public void desenharMarcaEmUmaColunaErrada() {
		jogo.setMarcaPrimeiroJogadorX(false);
		jogo.desenharMarca(1, 3);
	  }

}
