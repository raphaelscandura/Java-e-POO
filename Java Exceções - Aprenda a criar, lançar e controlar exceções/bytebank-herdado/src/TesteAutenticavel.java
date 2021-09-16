
public class TesteAutenticavel {

	public static void main(String[] args) {


		Autenticavel referencia = new Cliente();		
		referencia.setSenha(5124);
		boolean autenticou = referencia.autentica(5124);		
		System.out.println(autenticou);
		
		Diretor bob = new Diretor("Bob Ross", "111.111.111-11", 655);
		bob.setSenha(6666);
		boolean autenticou2 = bob.autentica(6666);
		System.out.println(autenticou2);
		
		Autenticavel programador = new Desenvolvedor("Raphael Scandura", "222.222.222-22", 1624);
		programador.setSenha(9719);
		boolean autenticou3 = programador.autentica(1997);
		System.out.println(autenticou3);

	}

}
