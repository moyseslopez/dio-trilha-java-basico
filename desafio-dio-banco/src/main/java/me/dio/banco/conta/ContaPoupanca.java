package me.dio.banco.conta;

import me.dio.banco.cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		super.imprimirInfosComuns(super.cliente);
	}
}
