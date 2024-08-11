package me.dio.banco.conta;

import me.dio.banco.cliente.Cliente;
import me.dio.banco.cliente.ClientePessoaFisica;
import me.dio.banco.cliente.ClientePessoaJuridica;

public abstract class Conta implements ContaInterface {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.0d;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirInfosComuns(Cliente cliente) {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		
		if(this.cliente instanceof ClientePessoaJuridica) {
			System.out.println(String.format("CNPJ: %s", ((ClientePessoaJuridica)this.cliente).getCnpj()));
		} else if(this.cliente instanceof ClientePessoaFisica){
			System.out.println(String.format("CPF: %s", ((ClientePessoaFisica)this.cliente).getCpf()));
		}
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
