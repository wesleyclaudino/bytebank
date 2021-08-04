package bytebank;

public class ContaCorrente extends Conta implements Tributavel {
	private double taxa;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public boolean saca(double valor) {
		if(super.saldo >= valor + getValorImposto()) {
			super.saldo -= valor + getValorImposto();
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor + getValorImposto()) {
			this.saldo -= valor + getValorImposto();
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	public double setTaxa() {
		this.taxa = 0.05;
		return taxa;
	}
}