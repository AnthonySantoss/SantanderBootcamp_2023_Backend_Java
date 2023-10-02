package Set.Ordenacao.ListaDeAlunos;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {

	private String nome;
	private Long matricula;
	private double media;

	public Alunos(String nome, Long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		return "Alunos nome=" + nome + ", matricula=" + matricula + ", media=" + media;
	}

	@Override
	public int compareTo(Alunos o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}

}

class ComparatorPorNota implements Comparator<Alunos> {

	@Override
	public int compare(Alunos o1, Alunos o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getMedia(), o2.getMedia());
	}

}
