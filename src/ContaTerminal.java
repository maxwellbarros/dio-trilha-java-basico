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
	
		System.out.println("Ol� " + nome + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + " ,conta " + numeroConta + " e seu saldo " + saldo + " j� est� dispon�vel para saque");

		scanner.close();

	}

}
