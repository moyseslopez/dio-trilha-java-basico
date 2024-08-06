package me.dio.stream.api;

import java.util.Arrays;
import java.util.List;

public class Desafio_04 {
	public static void main(String[] args) {
		
		//Desafio 4 - Remova todos os valores ímpares:
		//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 == 1).toList();
		
		System.out.println(numerosImpares);
	}
}
