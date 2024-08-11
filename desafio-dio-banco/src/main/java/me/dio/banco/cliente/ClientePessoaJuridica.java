package me.dio.banco.cliente;

public class ClientePessoaJuridica extends Cliente {

	private String cnpj;

	public ClientePessoaJuridica (String cnpj, String nome) {
		this.cnpj = cnpj;
		super.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
