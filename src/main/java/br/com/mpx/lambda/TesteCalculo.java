package br.com.mpx.lambda;

public class TesteCalculo {

	public static void main(String[] args) {
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2.0, 3.0));

		calculo = new Multiplicacao();
		System.out.println(calculo.executar(2.0, 3.0));
		

	}

}
