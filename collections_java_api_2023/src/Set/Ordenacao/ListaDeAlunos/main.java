package Set.Ordenacao.ListaDeAlunos;

public class main {

	public static void main(String[] args) {

		GerenciadorDeAlunos listaDeAlunos = new GerenciadorDeAlunos();

		listaDeAlunos.adicionarAluno("Anthony", 3456l, 7.5);
		listaDeAlunos.adicionarAluno("Silva", 3447l, 7.5);

		listaDeAlunos.removerAlunoPorMatricula(3456l);

		listaDeAlunos.exibirAlunosPorNome();

		listaDeAlunos.exibirAlunos();
	}
}
