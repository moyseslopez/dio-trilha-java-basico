package me.dio.stream.api;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Desafio_17 {
	public static void main(String[] args) {

		//Desafio 17 - Filtrar os números primos da lista:
		//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().filter(n -> BigInteger.valueOf(n).isProbablePrime(100)).toList().forEach(System.out::println);
	}
}
