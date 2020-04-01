package br.com.mpx.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numeros.stream()
			.filter(numero -> numero % 2 == 0)
			.forEach(System.out::println);
	}
}
