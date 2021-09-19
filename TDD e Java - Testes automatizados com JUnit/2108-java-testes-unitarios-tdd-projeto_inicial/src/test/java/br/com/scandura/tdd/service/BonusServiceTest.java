package br.com.scandura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.scandura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("", LocalDate.now(), new BigDecimal("20000"))));		
	}
	
	@Test
	void funcionarioGanhaPoucoDeveriaReceberBonusDe10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
		
	}
	
	@Test
	void funcionarioGanhaExatamente10000DeveriaReceberBonusDe10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
		
	}

}
