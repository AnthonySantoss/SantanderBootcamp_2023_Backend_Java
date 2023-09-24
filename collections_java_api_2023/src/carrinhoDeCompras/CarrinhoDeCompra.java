package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	
	// Declaração da lista que armazenará os itens no carrinho.
	private List<item> itemList;
	
	
	// Construtor da classe CarrinhoDeCompra.
	public CarrinhoDeCompra() {
		// Inicializa a lista de itens como uma lista vazia.
		this.itemList = new ArrayList<>();
	}

	// Método para adicionar um item ao carrinho.
	public void adicionarItem(String nome, double preco, int quantidade){
		// Cria um novo objeto 'item' com os parâmetros fornecidos.
		item item = new item (nome, preco, quantidade);
		// Adiciona o item à lista de itens no carrinho.
		this.itemList.add(item);
	}
	
	// Método para remover itens com base no nome.
	public void removerItem(String nome) {
		// Lista temporária para armazenar os itens a serem removidos.
		List<item> paraRemoverItem = new ArrayList<>();
		// Verifica se a lista de itens no carrinho não está vazia.
		if (!itemList.isEmpty()) {
			// Itera sobre os itens na lista.
			for(item i : itemList) {
				// Compara o nome do item (ignorando maiúsculas/minúsculas) com o nome fornecido.
				if(i.getNome().equalsIgnoreCase(nome)) {
					// Adiciona o item à lista de itens a serem removidos.
					paraRemoverItem.add(i);
				}
			}
			// Remove todos os itens da lista de itens a serem removidos.
			itemList.removeAll(paraRemoverItem);
		} else {
			// Se a lista estiver vazia, exibe uma mensagem.
			System.out.println("A lista está vazia!");
		}	
	}
	
	public double obterNumeroTotalTarefas() {
		// Inicializa uma variável para armazenar o valor total.
		double valorTotal = 0;
		// Verifica se a lista de itens não está vazia.
		if (!itemList.isEmpty()) {
			// Itera sobre os itens na lista.
			for (item i : itemList) {
				// Calcula o valor do item multiplicando seu preço pela quantidade.
				double valorItem = i.getPreco() * i.getQuantidade();
				// Adiciona o valor do item ao valor total.
				valorTotal += valorItem;
			}
			// Retorna o valor total.
			return valorTotal;
		} else {
			// Se a lista estiver vazia, lança uma exceção.
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItens() {
		// Verifica se a lista de itens não está vazia.
		if (!itemList.isEmpty()) {
			// Exibe os itens no carrinho.
			System.out.println(this.itemList);
		} else {
			// Se a lista estiver vazia, exibe uma mensagem.
			System.out.println("A lista está vazia!");
		}
	}

	public String toString() {
		// Retorna uma representação de string da classe CarrinhoDeCompra.
		return "CarrinhoDeCompras{" +
		        "itens=" + itemList +
		        '}';
	}

	public static void main(String[] args) {
		// Cria uma instância de CarrinhoDeCompra.
		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		
		// Adiciona itens ao carrinho.
		carrinhoDeCompra.adicionarItem("capinha", 10, 1);
		carrinhoDeCompra.adicionarItem("tela", 100, 1);
		carrinhoDeCompra.adicionarItem("carregador", 40, 1);
		
		// Exibe os itens no carrinho.
		carrinhoDeCompra.exibirItens();
		
		// Remove um item do carrinho.
		carrinhoDeCompra.removerItem("capinha");
		
		// Exibe os itens atualizados no carrinho.
		carrinhoDeCompra.exibirItens();
		
		// Calcula e exibe o valor total dos itens no carrinho.
		System.out.println("------------------------------");
		System.out.println("Valor total: " + carrinhoDeCompra.obterNumeroTotalTarefas());
	}

}
