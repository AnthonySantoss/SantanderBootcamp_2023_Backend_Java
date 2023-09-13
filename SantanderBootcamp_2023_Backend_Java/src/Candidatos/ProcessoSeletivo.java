package Candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato (String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
		
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indece do elemento");
		for (int indice = 0 ; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
		}
	}
	
	
	static void listaDeCandidatos () {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	
		int listaDeCandidatos = 0; 
		int canditatoAtual = 0;
		double salarioBase = 2000.0;
		while (listaDeCandidatos < 5 && canditatoAtual < candidatos.length) {
			String candidato = candidatos[canditatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				listaDeCandidatos++;
			} else {
				System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
			}
			
			canditatoAtual++;
		}
	}
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCadidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} 
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
