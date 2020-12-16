package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {

	@Test
	void testRendaFixa () {
		RendaFixa f = new RendaFixa("CDB", 10000, Boolean.FALSE);
		
		assertNotNull(f);
	}
	
	@Test
	void testRendaVariavel () {
		RendaVariavel v = new RendaVariavel("FundoImobiliario", 20000, Boolean.TRUE);
		
		assertNotNull(v);
	}
	
	@Test
	void testFundoInvestimento () {
		FundoInvestimento i = new FundoInvestimento("FundoMultimercado", 10000, Boolean.TRUE);
		
		assertNotNull(i);
	}
}
