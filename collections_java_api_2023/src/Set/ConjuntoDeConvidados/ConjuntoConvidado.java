package Set.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
	
	private Set<Convidado> setConvidados;

	public ConjuntoConvidado() {
		this.setConvidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		setConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : setConvidados) {
			if (c.getCodigoConvidado() == codigoConvite) {
				convidadoParaRemover = c;
			break;
			}
		}
		setConvidados.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return setConvidados.size();
	}
	
	public void exbirConvidados() {
		System.out.println(setConvidados);
	}
	

}
