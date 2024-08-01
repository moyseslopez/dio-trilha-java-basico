package me.dio.iphone.funcionalidades;

public class NavegadorInternet {

	public void abreNavegador(String navegador) {
		System.out.println("Abrindo o navegador " + navegador);
	}
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo a URL: " + url);
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina");
	}
	
	public void selecionaAba(String aba) {
		System.out.println("Selecionando a aba: " + aba);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba ao navegador aberto");
	}
}
