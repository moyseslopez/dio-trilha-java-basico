package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_10 {
	public static void main(String[] args) {

		//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
		//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().filter(n -> n%3==0 || n%5==0).toList().forEach(System.out::println);
	}
}
