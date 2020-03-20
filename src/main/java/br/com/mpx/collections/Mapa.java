package br.com.mpx.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "Alex");
		mapa.put(1, "Alex Pereira Maranhão");
		mapa.put(3, "Henrque");
		mapa.put(2, "Alessandra");
			
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.entrySet());
		
		System.out.println(mapa.containsKey(1));
		System.out.println(mapa.containsValue("Alex"));
		
		for (Integer chave : mapa.keySet()) {
			System.out.println(chave);
		}
		
		for (String nome : mapa.values()) {
			System.out.println(nome);
		}
		
		for (Entry<Integer, String> nome : mapa.entrySet()) {
			System.out.println(nome.getKey() + "=" + nome.getValue());
		}
	}

}
