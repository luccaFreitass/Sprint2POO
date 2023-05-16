package br.com.fiap.model;

public class Endereco {
	
	private String pais;
	private String cidade;
	private String estado;
	private String bairro;
	
	
	
	
	public Endereco() {
		
	}


	public Endereco(String pais, String cidade, String estado, String bairro) {
		this.pais = pais;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	

}
