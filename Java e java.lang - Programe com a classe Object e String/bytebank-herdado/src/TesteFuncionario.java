
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente raphael = new Gerente("Raphael Cunha", "222.222.222-22", 1500);
		
		System.out.println(raphael.getNome());
		System.out.println(raphael.getCpf());
		System.out.println(raphael.getSalario());
		System.out.println("Bonificaçaõ do Raphael: " + raphael.getBonificacao());
		
		Gerente marcela = new Gerente("Marcela Souls", "111.111.111-11", 5000);
		
		System.out.println(marcela.getNome());
		System.out.println(marcela.getCpf());
		System.out.println(marcela.getSalario());
				
		System.out.println("Bonificação da Marcela: " + marcela.getBonificacao());
		
		Diretor julia = new Diretor("Julia Teve", "333.333.333-33",7500);
		
		System.out.println("Bonificação da Julia: " + julia.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(julia);
		controle.registra(marcela);
		controle.registra(raphael);
		
		System.out.println(controle.getSoma());
		
		Desenvolvedor julie = new Desenvolvedor("Julie Strator", "444.444.444-44", 6000);
		julie.setSenha(5124);
		
		SistemaInterno SI = new SistemaInterno();
		SI.autentica(julie);
	}

}
