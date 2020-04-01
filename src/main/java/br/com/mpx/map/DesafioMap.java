package br.com.mpx.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	/*
	 * 1 - transformar os números da lista para binários (string);
	 * 2 - inverter as
	 * strings de binário;
	 * 3 - converter a string para inteiro novamente
	 */
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		UnaryOperator<String> revertString = numero -> new StringBuilder(numero).reverse().toString();
		Function<String, Integer> toInteger = numero -> Integer.parseInt(numero, 2);

		numeros.stream()
			.map(Integer::toBinaryString)
			.map(revertString)
			.map(toInteger)
			.forEach(System.out::println);
	}
}
