package exercicio3;

import java.util.Scanner;

public class Main {

	private static SomaImparesMultiplicaPares somaImparesMultiplicaPares = new SomaImparesMultiplicaPares();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor");
		String valor = input.nextLine().trim();

		int retorno[] = somaImparesMultiplicaPares.somaNumerosImparesMultiplicaNumerosPares(Integer.parseInt(valor));
		
		System.out.println("Soma total  números impares: " + retorno[0]);
		System.out.println("Multiplicação total números pares: " + retorno[1]);		
	}
}
