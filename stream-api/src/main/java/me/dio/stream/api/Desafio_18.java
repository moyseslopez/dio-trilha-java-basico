package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_18 {
	public static void main(String[] args) {

		//Desafio 18 - Verifique se todos os números da lista são iguais:
		//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(numeros.stream().allMatch(numeros.get(0)::equals));
	}
}
