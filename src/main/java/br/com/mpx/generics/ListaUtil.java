package br.com.mpx.generics;

import java.util.List;

public class ListaUtil {
	public static <T> T pegarUltimo(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

}
