package br.edu.infnet.appCoCorretora.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Compra  {

	private LocalDateTime data;
	private boolean corretagem;
	private Investidor investidor;
	
	public Compra () {
		
		this.data = LocalDateTime.now();
		this.corretagem = Boolean.TRUE;
	}
	
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		return String.format("%s;%s;%s", 
				this.getData().format(formatter),
				this.corretagem,
				this.investidor.toString()
				);
		
		
	}	

	public LocalDateTime getData() {
		return data;
	}

	public boolean isCorretagem() {
		return corretagem;
	}

	public void setCorretagem(boolean corretagem) {
		this.corretagem = corretagem;
	}

	public Investidor getInvestidor() {
		return investidor;
	}

	public void setInvestidor(Investidor investidor) {
		this.investidor = investidor;
	}
	
}
