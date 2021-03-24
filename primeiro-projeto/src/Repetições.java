
public class Repetições {
	public static void main(String[] args) {
		int contador = 0, total = 0, totalSoma = 0;

		while (contador <= 10) {
			total += contador;
			contador++;
		}

		System.out.println("print com while " + total);

		for (int i = 0; i <= 10; i++) {
			totalSoma += i;
			i++;
		}

		System.out.println("print com for " + totalSoma);

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int i = 0; i <= 10; i++) {
				System.out.print(multiplicador * i);
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
