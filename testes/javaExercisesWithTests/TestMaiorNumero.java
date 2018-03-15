package javaExercisesWithTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercicio1.MaiorNumero;

public class TestMaiorNumero {

	private MaiorNumero maiorNumero = new MaiorNumero();

	@Test
	public void deveMostrarNumeroMaiorDaEsquerda() {
		int expected = 6;
		assertEquals(expected, maiorNumero.maiorValor(6, 5));
	}

	@Test
	public void deveMostrarNumeroMaiorDaDireita() {
		int expected = 10;
		assertEquals(expected, maiorNumero.maiorValor(6, 10)); 
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveMostrarUmaExcecaoCasoUmNumeroForNegativo() {
		maiorNumero.maiorValor(5, -2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveMostarUmaExceçãoParaDoisNumerosNegativos() {
		maiorNumero.maiorValor(-5, -8);
	}
}
