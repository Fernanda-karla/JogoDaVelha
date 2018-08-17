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

}
