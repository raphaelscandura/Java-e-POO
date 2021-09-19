package br.com.scandura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.scandura.tdd.modelo.Desempenho;
import br.com.scandura.tdd.modelo.Funcionario;

class ReajusteTest {

	@Test
	void funcionarioRecebeReajusteDe3PorcentoPoisDesempenhoDeixouADesejar() {
		BigDecimal salarioMock = new BigDecimal("1000.00");
		Funcionario mock = new Funcionario("", LocalDate.now(), salarioMock);
		ReajusteService service = new ReajusteService();
		
		service.calcularReajuste(mock, Desempenho.A_DESEJAR);		
		
		assertEquals(new BigDecimal("1030.00"), mock.getSalario());
	}
	
	@Test
	void funcionarioRecebeReajusteDe15PorcentoPoisDesempenhoFoiBom() {
		BigDecimal salarioMock = new BigDecimal("1000.00");
		Funcionario mock = new Funcionario("", LocalDate.now(), salarioMock);
		ReajusteService service = new ReajusteService();
		
		service.calcularReajuste(mock, Desempenho.BOM);		
		
		assertEquals(new BigDecimal("1150.00"), mock.getSalario());
	}
	
	@Test
	void funcionarioRecebeReajusteDe20PorcentoPoisDesempenhoFoiOtimo() {
		BigDecimal salarioMock = new BigDecimal("1000.00");
		Funcionario mock = new Funcionario("", LocalDate.now(), salarioMock);
		ReajusteService service = new ReajusteService();
		
		service.calcularReajuste(mock, Desempenho.OTIMO);		
		
		assertEquals(new BigDecimal("1200.00"), mock.getSalario());
	}

}
