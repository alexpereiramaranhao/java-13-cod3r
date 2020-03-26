package br.com.mpx.lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> somaDois = valor -> valor +2;
		UnaryOperator<Integer> multiplicaDois = valor -> valor * 2;
		UnaryOperator<Integer> quadradoDois = valor -> valor * valor;
		
		Integer resultado = somaDois.andThen(multiplicaDois).andThen(quadradoDois).apply(0);
		
		System.out.println(resultado);
	}

}
