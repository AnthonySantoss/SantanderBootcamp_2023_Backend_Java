package Set.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {

	private Set<Alunos> SetlistaDeAlunos;

	public GerenciadorDeAlunos() {
		this.SetlistaDeAlunos = new HashSet<>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		SetlistaDeAlunos.add(new Alunos(nome, matricula, media));
	}

	public void removerAlunoPorMatricula(long matricula) {
		Alunos alunoParaRemover = null;
		if (!SetlistaDeAlunos.isEmpty()) {
			for (Alunos a : SetlistaDeAlunos) {
				if (a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			SetlistaDeAlunos.remove(alunoParaRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}

		if (alunoParaRemover == null) {
			System.out.println("Matricula não encontrada!");
		}
	}

	public void exibirAlunosPorNome() {
		Set<Alunos> listaDeAlunosPorNome = new TreeSet<>(SetlistaDeAlunos);
		for (Alunos a : listaDeAlunosPorNome) {
			listaDeAlunosPorNome.add(a);
		}
		System.out.println("Lista de aluno por nome: ");
		System.out.println(listaDeAlunosPorNome);

	}

	public Set<Alunos> exibirAlunosPorNota() {
		Set<Alunos> listaDeAlunosPorNota = new TreeSet<>(new ComparatorPorNota());
		listaDeAlunosPorNota.addAll(SetlistaDeAlunos);
		return listaDeAlunosPorNota;
	}

	public void exibirAlunos() {
		System.out.println(SetlistaDeAlunos);
	}

}
