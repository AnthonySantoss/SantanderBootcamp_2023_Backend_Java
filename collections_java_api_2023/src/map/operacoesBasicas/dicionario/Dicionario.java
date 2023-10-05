package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra){
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("Dicion�rio n�o tem palavras para remover");
		}
	}

	public void exibirPalavras() {
		System.out.println("DICION�RIO  " + dicionarioMap);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String definicaoPorPalavra = null;
		if (!dicionarioMap.isEmpty()) {
			definicaoPorPalavra = dicionarioMap.get(palavra);
			System.out.println("A defini��o encontrada foi: " + definicaoPorPalavra);
		}
		return definicaoPorPalavra;
	}
}
