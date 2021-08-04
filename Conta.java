package bytebank;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private int operacao;
	private Titular titular;
	private static int totalDeContas;
	
	public Conta(int agencia, int numero) {
		this.titular = new Titular();
		totalDeContas++;
		this.agencia = agencia;
		this.numero = numero;
	}
	public abstract void deposita(double valor);
	public abstract boolean saca(double valor);
	public abstract boolean transfere(double valor, Conta destino);
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor inválido.");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor inválido.");
			return;
		}
		this.numero = numero;
	}
	
	public int getOperacao() {
		return this.operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return totalDeContas;
	}
}