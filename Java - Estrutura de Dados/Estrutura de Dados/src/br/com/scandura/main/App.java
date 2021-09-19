package br.com.scandura.main;

public class App {

	public static void main(String[] args) {
		Vetor teste = new Vetor();
		Aluno a1 = new Aluno("Raphael");
		teste.add(a1);
		Aluno a2 = new Aluno("Lola");
		teste.add(a2);
		
		System.out.println(teste);
		
		teste.remove(0);
		
		System.out.println(teste);
	}

}
