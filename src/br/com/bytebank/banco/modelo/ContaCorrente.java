package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	private double taxa;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		if(super.saldo < valor + getValorImposto()) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
			super.saldo -= valor + getValorImposto();
	}
	
	@Override
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * this.taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	public double setTaxa() {
		this.taxa = 0.05;
		return taxa;
	}
}