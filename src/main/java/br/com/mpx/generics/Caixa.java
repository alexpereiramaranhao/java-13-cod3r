package br.com.mpx.generics;

public class Caixa<T> {
	private T coisa;
	
	public Caixa<T> aguardar(T coisa) {
		this.coisa = coisa;
		return this;
	}
	
	public T abrir() {
		return coisa;
	}

}
