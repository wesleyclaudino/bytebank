package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo += 200;
		primeiraConta.agencia = 123;
		primeiraConta.numero = 10;
		primeiraConta.titular = "Fulano da Silva";
		
		System.out.println("\n Bem-vindo(a), " + primeiraConta.titular + "\n Seu saldo é de: " + primeiraConta.saldo);
	}
}