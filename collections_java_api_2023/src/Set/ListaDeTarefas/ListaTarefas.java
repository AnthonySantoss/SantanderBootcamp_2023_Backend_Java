package Set.ListaDeTarefas;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> SetlistaTarefas;

	public ListaTarefas() {
		SetlistaTarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		SetlistaTarefas.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa t : SetlistaTarefas) {
			if(t.getDescricao().contains(descricao)) {
				System.out.println("A tarefa encontrada foi: " + t.getDescricao());
				tarefaParaRemover = t;
				break;
			}
		}
		SetlistaTarefas.remove(tarefaParaRemover);
		System.out.println("A tarefa removida foi: " + tarefaParaRemover);
	}
	
	public void exibirTarefas(){
		System.out.println(SetlistaTarefas);
	}
	
	public void contarTarefas() {
		System.out.println("O número de tarafes é: " + SetlistaTarefas.size());
	}
	
	public void TarefasConcluidas(String descricao) {
		Set<Tarefa> botaoDeConluir = new HashSet<>();
		for (Tarefa t : SetlistaTarefas) {
			if(t.getDescricao().contains(descricao)) {
				t.setTarefaFeita(true);
				break;
			}
			botaoDeConluir.add(t);
		}
	}
	
	public void TarefasPendentes(String descricao) {
		Set<Tarefa> botaoPendente = new HashSet<>();
		for (Tarefa t : SetlistaTarefas) {
			if(t.getDescricao().contains(descricao)) {
				t.setTarefaFeita(false);
				break;
			}
			botaoPendente.add(t);
		}
	}
	
	public void obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : SetlistaTarefas ) {
			if(t.isTarefaFeita() == true) {
				tarefasConcluidas.add(t);
			}
				
			}
		System.out.println("As tarafes concluidos: " + tarefasConcluidas);
		}
	
	public void obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : SetlistaTarefas ) {
			if(t.isTarefaFeita() == false) {
				tarefasPendentes.add(t);
			}
				
			}
		System.out.println("As tarafes pendentes: " + tarefasPendentes);
				
			}
	
	public void limparListaTarefas() {
		SetlistaTarefas.clear();
		System.out.println("Lista de tarefas removida! " + SetlistaTarefas);
	}

}
