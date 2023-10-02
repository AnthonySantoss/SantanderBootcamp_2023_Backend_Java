package ordena��o.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> listPessoa;
	
	
	
	public OrdenacaoPessoas() {
		this.listPessoa = new ArrayList<>();
	}



	public void adicionarPessoa(String nome, int idade, double altura) {
		listPessoa.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade()  {
	List<Pessoa> listPorIdade = new ArrayList<>(listPessoa);
	Collections.sort(listPorIdade);
	return listPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
	List<Pessoa> listPorAltura = new ArrayList<>(listPessoa);
	Collections.sort(listPorAltura, new comparatorPorAltura());
	return listPorAltura;
	}
	
	public void exibirPessoas() {
		if(!listPessoa.isEmpty()) {
			for(Pessoa p  : listPessoa) {
				System.out.println("Pessoas: " + p);
			}
		}
	}
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas pessoa = new OrdenacaoPessoas();
		
		pessoa.adicionarPessoa("Anthony", 22, 1.70);
		pessoa.adicionarPessoa("Olga", 10, 1.50);
		pessoa.adicionarPessoa("Leila", 4, 1.20);
		pessoa.adicionarPessoa("Letícia", 20, 1.68);
		pessoa.adicionarPessoa("Margarete", 53, 1.68);
		
		System.out.println("Ordenação por idade: " + pessoa.ordenarPorIdade());
	
		System.out.println("Ordebação por altura: " + pessoa.ordenarPorAltura());
	
		
		System.out.println("================================");
		
		pessoa.exibirPessoas();
	}
}



