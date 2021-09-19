package br.com.scandura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.scandura.tdd.modelo.Desempenho;
import br.com.scandura.tdd.modelo.Funcionario;

class ReajusteTest {
	
	public BigDecimal salario;
	public Funcionario funcionario;
	public ReajusteService service;
	
	@BeforeEach
	public void inicializar() {
		this.salario = new BigDecimal("1000.00");
		this.funcionario = new Funcionario("", LocalDate.now(), this.salario);
		this.service = new ReajusteService();
	}

	@Test
	void funcionarioRecebeReajusteDe3PorcentoPoisDesempenhoDeixouADesejar() {		
		service.calcularReajuste(funcionario, Desempenho.A_DESEJAR);		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	void funcionarioRecebeReajusteDe15PorcentoPoisDesempenhoFoiBom() {
		service.calcularReajuste(funcionario, Desempenho.BOM);		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	void funcionarioRecebeReajusteDe20PorcentoPoisDesempenhoFoiOtimo() {
		service.calcularReajuste(funcionario, Desempenho.OTIMO);		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
