package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_05 {
	public static void main(String[] args) {
		
		//Desafio 5 - Calcule a média dos números maiores que 5:
		//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
		Integer media = numerosMaioresQueCinco.stream().mapToInt(Integer::intValue).sum() / numerosMaioresQueCinco.size();
		
		System.out.println(numerosMaioresQueCinco);
		System.out.println(media);
	}
}
