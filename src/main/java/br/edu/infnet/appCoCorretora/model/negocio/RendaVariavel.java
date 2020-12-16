package br.edu.infnet.appCoCorretora.model.negocio;

import br.edu.infnet.appCoCorretora.model.exception.LoteInvalidoException;

public class RendaVariavel extends Produto {

	private float lote;
	private float valorCorretagem;
	
	public RendaVariavel(String descricao, float valor, boolean produtoCorretora) {
		super(descricao, valor, produtoCorretora);
	}
		
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append(super.toString());
			sb.append(";");
			sb.append(this.getLote());
			sb.append(";");
			sb.append(this.getValorCorretagem());
			
			return sb.toString();
		}

	@Override
	public float calcularValorTitulo() {
		
		float valorLote = ((this.getValor() * this.getLote()) * 100);
		float valorLoteCorretagem = (this.getLote() * this.getValorCorretagem());
		
		return valorLote + valorLoteCorretagem;
	}

	public float getLote() {
		return lote;
	}

	public void setLote(float lote) throws LoteInvalidoException {
		
		if(lote < 1 || lote > 100) {
			
			throw new LoteInvalidoException("Quantidade do Lote Invalido!");
		}
		
		this.lote = lote;
	}

	public float getValorCorretagem() {
		return valorCorretagem;
	}

	public void setValorCorretagem(float taxaCorretagem) {
		this.valorCorretagem = taxaCorretagem;
	}

}
