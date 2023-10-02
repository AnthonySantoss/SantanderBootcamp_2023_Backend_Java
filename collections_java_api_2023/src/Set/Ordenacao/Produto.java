package Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public long getCod() {
		return cod;
	}


	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	@Override
	public String toString() {
		return "Produto: nome=" + nome + 
				", cod=" + cod + 
				", preco=" + preco + 
				", quantidade=" + quantidade;
	}


	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getNome());
	}
		
	
}
class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
	
}
