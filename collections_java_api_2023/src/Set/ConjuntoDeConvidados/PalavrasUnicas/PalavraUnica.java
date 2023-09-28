package Set.ConjuntoDeConvidados.PalavrasUnicas;

public class PalavraUnica {

	private String palavra;

	public PalavraUnica(String palavra) {
		this.palavra = palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	@Override
	public String toString() {
		return "PalavraUnica: palavra=" 
	+ palavra;
	}
	
	
}
