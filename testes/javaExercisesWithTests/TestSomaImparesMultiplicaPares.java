package javaExercisesWithTests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import exercicio3.SomaImparesMultiplicaPares;

public class TestSomaImparesMultiplicaPares {

	private SomaImparesMultiplicaPares somaImparesMultiplicaPares = new SomaImparesMultiplicaPares();

	@Test
	public void deveRetornarSomaeMultiplicacaoCorreta() {
		int expected[] = new int[] { 25, 3840 };
		assertArrayEquals(expected, somaImparesMultiplicaPares.somaNumerosImparesMultiplicaNumerosPares(10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarUmaExcecaoParaNumeroNegativo() {
		somaImparesMultiplicaPares.somaNumerosImparesMultiplicaNumerosPares(-10);
	}
}
