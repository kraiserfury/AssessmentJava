package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompraTests {

	@Test
	void testaAssociacao() {
		Investidor i = new Investidor("augusto", "34423312233", "augusto352@gmail.com",18732221.00f);		
		
		Compra c = new Compra();
		c.setInvestidor(i);
		
		System.out.println("Compra: " + c);

		assertTrue(i.equals(c.getInvestidor()));
	}
	
	@Test
	void testaCorretagemTrue() {
		Compra c = new Compra();
		
		assertTrue(c.isCorretagem());
	}
	
	@Test
	void testaCorretagemFalse() {
		Compra c = new Compra();
		c.setCorretagem(Boolean.FALSE);
		
		assertFalse(c.isCorretagem());
	}
	
	
}
