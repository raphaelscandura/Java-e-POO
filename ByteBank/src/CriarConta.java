
public class CriarConta {

	public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.deposita(200);
	    System.out.println(primeiraConta.extrato());
	
	    primeiraConta.deposita(100);
	    System.out.println(primeiraConta.extrato());
	    
	    //Testando referências----------------
	
	    Conta segundaConta = primeiraConta;
	    segundaConta.deposita(50);
	
	    System.out.println("primeira conta tem " + primeiraConta.extrato());
	    System.out.println("segunda conta tem " + segundaConta.extrato());
    }
}