package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCoCorretora.model.exception.PeriodoNegativoException;

@SpringBootTest
public class RendaFixaTests {
	
	 @Test
	 void testaToString() throws PeriodoNegativoException {
		RendaFixa f = new RendaFixa("CDB", 10000, Boolean.FALSE);
		f.setPeriodo(0.18f);
		f.setRentabilidade(0.20f);
		
		System.out.println(f.toString());
		
		assertTrue("CDB;10000.0;false;0.18;0.2".equals(f.toString()));
	}
	 
	 @Test	 		
	void testaCalculoValorTitulo() throws PeriodoNegativoException {
	   RendaFixa f = new RendaFixa("CDB", 10000, Boolean.FALSE);
	   f.setRentabilidade(200);
	   f.setPeriodo(100);
				
	System.out.println("#");
	System.out.println("f.getPeriodo(): " + f.getPeriodo());
	System.out.println("f.getRentabilidade(): " + f.getRentabilidade());
	System.out.println("#");
	System.out.println("this.getValor() * (this.getPeriodo() * 0.18f) + (this.getRentabilidade() * 0.20f)");
	System.out.println("#");
	System.out.println("f.getValor(): " + f.getValor());
	System.out.println("f.getPeriodo() * 0.18f: " + f.getPeriodo() * 0.18f);
	System.out.println("f.getRentabilidade() * 0.20f: " + f.getRentabilidade() * 0.20f);
	System.out.println("#");
	System.out.println("f.calcularValorTitulo():" + f.calcularValorTitulo());
	System.out.println("#");
				
	assertEquals(f.calcularValorTitulo(), 180040.0);		
	}
	 
	 @Test
		void testaPeriodoInvalido() {
			try {
				RendaFixa f = new RendaFixa("CDB", 10000, Boolean.FALSE);
				f.setPeriodo(-0.18f);
				f.setRentabilidade(0.20f);
			} catch (PeriodoNegativoException e) {
				assertEquals("Periodo Invalido!", e.getMessage());
			}
    }
}
