package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InvestidorTests {

	@Test
	void testaInstancia() {

		Investidor i = new Investidor("augusto", "34423312233", "augusto352@gmail.com",(float) 10000);
		
		assertNotNull(i);
	}
	
	@Test
	void testaToString() {
		
		Investidor i = new Investidor("augusto", "34423312233", "augusto352@gmail.com",(float) 10000);
		
		System.out.println(i.toString());
		
		assertTrue("augusto;34423312233;augusto352@gmail.com;10000.0".equals(i.toString()));
	}
}
