package Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> SetagendaDeContato;

	public AgendaContatos() {
		SetagendaDeContato = new HashSet<>();
	}
	
	private void adicionarContato(String nome, int numero) {
		SetagendaDeContato.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		if(!SetagendaDeContato.isEmpty()) {
			System.out.println(SetagendaDeContato);
		} else {
			System.out.println("Sua agenda de contatos está vazia!");
		}	
	}
	
	public void pesquisarPorNome(String nome) {
		for (Contato c : SetagendaDeContato) {
			if (c.getNome().contains(nome)) {
				System.out.println("O contato encontrado foi: " + c.getNome() + " ; Número de telefone: " + c.getNumero());
			}
		}
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for (Contato c : SetagendaDeContato) {
			if(c.getNome().contains(nome)) {
				System.out.println("O contato encontrado foi: " + c.getNome() + " ; Número de telefone: " + c.getNumero());
				SetagendaDeContato.remove(c);
				System.out.println("O número removido foi: " + c.getNumero());
				SetagendaDeContato.add(new Contato(nome, novoNumero) );
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		AgendaContatos agenda = new AgendaContatos();
		
		System.out.println("----------------------------");
		System.out.println("AGENDA DE CONTATOS");
		System.out.println("----------------------------");
		
		agenda.exibirContatos();
		
		agenda.adicionarContato("Anthony",999594742);
		agenda.adicionarContato("L",999594743);
		agenda.adicionarContato("Anthony Gabriel",999594745);
		
		System.out.println("----------------------------");
		System.out.println("Pesquisa por nome");
		System.out.println("----------------------------");
		
		agenda.pesquisarPorNome("Anthony");
		
		System.out.println("----------------------------");
		System.out.println("Atualizar número");
		System.out.println("----------------------------");
	
		agenda.atualizarNumeroContato("L", 1111111111);
		
		System.out.println("----------------------------");
		System.out.println("AGENDA DE CONTATOS");
		System.out.println("----------------------------");
		
		agenda.exibirContatos();
	}
	
}
