package br.com.scandura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.scandura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcion�rio n�o deveria receber bonus com sal�rio maior do que R$10000");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
