package br.com.mpx.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = 
				(nota1, nota2) -> (nota1 + nota2)/2;
		
		System.out.println(media.apply(9.5, 4.75));
		
		BiFunction<Double, Double, String> resultado = 
				(nota1, nota2) -> ((nota1 + nota2) / 2) > 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(4.6, 9.75));
		
		
		Function<Double, String> conceito = 
				mediaFinal -> mediaFinal > 7.0 ? "Aprovado" : "Reprovado"; 
		
		System.out.println(media.andThen(conceito).apply(4.75, 9.5));		

	}

}
