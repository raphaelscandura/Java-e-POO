public class Gerente extends Funcionario {
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		return super.getSalario();
	}
	
}
