package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1337, 24225);
		primeiraConta.setTitular(new Cliente());
		
		primeiraConta.deposita(200);
		
		primeiraConta.getTitular().setNome("Primeira Conta");
		System.out.println("\n Bem-vindo(a), " + primeiraConta.getTitular().getNome() + "\n Seu saldo é de: " + primeiraConta.getSaldo());
	}
}