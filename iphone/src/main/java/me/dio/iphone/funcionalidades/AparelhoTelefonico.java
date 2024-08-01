package me.dio.iphone.funcionalidades;

import java.util.List;

import me.dio.iphone.funcionalidades.data.Contato;

public class AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}
	
	public void atender() {
		System.out.println("Atende a solicitacao de chamada");
	}
	
	public void desligar() {
		System.out.println("Desliga a chamada em andamento");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Inicia Correio de Voz");
	}
	
	public void pesquisaLigaContato(String nomeContato, List<Contato> contatos) {
		
		boolean contatoEncontrado = false;
		
		for (Contato contato : contatos) {
			if(contato.getNome().equals(nomeContato)) {
				contatoEncontrado = true;
				break;
			}
		}
		
		if(contatoEncontrado == false) {
			System.out.println(nomeContato + " nao foi encontrada na lista de contatos");
		} else {
			System.out.println("Ligando para " + nomeContato + "...");
		}
	}
}
