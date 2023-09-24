package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefa {
	//atributo
	
	private List<tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<tarefa> tarefaParaRemover = new ArrayList<>();
		for (tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);	
	}
	
	public static void main(String[] args) {
		ListaTarefa listTarefa= new ListaTarefa();
		System.out.println("O número total de tarefas é: " + listTarefa.obterNumeroTotalTarefas());
	
		listTarefa.adicionarTarefa("Tarefa 1");
		listTarefa.adicionarTarefa("Tarefa 1");
		listTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de tarefas é: " + listTarefa.obterNumeroTotalTarefas());
	
		listTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de tarefas é: " + listTarefa.obterNumeroTotalTarefas());
	
		listTarefa.obterDescricoesTarefas();
	}
}
