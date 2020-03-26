package br.com.mpx.lambda;

public class Multiplicacao implements Calculo{

	@Override
	public double executar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}
}
