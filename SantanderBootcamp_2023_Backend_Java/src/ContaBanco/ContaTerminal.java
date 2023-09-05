package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
		int numero;
		String agencia, nomeDoCliente;
		Double saldo;
		
		System.out.println("Por favor, digite o seu nome e sobrenome: ");
		nomeDoCliente = scan.nextLine();
		System.out.println("Por favor, digite o numero da conta: ");
		numero = scan.nextInt();
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = scan.next();
		System.out.println("Por favor, digite o o deposito inicial para abertura de conta: ");
		saldo = scan.nextDouble();
		
		System.out.println("Olá " + nomeDoCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		

	}

}
