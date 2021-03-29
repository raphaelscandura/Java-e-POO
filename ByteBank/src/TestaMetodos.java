
public class TestaMetodos {

	public static void main(String[] args) {
	    Conta primeiraConta = new Conta();
	    primeiraConta.deposita(200);
	    
	    System.out.println("O saldo da primeira conta é " + primeiraConta.extrato());
	    
	    Conta segundaConta = new Conta();
	    segundaConta.deposita(500);
	    
	    System.out.println("O saldo da segunda conta é " + segundaConta.extrato());
	    
	    primeiraConta.deposita(500);
	    System.out.println("O novo valor da primeira conta é " + primeiraConta.extrato());
	    
	    segundaConta.saca(200);
	    System.out.println("O novo valor da segunda conta é " + segundaConta.extrato());
	    
	    if(primeiraConta.transfere(700, segundaConta)) {
	    	System.out.println("Transferência realizada com sucesso");
	    }else {
	    	System.out.println("Erro na transferência");
	    }
	    
	    System.out.println("O novo valor da primeira conta é " + primeiraConta.extrato());
	    System.out.println("O novo valor da segunda conta é " + segundaConta.extrato());

	}

}
