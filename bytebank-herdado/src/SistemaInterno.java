public class SistemaInterno {
	
	private int senha = 5124;
	
	public void autentica(Autenticavel A) {
		boolean autenticou = A.autentica(this.senha);
		if(autenticou) {
			System.out.println("Permiss�o concedida");
		}else {
			System.out.println("Permiss�o negada");
		}
	}

}
