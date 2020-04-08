package br.com.mpx.generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		CaixaInt caixaInt = new CaixaInt();

		caixaInt.aguardar(123);

		System.out.println(caixaInt.abrir());
	}

}
