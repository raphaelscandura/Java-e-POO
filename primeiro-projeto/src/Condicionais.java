
public class Condicionais {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 5;
		boolean permissao = true;

		if (idade >= 18 || permissao) {
			System.out.println("Voc� tem permiss�o");
		} else {
			System.out.println("Voc� � menor de idade e n�o tem permiss�o");
		}		
	}
}
