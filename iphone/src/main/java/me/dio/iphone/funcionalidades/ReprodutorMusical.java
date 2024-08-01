package me.dio.iphone.funcionalidades;

import java.util.List;

import me.dio.iphone.funcionalidades.data.Musica;

public class ReprodutorMusical {

	public void selecionarMusica(String musicaSelecionada, List<Musica> musicas) {
		
		boolean musicaEncontrada = false;
		
		for (Musica musica : musicas) {
			if(musica.getNome().equals(musicaSelecionada)) {
				musicaEncontrada = true;
				break;
			}
		}
		
		if(musicaEncontrada == false) {
			System.out.println(musicaSelecionada + " nao foi encontrada na lista de musicas");
		} else {
			System.out.println("Musica " + musicaSelecionada + " selecionada");
		}
	}
	
	public void carregaMusicasElegiveis(List<Musica> musicas) {
		musicas.add(new Musica("SONG 1"));
		musicas.add(new Musica("SONG 2"));
		musicas.add(new Musica("SONG 3"));
	}
	
	public void tocar() {
		System.out.println("Toca a musica selecionada");
	}
	
	public void pausar() {
		System.out.println("Pausa a musica atualmente em reproducao");
	}
	
	public void avancar() {
		System.out.println("Avanca para a proxima musica");
	}
	
	public void retroceder() {
		System.out.println("Retrocede para a música anterior");
	}
}
