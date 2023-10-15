package one.DigitalInnovation.gof;

/**
 * Singleton "Lazy Holder"
 * 
 * @author Eublck
 */

public class SingletonLazyHolder {

	private static class Holder {
	private static SingletonLazyHolder instancia;
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}
}
