package me.dio.banco.conta;

public interface ContaInterface {

	public void sacar(double valor);
	public void depositar(double valor);
	public void transferir(double valor, Conta contaDestino);
	public void imprimirExtrato();

}
