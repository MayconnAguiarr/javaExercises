package exercicio1;

public class MaiorNumero { 

	public int maiorValor(int valor1, int valor2) {
		if ((valor1 < 0) || valor2 < 0) {
			throw new IllegalArgumentException("Não é permitido números negativos");
		}
		int maior = 0;
		
		if (valor1 > valor2) {
			maior = valor1;
		} else if (valor2 > valor1) {
			maior = valor2;
		}
		return maior;
	}
}
