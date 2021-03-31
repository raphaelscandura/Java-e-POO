package Testes;

public class TesteDeContas {

	public static void main(String[] args) {
		
		classes.ContaCorrente itau = new classes.ContaCorrente(22,222);
		itau.deposita(100);
		
		classes.ContaPoupanca bradesco = new classes.ContaPoupanca(11,111);
		bradesco.deposita(200);
		
		try {
			bradesco.transfere(50, itau);			
			bradesco.saca(955);
		}catch(classes.SaldoInsuficiente ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		
		
		System.out.println("Itau: " + itau.getSaldo());
		System.out.println("Bradesco: " + bradesco.getSaldo());

	}

}
