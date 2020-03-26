package br.com.mpx.lambda;

import java.util.function.BinaryOperator;

public class TesteComLambda {

	public static void main(String[] args) {
		Calculo calc = (val1, val2) -> { return val1 + val2; };
		
		System.out.println(calc.executar(2.0, 3.0));

		calc = (val1, val2) -> val1 * val2;
		
		System.out.println(calc.executar(2.0, 3.0));
				
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
		System.out.println("----------- utilizando interfaces funcionais do Java -------------");
		
		BinaryOperator<Double> calculo = (val1, val2) -> {return val1 + val2;};
		
		System.out.println(calculo.apply(2.0, 3.0));

		calculo = (val1, val2) -> {return val1 * val2;};
		
		System.out.println(calculo.apply(2.0, 3.0));
	}

}
