package Set.ConjuntoDeConvidados.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<Palavra> palavrasUnicasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add( new Palavra(palavra));
	}

	public void removerPalavra(String palavra) {
	Palavra palavraParaRemover = null;
		for (Palavra p : palavrasUnicasSet) {
			if (p.getPalavra() == palavra) {
				palavraParaRemover = p;
				System.out.println(palavraParaRemover);
			break;	
			}
		}
	palavrasUnicasSet.remove(palavraParaRemover);
	}
	
	public void verificarPalavra(String palavra) {
	for (Palavra p : palavrasUnicasSet) {
			if (p.getPalavra().contains(palavra)) {
				System.out.println(p.getPalavra() + " está na lista");
			}
		}
	}
	
	public void exibirPalavrasUnicas() {
		if (!palavrasUnicasSet.isEmpty()) {
			System.out.println(palavrasUnicasSet);
		} else {
			System.out.println("Não foram adicionados as palavras!");
		}
		
	}
	
	
}
