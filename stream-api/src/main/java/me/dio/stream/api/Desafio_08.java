package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_08 {
	public static void main(String[] args) {
		
		//Desafio 8 - Somar os dígitos de todos os números da lista:
		//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.toString().chars().map(Character::getNumericValue).filter(n -> n >= 0).forEach(System.out::println);
		
		Integer somaDigitos = numeros.toString().chars().map(Character::getNumericValue).filter(n -> n >= 0).sum();
		
		System.out.println(somaDigitos);
	}
}
