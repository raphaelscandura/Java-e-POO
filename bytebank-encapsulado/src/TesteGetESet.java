public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(123456, 47);

		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());

		Cliente raphael = new Cliente();
		raphael.setNome("Raphael Cunha");

		conta.setTitular(raphael);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
	}
}
