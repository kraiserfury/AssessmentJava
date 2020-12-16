package br.edu.infnet.appCoCorretora.model.negocio;

public class Investidor {

	private String nome;
	private String cpf;
	private String email;
	private Float saldo;
	
	public Investidor(String nome, String cpf, String email, Float saldo) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		sb.append(";");
		sb.append(this.getSaldo());
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}			
	
	public Float getSaldo() {
		return saldo;
	}
	
}
