package map.contagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class CotagemPalavras {
	
	private Map<String, Integer> contagemMap;

	public CotagemPalavras() {
		this.contagemMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if (!contagemMap.isEmpty()) {
		 contagemMap.remove(palavra);
		} else {
			System.out.println("Não tem palavras!");
		}
	}
	
	public int exibirContagemPalavras() {
		   int contagemTotal = 0;
		    for (int contagem : contagemMap.values()) {
		      contagemTotal += contagem;
		    }
		    return contagemTotal;
	}

	
	public String encontrarPalavraMaisFrequente(){
		 String linguagemMaisFrequente = null;
		    int maiorContagem = 0;
		    for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
		      if (entry.getValue() > maiorContagem) {
		        maiorContagem = entry.getValue();
		        linguagemMaisFrequente = entry.getKey();
		      }
		    }
		    return linguagemMaisFrequente;
	}
	
	
	public static void main(String[] args) {
		CotagemPalavras contagem = new CotagemPalavras();
		
		contagem.adicionarPalavra(null, null);
		contagem.adicionarPalavra(null, null);
		contagem.adicionarPalavra(null, null);
		contagem.adicionarPalavra(null, null);
		
		System.out.println("Tem " + contagem.exibirContagemPalavras());
		
		String linguagemMaisFrequente = contagem.encontrarPalavraMaisFrequente();
		System.out.println("A palavra mais frequente é: " +  linguagemMaisFrequente);
		
	}
}
