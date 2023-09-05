package Sistema_SmartTV;

import java.util.Scanner;

public class SmartTv {
	Boolean ligada = false;
	
	int canal = 1;
	
	int volume = 10;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void trocarCanal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do canal desejo?");
		canal = sc.nextInt();
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
}
