package map.operacoesBasicas.dicionario;

public class DicionarioSistema {
	
	public static void main(String[] args) {
		
		Dicionario dicionarioApp = new Dicionario();
		
		dicionarioApp.exibirPalavras();
		
		dicionarioApp.adicionarPalavra("A", "a");
		dicionarioApp.adicionarPalavra("B", "b");
		dicionarioApp.adicionarPalavra("C", "c");
		dicionarioApp.adicionarPalavra("D", "d");
		
		dicionarioApp.removerPalavra("B");
		
		dicionarioApp.pesquisarPorPalavra("A");
		
		dicionarioApp.exibirPalavras();
		
		
	}

}
