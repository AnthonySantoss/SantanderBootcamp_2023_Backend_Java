package carrinhoDeCompras;

public class item {

	// Classe que representa um item que pode ser adicionado ao carrinho de compras.
	private String nome;        // Variável para armazenar o nome do item.
	private int quantidade;     // Variável para armazenar a quantidade do item.
	private double preco;       // Variável para armazenar o preço do item.

	// Construtor da classe 'item' que inicializa os atributos do item.
	public item(String nome, double preco, int quantidade) {
	    this.nome = nome;
	    this.preco = preco;
	    this.quantidade = quantidade;
	}

	// Método para obter o nome do item.
	public String getNome() {
	    return nome;
	}

	// Método para obter o preço unitário do item.
	public double getPreco() {
	    return preco;
	}

	// Método para obter a quantidade do item.
	public int getQuantidade() {
	    return quantidade;
	}

	// Sobrescrita do método toString para retornar uma representação em string do item.
	@Override
	public String toString() {
	    return 
	            "nome='" + nome + '\'' +        // Retorna o nome do item.
	            ", preco=" + preco +           // Retorna o preço do item.
	            ", quant=" + quantidade +      // Retorna a quantidade do item.
	            "  //  ";                      // Separação para facilitar a leitura em conjunto com outros itens.
	}

	
	
	
	
}
