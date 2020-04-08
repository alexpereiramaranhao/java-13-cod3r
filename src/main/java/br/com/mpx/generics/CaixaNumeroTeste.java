package br.com.mpx.generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Integer> intCaixa = new CaixaNumero<Integer>();

		System.out.println(intCaixa.aguardar(123).abrir());

		CaixaNumero<Double> doubleCaixa = new CaixaNumero<Double>();

		System.out.println(doubleCaixa.aguardar(123.2).abrir());
	}

}
