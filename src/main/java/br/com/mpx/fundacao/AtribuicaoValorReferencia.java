package br.com.mpx.fundacao;

public class AtribuicaoValorReferencia {
	public static void main(String[] args) {
		//Tipos primitivos, sempre atribuição por valor
		
		int a = 2;
		int b = a;
		
		a++;
		b--;
		
		System.out.println(a + " - " + b);
		
		//Objetos sempre atribuição por referência 
		
		Pessoa p1 = new Pessoa("Alex", "alex@alex.com");
		Pessoa p2 = p1;
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());	
		
		alterarObj(p2);
		
		System.out.println(p2);
		System.out.println(p1);
		
		alterarPrimitivo(a);
		
		System.out.println(a);
		
		
		
	}
	
	private static void alterarObj(Pessoa p3) {
		p3.setNome("Alessandra");
	}
	
	private static void alterarPrimitivo(int c) {
		c++;
	}

}
