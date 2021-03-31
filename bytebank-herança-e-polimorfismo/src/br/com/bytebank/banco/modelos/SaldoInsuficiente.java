package br.com.bytebank.banco.modelos;

public class SaldoInsuficiente extends Exception{
	
	public SaldoInsuficiente(String msg) {
		super(msg);
	}

}
