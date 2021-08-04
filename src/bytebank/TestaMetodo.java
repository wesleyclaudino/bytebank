package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoFulano = new ContaPoupanca(1337, 24226);
		
		contaDoFulano.getTitular().setNome("Fulano da Silva");

		contaDoFulano.deposita(100);
		System.out.println("Depósito feito com sucesso. " + contaDoFulano.getTitular().getNome() + ", seu novo saldo é de: " + contaDoFulano.getSaldo() + " R$");
		
		contaDoFulano.saca(20);
		System.out.println("Saque efetuado com sucesso. " + contaDoFulano.getTitular().getNome() + ", seu novo saldo é de: " + contaDoFulano.getSaldo() + " R$");
		
		Conta contaDoSicrano = new ContaCorrente(1337, 24227);
		
		contaDoSicrano.getTitular().setNome("Sicrano Avelar");
		
		contaDoSicrano.deposita(1000);
		System.out.println("Depósito feito com sucesso. " + contaDoSicrano.getTitular().getNome() + ", seu novo saldo é de: " + contaDoSicrano.getSaldo() + " R$");
		
		if(contaDoSicrano.transfere(300, contaDoFulano)) {
			System.out.println("Transferência de " + contaDoSicrano.getTitular().getNome() + " para " + contaDoFulano.getTitular().getNome() + ", foi feita com sucesso, seu novo saldo é de: " + contaDoSicrano.getSaldo() + " R$");
		}else {
			System.out.println("Falha na transferência. Seu saldo não é suficiente.");
		}
		System.out.println("Novo saldo de " + contaDoFulano.getTitular().getNome() + ": " + contaDoFulano.getSaldo() + " R$");
	}
}