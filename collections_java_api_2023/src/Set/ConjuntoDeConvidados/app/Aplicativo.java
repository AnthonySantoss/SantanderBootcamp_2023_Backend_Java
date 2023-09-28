package Set.ConjuntoDeConvidados.app;

import Set.ConjuntoDeConvidados.ConjuntoConvidado;

public class Aplicativo {

	public static void main(String[] args) {
	
	  ConjuntoConvidado convite = new ConjuntoConvidado();
	  
	  convite.exbirConvidados();
	  
	  convite.adicionarConvidado("Anthony", 209);
	  convite.adicionarConvidado("Letícia", 200);
	  convite.adicionarConvidado("Leila", 4);
	  convite.adicionarConvidado("Anthony", 209);
	  
	  convite.removerConvidadoPorCodigoConvite(209);
	  
	  
	  System.out.println(convite.contarConvidados()); 
	  
	  convite.exbirConvidados();
	}
}
