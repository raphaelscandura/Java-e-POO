package br.com.scandura.vetor;

import java.util.Arrays;

public class Vetor {

	private int tamanhoAtual = 0;
	private Aluno[] alunos = new Aluno[100];

	public void garanteEspaco(){
		if(tamanhoAtual == alunos.length){
			Aluno[] novoVetor = new Aluno[alunos.length * 2];
			for(int i = 0; i < alunos.length; i++){
				novoVetor[i] = alunos[i];
			}
			this.alunos = novoVetor;
		}		
	}

	public void add(Aluno aluno) {
		this.garanteEspaco();
		if (!isFull()) {
			this.alunos[tamanhoAtual] = aluno;
			tamanhoAtual++;
		}

	}

	public void addOn(Aluno aluno, int index) {
		this.garanteEspaco();
		if (index <= tamanhoAtual) {
			for (int i = tamanhoAtual; i >= index; i--) {
				alunos[i + 1] = alunos[i];
			}

			alunos[index] = aluno;
			tamanhoAtual++;
		}

	}

	public void remove(int index) {
		if(!isEmpty()) {
			this.alunos[index] = null;
			for(int i = index; i < this.tamanhoAtual; i++) {
				this.alunos[i] = this.alunos[i+1];
			}
		}
	}

	private boolean contains(Aluno aluno) {
		for (int i = 0; i < tamanhoAtual; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
	}

	private Aluno get(int index) {
		if (index <= tamanhoAtual) {
			return this.alunos[index];
		}
		throw new IllegalArgumentException("posicao invalida");
	}

	private int size() {
		return tamanhoAtual;
	}

	private boolean isFull() {
		if (tamanhoAtual == alunos.length) {
			return true;
		}

		return false;
	}

	private boolean isEmpty() {
		if (tamanhoAtual == 0) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}

}
