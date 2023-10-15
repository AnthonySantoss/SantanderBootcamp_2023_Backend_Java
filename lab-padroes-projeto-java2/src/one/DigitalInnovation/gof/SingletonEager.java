package one.DigitalInnovation.gof;

/**
 * Singleton "apressado"
 * 
 * @author Eublck
 */

public class SingletonEager {

	private static SingletonEager instancia;

	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
