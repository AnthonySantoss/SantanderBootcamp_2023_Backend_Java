package list.OperacoesBasicas.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> num;

	public SomaNumeros() {
		this.num = new ArrayList<>();
	}

	public List<Integer> getNum() {
		return num;
	}
	
	
	public void adicionarNumero(int numero) {
		this.num.add(numero);
	}
	
	public int calcularSoma() {
	int soma = 0;
	for (Integer numero : num) {
		soma += numero;	
	}
	return soma;
	}
	
	public int encontrarMaiorNumero() {
	int valor = 0;
	if (!num.isEmpty()) {
		for (Integer num : num) {
			if (num >= valor) {
				valor = num;
			}
		}
	}
	return valor;
	}
	public int encontrarMenorNumero(){
		int valor = num.get(0);
		if(!num.isEmpty()) {
			for (Integer num : num) {
				if (num <= valor) {
					valor = num;
				}	
			}
		}
		return valor;
	}
	public void exibirNumeros() {
	List<Integer> listaDeNumeros = new ArrayList<>();
		if (!num.isEmpty()) {
			for (Integer num : num) {
				listaDeNumeros.add(num);
				System.out.println(listaDeNumeros);
			}
		}
		
	}
	
	public static void main(String[] args) {
		SomaNumeros somaDeNumeros = new SomaNumeros();
		
		somaDeNumeros.adicionarNumero(150);
		somaDeNumeros.adicionarNumero(15);
		somaDeNumeros.adicionarNumero(800);
		somaDeNumeros.adicionarNumero(550);
		somaDeNumeros.adicionarNumero(88);
		
		System.out.println("Soma total: " + somaDeNumeros.calcularSoma());
		
		System.out.println("Maior número: " + somaDeNumeros.encontrarMaiorNumero());
		
		System.out.println("Menor número: " + somaDeNumeros.encontrarMenorNumero());
		
		somaDeNumeros.exibirNumeros();
	}
	
	}
	
