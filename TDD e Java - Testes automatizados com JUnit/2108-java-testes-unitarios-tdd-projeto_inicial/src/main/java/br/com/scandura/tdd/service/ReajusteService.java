package br.com.scandura.tdd.service;

import java.math.BigDecimal;

import br.com.scandura.tdd.modelo.Desempenho;
import br.com.scandura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void calcularReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal aumento = funcionario.getSalario().multiply(desempenho.percentualReajuste());
		funcionario.reajustarSalario(aumento);
	}

}
