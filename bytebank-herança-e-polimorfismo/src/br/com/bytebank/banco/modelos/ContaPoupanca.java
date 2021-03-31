package br.com.bytebank.banco.modelos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficiente {
		double valorASacar = valor + 0.5;
		System.out.println("Cobrado uma taxa de 0,50 no saque de conta poupança");
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Depósito não realizado: O valor deve ser maior que 0");
			return;
		}
		this.saldo += valor;
	}
}


