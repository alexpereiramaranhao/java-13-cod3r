package br.com.mpx.util;

import java.util.function.UnaryOperator;

public class Texto {
	private Texto() {}
	
	public static final UnaryOperator<String> upperCase = texto -> texto.toUpperCase();
	
	public static final UnaryOperator<String> lowerCase = texto -> texto.toLowerCase();
	
	public static final String ifen(String texto) {
		return texto+"- ";
	}

}
