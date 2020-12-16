package br.edu.infnet.appCoCorretora.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appCoCorretora.model.exception.LoteInvalidoException;

@SpringBootTest
public class RendaVariavelTests {

	@Test
	 void testaToString() throws LoteInvalidoException {
		RendaVariavel v = new RendaVariavel ("ITSA4", 11, Boolean.FALSE);
		v.setLote(10);
		v.setValorCorretagem(7);
		
		System.out.println(v.toString());
		
		assertTrue("ITSA4;11.0;false;10.0;7.0".equals(v.toString()));
	}
	 
	 @Test	 		
	void testaCalculoValorCorretagemTitulo() throws LoteInvalidoException {
	   RendaVariavel v = new RendaVariavel ("ITSA4", 11, Boolean.FALSE);
	   v.setLote(10);
	   v.setValorCorretagem(7);
				
	System.out.println("#");
	System.out.println("v.Lote(): " + v.getLote());
	System.out.println("v.getvalorCorretagem(): " +   v.getValorCorretagem());
	System.out.println("#");
	System.out.println(v.getValor() * (v.getLote() * 100));
	System.out.println(v.getLote() * (v.getValorCorretagem()));	
	System.out.println(v.getValor() * (v.getLote() * 100) + v.getLote() * (v.getValorCorretagem()));
	
	assertEquals(v.calcularValorTitulo(), 11070.0);		
		}
	
	 @Test
		void testaLoteInvalideException() {
			try {
				RendaVariavel v = new RendaVariavel ("ITSA4", 11, Boolean.FALSE);
				v.setLote(0);
			} catch (LoteInvalidoException e) {
				assertEquals("Quantidade do Lote Invalido!", e.getMessage());
			}
 }
}