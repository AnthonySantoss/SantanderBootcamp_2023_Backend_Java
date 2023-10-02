package Set.ListaDeTarefas;

public class Tarefa {

		private String descricao;
		private boolean tarefaFeita;
		
		
		public Tarefa(String descricao, boolean tarefaFeita) {
			this.descricao = descricao;
			this.tarefaFeita = tarefaFeita;
		}


		public String getDescricao() {
			return descricao;
		}

		public void setTarefaFeita(boolean tarefaFeita) {
			this.tarefaFeita = tarefaFeita;
		}
		
		public boolean isTarefaFeita() {
			return tarefaFeita;
		}


		@Override
		public String toString() {
			return "Tarefa: Descrição = " + descricao 
					+ ", Tarefa feita = " 
					+ tarefaFeita ;
		}
		
			
		
}
