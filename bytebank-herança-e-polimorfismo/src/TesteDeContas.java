
public class TesteDeContas {

	public static void main(String[] args) {
		
		ContaCorrente itau = new ContaCorrente(22,222);
		itau.deposita(100);
		
		ContaPoupanca bradesco = new ContaPoupanca(11,111);
		bradesco.deposita(200);
		
		bradesco.transfere(50, itau);
		
		bradesco.saca(95);
		
		System.out.println("Itau: " + itau.getSaldo());
		System.out.println("Bradesco: " + bradesco.getSaldo());

	}

}
