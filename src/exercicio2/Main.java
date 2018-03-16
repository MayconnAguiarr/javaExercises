package exercicio2;

public class Main {	
	
	private static Agenda agenda = new Agenda();
	
	public static void main(String[] args) {	
				
		Contato contato1 = new Contato("Maycon", "maycon@gmail.com");
		Contato contato2 = new Contato("Jorge", "jorge@gmail.com");
		Contato contato3 = new Contato("Thaila", "Thaila@gmail.com");
		Contato contato4 = new Contato("Rodrigo", "Rodrigo@gmail.com");
		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);
		agenda.adicionarContato(contato3);
		agenda.adicionarContato(contato4);		
		
		System.out.println("Contatos Inseridos:");
		System.out.println(agenda.listar());
		System.out.println(" ");

		System.out.println("Consulta:");		
		System.out.println(agenda.buscarPor("Maycon"));
		System.out.println(" ");
		
		System.out.println("Nova lista após remover: " + contato3.getNome() + " e " + contato4.getNome());
		agenda.removerContato(contato3);
		agenda.removerContato(contato4);
		System.out.println(agenda.listar());		
	}		
}
