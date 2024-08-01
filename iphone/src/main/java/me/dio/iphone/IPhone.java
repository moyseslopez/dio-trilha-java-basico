package me.dio.iphone;

import java.util.ArrayList;
import java.util.List;

import me.dio.iphone.funcionalidades.AparelhoTelefonico;
import me.dio.iphone.funcionalidades.NavegadorInternet;
import me.dio.iphone.funcionalidades.ReprodutorMusical;
import me.dio.iphone.funcionalidades.data.Contato;
import me.dio.iphone.funcionalidades.data.Musica;

public class IPhone {

	public static void main(String[] args) {
	
		String funcionalidade = "AparelhoTelefonico";
		
		if(funcionalidade.equals("ReprodutorMusical")) {
			
			String musicaSelecionada = "SONG 1";
			List<Musica> musicas = new ArrayList<Musica>();
			ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
			
			reprodutorMusical.carregaMusicasElegiveis(musicas);
			reprodutorMusical.selecionarMusica(musicaSelecionada, musicas);
			reprodutorMusical.tocar();
			reprodutorMusical.avancar();
			reprodutorMusical.retroceder();
			reprodutorMusical.pausar();
			
		} else if(funcionalidade.equals("AparelhoTelefonico")) {
			
			AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
			List<Contato> contatos = new ArrayList<Contato>();
			
			contatos.add(new Contato("Pessoa 1", "11912345678"));
			contatos.add(new Contato("Pessoa 2", "11912345677"));
			contatos.add(new Contato("Pessoa 3", "11912345676"));
			
			aparelhoTelefonico.pesquisaLigaContato("Pessoa 4", contatos);
			aparelhoTelefonico.ligar("11912345678");
			aparelhoTelefonico.atender();
			aparelhoTelefonico.desligar();
			aparelhoTelefonico.iniciarCorreioVoz();
			
		} else if(funcionalidade.equals("NavegadorInternet")) {
			
			NavegadorInternet navegadorInternet = new NavegadorInternet();
			
			navegadorInternet.abreNavegador("Google Chrome");
			navegadorInternet.exibirPagina("https://web.dio.me/home");
			navegadorInternet.atualizarPagina();
			navegadorInternet.selecionaAba("aba 1");
			navegadorInternet.adicionarNovaAba();
			
		} 
	}
}
