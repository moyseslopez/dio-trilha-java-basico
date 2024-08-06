package me.dio.stream.api;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio_14 {
	public static void main(String[] args) {

		//Desafio 14 - Encontre o maior número primo da lista:
		//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		System.out.println(numeros.stream().filter(n -> BigInteger.valueOf(n).isProbablePrime(100)).sorted(Comparator.reverseOrder()).findFirst());
	}
}
