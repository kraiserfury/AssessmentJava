package br.edu.infnet.appCoCorretora.model.negocio;

public abstract class Produto {
	
	private String descricao;
	private float valor;
	private boolean produtoCorretora;
	
	public Produto(String descricao, float valor, boolean produtoCorretora) {
		
		this.descricao = descricao;
		this.valor = valor;
		this.produtoCorretora = produtoCorretora;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProdutoCorretora());
		
		return sb.toString();
	}
	
	public abstract float calcularValorTitulo();

	public String getDescricao() {
		return descricao;
	}

	public float getValor() {
		return valor;
	}

	public boolean isProdutoCorretora() {
		return produtoCorretora;
	}
	
}
