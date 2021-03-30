public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Diretor");
		return super.getBonificacao() + super.getSalario();
	}

}
