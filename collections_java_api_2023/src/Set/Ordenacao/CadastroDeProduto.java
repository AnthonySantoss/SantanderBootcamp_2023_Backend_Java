package Set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProduto {

	private Set<Produto> SetcadastroDeProdutos;

	public CadastroDeProduto() {
		this.SetcadastroDeProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		SetcadastroDeProdutos.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public void exibirProdutosPorNome() {
		TreeSet<Produto> listaDeProdutosNome = new TreeSet<>(SetcadastroDeProdutos);
		for (Produto p : listaDeProdutosNome) {
			System.out.println("Produtos ordenado por nome: " + p.getNome());
		}
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> listaDeProdutosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		listaDeProdutosPorPreco.addAll(SetcadastroDeProdutos);
		return listaDeProdutosPorPreco;	
	}	
	
}
