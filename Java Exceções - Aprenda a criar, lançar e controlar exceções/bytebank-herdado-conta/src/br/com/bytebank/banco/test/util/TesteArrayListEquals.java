package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);

		boolean existe = lista.contains(cc3);

		if(existe){
			System.out.println("Já existe");
		}else{
			System.out.println("Não existe");
		}	
		
		//System.out.println("A conta 1 é igual a conta 2? " + cc.ehIgual(cc2));
		//System.out.println("A conta 2 é igual a conta 3? " + cc2.ehIgual(cc3)); 

		for(Conta conta : lista) {
			System.out.println(conta);
		}	
		
	}
}
