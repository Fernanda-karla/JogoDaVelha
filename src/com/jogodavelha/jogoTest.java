package com.jogodavelha;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class jogoTest {

	@Test
	public void criarJogo() {
		Jogo jogo = new Jogo();
		assertFalse("O Jogo iniciou finalizado", jogo.acabou());
		
	}

}
