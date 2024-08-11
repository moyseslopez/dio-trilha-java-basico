package me.dio.banco.cliente;

public class ClientePessoaFisica extends Cliente {

	private String cpf;

	public ClientePessoaFisica (String cpf, String nome) {
		this.cpf = cpf;
		super.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
