
public class EstruturaDeDados {

	public static void main(String[] args) {


		int[] idades = new int[3];
		
		for(int i = 0; i < 3; i++) {
			idades[i] += i;
			System.out.println(idades[i]);
		}
		
		System.out.println("Tamanho do array: " + idades.length);
		
	}

}
