package br.com.mpx.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumulador, valor)  -> acumulador + valor;
		
		Integer total1 = numeros.stream()
				.reduce(soma)
				.get();
		
		System.out.println(total1);
		
		//parallel pode trazer efeitos colaterais, ele passa o valor inicial (100) para cada elemento
		Integer total2 = numeros.parallelStream()
				.reduce(100, soma);
		
		System.out.println(total2);
		
		numeros.stream()
				.reduce(soma)
				.ifPresent(System.out::println);
	}

}
