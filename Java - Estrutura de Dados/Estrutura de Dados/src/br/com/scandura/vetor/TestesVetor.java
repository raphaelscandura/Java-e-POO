package br.com.scandura.vetor;

public class TestesVetor {

	public static void main(String[] args) {
		Vetor teste = new Vetor();
		Aluno a1 = new Aluno("Raphael");
		teste.add(a1);
		Aluno a2 = new Aluno("Lola");
		teste.add(a2);
		
		System.out.println(teste);
		
		teste.remove(0);
		
		System.out.println(teste);

		for(int i = 0; i < 250; i++){
			Aluno x = new Aluno("Kanye");
			teste.add(x);
		}

		System.out.println(teste);
	}

}
