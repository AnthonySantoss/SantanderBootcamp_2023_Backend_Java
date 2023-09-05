package Sistema_SmartTV;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.desligar();
		System.out.println("Novo status da TV -> " + "TV ligada? " + smartTv.ligada);
		
		smartTv.ligar();
		System.out.println("Novo status da TV -> " + "TV ligada? " + smartTv.ligada);

		smartTv.aumentarVolume();
		System.out.println("Volume aumentado para -> " + smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("Volume diminuiu para -> " + smartTv.volume);
				
		smartTv.aumentarCanal();
		System.out.println("Novo canal da tv -> " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("Novo canal da tv -> " + smartTv.canal);
		
		smartTv.trocarCanal();
		System.out.println("Novo canal da tv -> " + smartTv.canal);
		
		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual = " + smartTv.canal);
		System.out.println("Volume da TV = " + smartTv.volume);

	}

}
