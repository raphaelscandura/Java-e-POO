
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario raphael = new Funcionario("Raphael Cunha", "222.222.222-22", 1500);
		
		System.out.println(raphael.getNome());
		System.out.println(raphael.getCpf());
		System.out.println(raphael.getSalario());
		
		Gerente marcela = new Gerente("Marcela Souls", "111.111.111-11", 5000);
		
		System.out.println(marcela.getNome());
		System.out.println(marcela.getCpf());
		System.out.println(marcela.getSalario());
		
		marcela.setSenha(1337);
		boolean senhaAutenticada = marcela.autentica(1337);
		
		System.out.println(senhaAutenticada);
		
		System.out.println(marcela.getBonificacao());

	}

}
