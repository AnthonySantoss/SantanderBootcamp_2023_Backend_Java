package Set.ListaDeTarefas;

public class main {
	
	public static void main(String[] args) {
		
		ListaTarefas listaDeTarefas = new ListaTarefas();
		
		listaDeTarefas.adicionarTarefa("Lava prato");
		listaDeTarefas.adicionarTarefa("Treina");
		listaDeTarefas.adicionarTarefa("Comer");
		listaDeTarefas.adicionarTarefa("Estudar");
		
		listaDeTarefas.removerTarefa("Lava prato");
		System.out.println("=========================");
		listaDeTarefas.exibirTarefas();
		System.out.println("=========================");
		listaDeTarefas.contarTarefas();
		System.out.println("=========================");
		
		listaDeTarefas.TarefasConcluidas("Estudar");
		listaDeTarefas.TarefasConcluidas("Treina");
		
		listaDeTarefas.obterTarefasConcluidas();
		
		listaDeTarefas.TarefasPendentes("Estudar");	
		System.out.println("=========================");
		listaDeTarefas.obterTarefasPendentes();
		System.out.println("=========================");
		listaDeTarefas.limparListaTarefas();
		
		
	
		
	}

}
