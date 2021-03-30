public class Gerente extends Funcionario {
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha== senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
}
