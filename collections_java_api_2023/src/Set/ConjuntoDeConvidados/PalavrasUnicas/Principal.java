package Set.ConjuntoDeConvidados.PalavrasUnicas;

public class Principal {

	public static void main(String[] args) {
	
		ConjuntoPalavrasUnicas palavraUnica = new ConjuntoPalavrasUnicas();
		
		palavraUnica.exibirPalavrasUnicas();
		
		palavraUnica.adicionarPalavra("Anthony");
		palavraUnica.adicionarPalavra("Anthony");
		palavraUnica.adicionarPalavra("Lets");
		System.out.println("---------------------------");
		System.out.println("Palavra Removida: ");
		System.out.println("---------------------------");
		palavraUnica.removerPalavra("Anthony");
		
		System.out.println("---------------------------");
		System.out.println("Verificação para ver se a palavra está na lista: ");
		System.out.println("---------------------------");
		palavraUnica.verificarPalavra("Anthony");
		
		System.out.println("---------------------------");
		System.out.println("Palavra Adicionadas: ");
		System.out.println("---------------------------");
		
		palavraUnica.exibirPalavrasUnicas();
		
	}
}
