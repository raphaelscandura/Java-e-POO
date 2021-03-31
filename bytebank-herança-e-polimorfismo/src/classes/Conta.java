package classes;

public abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0;
	
	public Conta(int agencia, int numero) {
		Conta.totalContas++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficiente {
		if(this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo atual: " + this.saldo + " Saque desejado: " + valor);
		}this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficiente {
			this.saldo -= valor;
			destino.deposita(valor);
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
}