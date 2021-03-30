class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0;
	
	public Conta(int agencia, int numero) {
		Conta.totalContas++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Depósito não realizado: O valor deve ser maior que 0");
			return;
		}
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saque não realizado: Não há saldo suficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else{
			System.out.println("Transferência não realizada: Não há saldo suficiente");
			return false;
		}
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