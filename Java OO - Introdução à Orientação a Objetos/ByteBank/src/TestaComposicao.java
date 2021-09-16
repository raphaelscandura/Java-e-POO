
public class TestaComposicao {
	public static void main(String[] args) {
		Cliente raphael = new Cliente();
		raphael.nome = "Raphael Cunha";
		raphael.cpf = "222.222.222-22";
		raphael.profissao = "Estudante";
		
		Conta contaDoRaphael = new Conta();
		contaDoRaphael.deposita(1560);
		contaDoRaphael.titular = raphael;
		
		//Testando saídas
		
		System.out.println(contaDoRaphael.titular.nome);
		System.out.println(contaDoRaphael.titular.cpf);
		System.out.println(contaDoRaphael.titular.profissao);
		
		//testando referências
		
		System.out.println(raphael);
		System.out.println(contaDoRaphael.titular);
		
		Conta contaDaJulia = new Conta();
		contaDaJulia.titular = new Cliente();
		contaDaJulia.titular.nome = "Julia Teve";
		System.out.println(contaDaJulia.titular.nome);
	}
}
