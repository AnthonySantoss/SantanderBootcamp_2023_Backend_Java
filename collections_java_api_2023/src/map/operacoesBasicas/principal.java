package map.operacoesBasicas;

public class principal {
	
	public static void main(String[] args) {
		
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.exibirContatos();
		
		contatos.adicionarContato("Anthony", 79999594);
		contatos.adicionarContato("L", 79999);
		contatos.adicionarContato("O.M", 799);
		
		contatos.exibirContatos();
		
		contatos.removerContato("Anthony");
		
		contatos.pesquisarPorNome("O.M");
		
		contatos.exibirContatos();
	}

}
