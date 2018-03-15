package exercicio1;

import java.util.Scanner;

public class Main {
	
	private static MaiorNumero maiorNumero = new MaiorNumero();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Digite o primeiro valor");
		String valor1 = input.nextLine().trim();
		
		System.out.println("Digite o segundo valor");
		String valor2 = input.nextLine().trim();
		
		int retorno = maiorNumero.maiorValor(Integer.parseInt(valor1) , Integer.parseInt(valor2));
		
		System.out.println("O maior valor é: " + retorno);
	}
}
