package exercicio3;

public class SomaImparesMultiplicaPares {

	public int[] somaNumerosImparesMultiplicaNumerosPares(int Numero) {
		if(Numero < 0) {
			throw new IllegalArgumentException("Não permitido números negativos");
		}		
		
		int somaNumImpares = 0;
		int multiplicaNumPares = 1;

		for (int x = 1; x <= Numero; x++) {
			if (x % 2 != 0) { 
				somaNumImpares += x;
			} else {
				multiplicaNumPares *= x;
			}
		}		
		return new int[] { somaNumImpares, multiplicaNumPares };
	}
}
