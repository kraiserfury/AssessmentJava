package br.edu.infnet.appCoCorretora.model.negocio;

import br.edu.infnet.appCoCorretora.model.exception.TaxaAdministracaoException;

public class FundoInvestimento extends Produto {

	private float taxadministracao;
	private boolean taxperformance;
	
	public FundoInvestimento(String descricao, float valor, boolean produtoCorretora) {
		super(descricao, valor, produtoCorretora);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getTaxadministracao());
		sb.append(";");
		sb.append(this.isTaxperformance());
		
		return sb.toString();
	}

	@Override
	public float calcularValorTitulo() {
		
		float valorPerformance = this.getValor() * (this.isTaxperformance() ? 0.02f : 0);				
		float valorAdministracao = this.getValor() * this.getTaxadministracao(); 

		return valorPerformance + valorAdministracao;
	}

	public float getTaxadministracao() {
		return taxadministracao;
	}

	public void setTaxadministracao(float taxadministracao) throws TaxaAdministracaoException {
		
		if(taxadministracao <= 0) {
			
			throw new TaxaAdministracaoException("Taxa Administração Invalida!");
		}

		this.taxadministracao = taxadministracao;
	}

	public boolean isTaxperformance() {
		return taxperformance;
	}

	public void setTaxperformance(boolean taxperformance) {
		this.taxperformance = taxperformance;
	}

}
