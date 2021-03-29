public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.setNumero(047);
		System.out.println(conta.getNumero());

		Cliente raphael = new Cliente();
		raphael.setNome("Raphael Cunha");

		conta.setTitular(raphael);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
	}
}
