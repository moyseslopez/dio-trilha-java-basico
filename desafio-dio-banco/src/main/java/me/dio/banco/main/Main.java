package me.dio.banco.main;

import me.dio.banco.cliente.Cliente;
import me.dio.banco.cliente.ClientePessoaFisica;
import me.dio.banco.cliente.ClientePessoaJuridica;
import me.dio.banco.conta.Conta;
import me.dio.banco.conta.ContaCorrente;
import me.dio.banco.conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente clientePJ = new ClientePessoaJuridica("11.222.333/0001-04", "Empresa Moyses S.A");
		Cliente clientePF = new ClientePessoaFisica("111.222.333-44", "Moyses Henrique Lovato Lopez Caroca");
		
		Conta contaCorrente = new ContaCorrente(clientePJ);
		Conta contaPoupanca = new ContaPoupanca(clientePF);
		
		contaCorrente.depositar(100d);
		contaCorrente.transferir(100d, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}
}
