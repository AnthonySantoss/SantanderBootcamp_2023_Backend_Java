package Set.Ordenacao;

public class main {
		
	public static void main(String[] args) {
		
		CadastroDeProduto cadastro = new CadastroDeProduto();
		
		
		cadastro.adicionarProduto(7891, "A", 150, 10);
		cadastro.adicionarProduto(7897, "B", 250, 10);
		cadastro.adicionarProduto(7895, "C", 100, 10);
		cadastro.adicionarProduto(7894, "D", 300, 10);
		
		cadastro.exibirProdutosPorNome();
		
		System.out.println("=========================");
		
		cadastro.exibirProdutosPorPreco();
		
		System.out.println(cadastro.exibirProdutosPorPreco());
		
	}
}
