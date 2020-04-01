package br.com.mpx.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.joda.time.DateTime;

public class DesafioFilter {

	/*
	 * Obter todos os clientes maires de 18 anos que tem interesse
	 * no carro da marca Peugeot
	 */
	public static void main(String[] args) {
		Carro car1 = new Carro("Peugeot", "307", 23.500);
		Carro car2 = new Carro("Volkswagen", "UP! TSI", 43.500);
		Carro car3 = new Carro("Volkswagen", "Virtus TSI", 73.500);
		Carro car4 = new Carro("Fiat", "Argo 1.3", 44.000);
		Carro car5 = new Carro("Peugeot", "2008", 63.990);
		
		List<Carro> carrosCli1 = Arrays.asList(car1, car2);	
		Cliente cli1 = new Cliente("Alex Pereira Maranhão", DateTime.parse("1988-04-26"), carrosCli1);
		
		List<Carro> carrosCli2 = Arrays.asList(car3, car5);	
		Cliente cli2 = new Cliente("Alessandra Ferreira", DateTime.parse("1990-07-15"), carrosCli2);

		List<Carro> carrosCli3 = Arrays.asList(car1);	
		Cliente cli3 = new Cliente("Henrique", DateTime.parse("2017-03-20"), carrosCli3);
		
		List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3);
		
		Predicate<Cliente> gostaDePeugeot = cliente -> {
			
			for (Carro carro : cliente.getInteresses()) {
				return carro.getMarca().equalsIgnoreCase("Peugeot");
			}
			
			return false;
		};
		
		clientes.stream()
			.filter(cliente -> isMaiorIdate(cliente.getDataNascimento()))
			.filter(gostaDePeugeot)
			.map(cliente -> cliente.getNome())			
			.forEach(System.out::println);;
		
		
	}
	private static boolean isMaiorIdate(DateTime dataNascimento) {
		int idade = DateTime.now().getYear() - dataNascimento.getYear();
		
		return idade >= 18 ? true : false;		
	}
}
