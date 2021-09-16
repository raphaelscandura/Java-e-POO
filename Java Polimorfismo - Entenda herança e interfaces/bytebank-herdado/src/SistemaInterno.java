public class SistemaInterno {
	
	private int senha = 5124;
	
	public void autentica(Autenticavel A) {
		boolean autenticou = A.autentica(this.senha);
		if(autenticou) {
			System.out.println("Permissão concedida");
		}else {
			System.out.println("Permissão negada");
		}
	}

}
