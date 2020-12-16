package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCoCorretora.model.exception.TaxaAdministracaoException;

@SpringBootTest
public class FundoInvestimentoTests {

	 @Test
	 void testaToString() throws TaxaAdministracaoException {
		FundoInvestimento i = new FundoInvestimento("Multimercado", 10000, Boolean.FALSE);
		i.setTaxadministracao(0.08f);
		i.setTaxperformance(Boolean.TRUE);
		
		System.out.println(i.toString());
		
		assertTrue("Multimercado;10000.0;false;0.08;true".equals(i.toString()));
	}
	 
	 @Test	 		
	void testaCalculoValorTaxaTitulo() throws TaxaAdministracaoException {
	   FundoInvestimento i = new FundoInvestimento("Multimercado", 10000, Boolean.FALSE);
	   i.setTaxadministracao(0.08f);
	   i.setTaxperformance(Boolean.TRUE);
				
	System.out.println("#");
	System.out.println("i.getTaxadministracao(): " + i.getTaxadministracao());
	System.out.println("i.getTaxperformance(): " +   i.isTaxperformance());
	System.out.println("#");
	System.out.println(i.getValor() * (i.getTaxadministracao()));
	System.out.println(i.getValor() * (i.isTaxperformance() ? 0.02f : 0));	
	System.out.println(i.getTaxadministracao() * i.getValor() + i.getValor() * (i.isTaxperformance() ? 0.02f : 0));
	assertEquals(i.calcularValorTitulo(), 1000.0);		
		}
	 
	 @Test
	 void testaTaxaAdministracaoInvalida()  {
			FundoInvestimento i = new FundoInvestimento("Multimercado", 10000, Boolean.FALSE);
			try {
				i.setTaxadministracao(-0.08f);
			} catch (TaxaAdministracaoException e) {
				assertEquals("Taxa Administração Invalida!", e.getMessage());
			}			
}
	 
}