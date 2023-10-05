package map.ordencao.agendaEventos;

import java.security.KeyStore.Entry;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;

	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventoMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
	Map<LocalDate, Evento> agendaEventos = new TreeMap<>(eventoMap);
		System.out.println(agendaEventos);
	}
	
	public void obterProximoEvento() {
		  LocalDate dataAtual = LocalDate.now();
		    LocalDate proximaData = null;
		    Evento proximoEvento = null;
		    for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
		      LocalDate dataEvento = entry.getKey();
		      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
		        proximaData = dataEvento;
		        proximoEvento = entry.getValue();
		        break;
		      }
		    }
		    if (proximoEvento != null) {
		      System.out.println("O próximo evento: " + proximoEvento.getNomeDoEvento() + " acontecerá na data " + proximaData);
		    } else {
		      System.out.println("Não há eventos futuros na agenda.");
		    }
		  }
	
	
	public static void main(String[] args) {
		AgendaEventos evento = new AgendaEventos();
		
		
		
	}
	
}
