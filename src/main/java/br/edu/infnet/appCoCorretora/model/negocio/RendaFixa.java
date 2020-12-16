package br.edu.infnet.appCoCorretora.model.negocio;

import br.edu.infnet.appCoCorretora.model.exception.PeriodoNegativoException;

public class RendaFixa extends Produto {
	
	private float periodo;
	private float rentabilidade;

	public RendaFixa(String descricao, float valor, boolean produtoCorretora) {
		super(descricao, valor, produtoCorretora);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getPeriodo());
		sb.append(";");
		sb.append(this.getRentabilidade());
		
		return sb.toString();
	}

	@Override
	public float calcularValorTitulo() {
		
		return this.getValor() * (this.getPeriodo() * 0.18f) + (this.getRentabilidade() * 0.20f);
	}

	public float getPeriodo() {
		return periodo;
	}

	public void setPeriodo(float periodo) throws PeriodoNegativoException {
		
		if(periodo <= 0) {
			throw new PeriodoNegativoException("Periodo Invalido!");
		}
		
		this.periodo = periodo;
	}

	public float getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(float rentabilidade) {
		this.rentabilidade = rentabilidade;
	}

}
