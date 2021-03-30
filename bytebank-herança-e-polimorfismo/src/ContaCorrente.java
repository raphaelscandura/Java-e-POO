public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Dep�sito n�o realizado: O valor deve ser maior que 0");
			return;
		}
		this.saldo += valor;
	}
}
