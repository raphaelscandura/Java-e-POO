public class Diretor extends Funcionario implements Autenticavel{

	private Autenticador auth;	
	
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.auth = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.auth.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Diretor");
		return super.getSalario();
	}

}
