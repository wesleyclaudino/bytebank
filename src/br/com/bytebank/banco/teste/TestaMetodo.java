package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoFulano = new ContaPoupanca(1337, 24226);
		
		contaDoFulano.getTitular().setNome("Fulano da Silva");

		contaDoFulano.deposita(100);
		
		contaDoFulano.saca(20);
		
		Conta contaDoSicrano = new ContaCorrente(1337, 24227);
		
		contaDoSicrano.getTitular().setNome("Sicrano Avelar");
		
		contaDoSicrano.deposita(1000);
		
		contaDoSicrano.transfere(300, contaDoFulano);
	}
}