import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
			
		System.out.print("Digite a conta ");
		int numeroConta = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("Digite a agencia ");
		String agencia = scanner.nextLine();
		
		System.out.print("Digite o saldo");
		double saldo = scanner.nextDouble();
	
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

		scanner.close();

	}

}
