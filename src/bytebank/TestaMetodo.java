package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoFulano = new Conta();
		contaDoFulano.titular = new Cliente();
		
		contaDoFulano.titular.nome = "Fulano da Silva";

		contaDoFulano.deposita(100);
		System.out.println("Depósito feito com sucesso. " + contaDoFulano.titular.nome + ", seu novo saldo é de: " + contaDoFulano.saldo);
		
		contaDoFulano.saca(20);
		System.out.println("Saque efetuado com sucesso. " + contaDoFulano.titular.nome + ", seu novo saldo é de: " + contaDoFulano.saldo);
		
		Conta contaDoSicrano = new Conta();
		contaDoSicrano.titular = new Cliente();
		
		contaDoSicrano.titular.nome = "Sicrano Avelar";
		
		contaDoSicrano.deposita(1000);
		System.out.println("Depósito feito com sucesso. " + contaDoSicrano.titular.nome + ", seu novo saldo é de: " + contaDoSicrano.saldo);
		
		if(contaDoSicrano.transfere(300, contaDoFulano)) {
			System.out.println("Transferência de " + contaDoSicrano.titular.nome + " para " + contaDoFulano.titular.nome + ", foi feita com sucesso, seu novo saldo é de: " + contaDoSicrano.saldo);
		}else {
			System.out.println("Falha na transferência. Seu saldo não é suficiente.");
		}
		System.out.println("Novo saldo de " + contaDoFulano.titular.nome + ": " + contaDoFulano.saldo);
	}
}