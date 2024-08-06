package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_11 {
	public static void main(String[] args) {

		//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
		//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer quadradoSoma = numeros.stream().map(n -> n * n).toList().stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(quadradoSoma);
	}
}
