package map.pesquisa.estoqueDeProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProduto {
	
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueDeProduto() {
		estoqueProdutoMap = new HashMap<>();
	}
	
	private void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
	}

	
	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}
	
	public double calcularValorTotalEstoque(){
		double valorTotalEstoque = 0;
		if(!estoqueProdutoMap.isEmpty()) {
			for (Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p : estoqueProdutoMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p : estoqueProdutoMap.values()) {
				if (p.getPreco() < menorPreco) {
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
	    Produto produtoMaiorQuantidadeValorNoEstoque = null;
	    double maiorValorTotalProdutoEstoque = 0d;
	    if (!estoqueProdutoMap.isEmpty()) {
	      for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
	        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
	        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
	          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
	          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
	        }
	      }
	    }
	    return produtoMaiorQuantidadeValorNoEstoque;
	  }
	
	public static void main(String[] args) {
		EstoqueDeProduto estoque = new EstoqueDeProduto();
		
		estoque.adicionarProduto(0, null, 0, 0);
		estoque.adicionarProduto(0, null, 0, 0);
		estoque.adicionarProduto(0, null, 0, 0);
		estoque.adicionarProduto(0, null, 0, 0);
		
		estoque.calcularValorTotalEstoque();
		
		estoque.exibirProdutos();
		
		estoque.obterProdutoMaisCaro();
		
		estoque.obterProdutoMaisBarato();
		
		estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	}
}
