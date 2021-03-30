public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.5;
		System.out.println("Cobrado uma taxa de 0,10 no saque de conta poupança");
		return super.saca(valorASacar);
	}

}
