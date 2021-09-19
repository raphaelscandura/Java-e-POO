package br.com.scandura.tdd.service;

import java.math.BigDecimal;

import br.com.scandura.tdd.modelo.Desempenho;
import br.com.scandura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void calcularReajuste(Funcionario funcionario, Desempenho desempenho) {
		if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(aumento);
		}else if(desempenho == Desempenho.BOM) {
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			funcionario.reajustarSalario(aumento);
		}else if(desempenho == Desempenho.OTIMO) {
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.20"));
			funcionario.reajustarSalario(aumento);
		}
	}

}
