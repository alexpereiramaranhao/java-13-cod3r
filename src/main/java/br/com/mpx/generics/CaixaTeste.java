package br.com.mpx.generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> stringCaixa = new Caixa<String>();

		stringCaixa.aguardar("Segredo");

		Caixa<Double> doubleCaixa = new Caixa<Double>();

		doubleCaixa.aguardar(3.2);

		System.out.println(doubleCaixa.abrir());

	}

}
