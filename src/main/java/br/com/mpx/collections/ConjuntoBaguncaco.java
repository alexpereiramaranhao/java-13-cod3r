package br.com.mpx.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncaco {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {


		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add("Teste");
		conjunto.add(true);
		conjunto.add(1);
		
		System.out.println(conjunto);
		
		conjunto.remove("Teste");
		
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		nums.addAll(conjunto);
		
		System.out.println(nums);
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		

	}

}
