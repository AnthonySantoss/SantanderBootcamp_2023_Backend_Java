package umlIphone;

import java.util.List;

public class Iphone implements Musica, Telefone, Navegador {
	
	private List<Musica> ipadList;
	
	private List<Telefone> agendaList;
	
	private char navegador;
	
	public void musicaSelecionada() {
		selecionarMusica();
	}
	
	public void reproduzirMusica() {
		tocar();
	}
	
	public void pausarMusica() {
		pausar();
	}
	
	public void ligando() {
		ligar();
	}
	
	public void atendendo() {
		atender();
	}
	
	public void recebendoCorreioDeVoz() {
		iniciarCorreioVoz();
	}

	
	public void adicionarPagina() {
		adicionarNovaPagina();
	}
	
	public void abrirPagina() {
		exibirPagina();
	}
	
	public void atualizandoPagina() {
		atualizarPagina();
	}
public static void main(String[] args) {
	
	Iphone myIphone = new Iphone();
	
	myIphone.selecionarMusica();
	
	myIphone.reproduzirMusica();
	
	myIphone.pausar();
	
	myIphone.adicionarPagina();
	
	myIphone.abrirPagina();
	
	myIphone.atualizandoPagina();
	
	myIphone.ligando();
	
	myIphone.atendendo();
	
	myIphone.recebendoCorreioDeVoz();
	
}

@Override
public void tocar() {
	System.out.println("Música reproduzindo");
	
}

@Override
public void pausar() {
	System.out.println("Música pausada");
	
}

@Override
public void selecionarMusica() {
	System.out.println("Música selecionada");
	
}

@Override
public void ligar() {
	System.out.println("Ligando");
	
}

@Override
public void atender() {
	System.out.println("Atendendo");
	
}

@Override
public void iniciarCorreioVoz() {
	System.out.println("Iniciando correio de voz");
	
}

@Override
public void adicionarNovaPagina() {
	System.out.println("Página adicionada");
	
}

@Override
public void exibirPagina() {
	System.out.println("Visualizando página");
	
}

@Override
public void atualizarPagina() {
	System.out.println("Atualizando página");
	
}




}
