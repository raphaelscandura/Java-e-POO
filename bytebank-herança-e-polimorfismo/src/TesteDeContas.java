
public class TesteDeContas {

	public static void main(String[] args) {
		
		ContaCorrente itau = new ContaCorrente(22,222);
		itau.deposita(100);
		
		ContaPoupanca bradesco = new ContaPoupanca(11,111);
		bradesco.deposita(200);
		
		try {
			bradesco.transfere(50, itau);			
			bradesco.saca(955);
		}catch(SaldoInsuficiente ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		
		
		System.out.println("Itau: " + itau.getSaldo());
		System.out.println("Bradesco: " + bradesco.getSaldo());

	}

}
