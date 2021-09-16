
public class Condicionais {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 5;
		boolean permissao = true;

		if (idade >= 18 || permissao) {
			System.out.println("Você tem permissão");
		} else {
			System.out.println("Você é menor de idade e não tem permissão");
		}		
	}
}
