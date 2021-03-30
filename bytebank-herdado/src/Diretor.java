public class Diretor extends Funcionario implements Autenticavel{

	private int senha;
	
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha= senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Diretor");
		return super.getSalario();
	}

}
