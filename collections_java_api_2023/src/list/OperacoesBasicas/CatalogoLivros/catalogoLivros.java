package list.OperacoesBasicas.CatalogoLivros;
import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {
	
	private List<livro> listaLivro;

	
	
	public catalogoLivros() {
		this.listaLivro = new ArrayList<>();
	}


	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivro.add(new livro(titulo, autor, anoPublicacao));
	}
	
	public List<livro> pesquisarPorAutor(String autor) {
	List<livro> pesquisaPorAutor = new ArrayList<>();
	if (!listaLivro.isEmpty()) {
		for (livro livro : listaLivro ) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				pesquisaPorAutor.add(livro);
				System.out.println(pesquisaPorAutor);
			}
		}
		return pesquisaPorAutor;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	
	}
	
	public List<livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
	List<livro> pesquisaPorIntervaloAnos = new ArrayList<>();
	if (!listaLivro.isEmpty()) {
		for (livro livro : listaLivro) {
			if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
				pesquisaPorIntervaloAnos.add(livro);
				System.out.println(pesquisaPorIntervaloAnos);
			}
		}
		return pesquisaPorIntervaloAnos;
	}else {
		throw new RuntimeException("A lista está vazia!");
	}
	}
	
	public livro pesquisarPorTitulo(String titulo) {
	  livro pesquisaPorTitulo = null;	
	if (!listaLivro.isEmpty()) {
		for (livro livro : listaLivro) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				pesquisaPorTitulo = livro;
				System.out.println(pesquisaPorTitulo);
				break;
			}
		}
		return pesquisaPorTitulo;
	}else {
		throw new RuntimeException("A lista está vazia!");
	}
	
	}
	
	public static void main(String[] args) {
	catalogoLivros catalogoBook = new catalogoLivros();
	
	
	catalogoBook.adicionarLivro("Mentes", "LM", 1980);
	catalogoBook.adicionarLivro("O", "L", 2014);
	catalogoBook.adicionarLivro("Show", "A", 2010);
	catalogoBook.adicionarLivro("lar", "LM", 2015);
	catalogoBook.adicionarLivro("cadeira", "LM", 2014);
	
	System.out.println("--------------------------");
	System.out.println("Pesquisa por autor");
	System.out.println("--------------------------");
	
	catalogoBook.pesquisarPorAutor("LM");
	
	System.out.println("--------------------------");
	System.out.println("Pesquisa por intervalo");
	System.out.println("--------------------------");
	
	catalogoBook.pesquisarPorIntervaloAnos(1980, 2015);
	
	System.out.println("--------------------------");
	System.out.println("Pesquisa por título");
	System.out.println("--------------------------");
	
	catalogoBook.pesquisarPorTitulo("Show");
	}
}

