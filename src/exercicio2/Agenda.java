package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {

	private List<Contato> contatos = new ArrayList<>();

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void removerContato(Contato contato) {
		contatos.remove(contato);
	}

	public List listar() {
		return contatos.stream().map(c -> c.getNome()).collect(Collectors.toList());
	}
	
	public List buscarPor(String nome) {
		return contatos.stream().filter(c -> c.getNome() == nome).map(c -> c.getNome()).collect(Collectors.toList());
	}
}
