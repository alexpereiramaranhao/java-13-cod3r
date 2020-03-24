package br.com.mpx.composicao;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
	private String nome;	
	private List<Compra> compras;
	
	public Double calcularValorCompra() {
		Double total = 0.0;
		
		for (Compra compra : compras) {
			Double valorProduto = 0.0;
			for (Item item : compra.getItens()) {
				valorProduto += item.getProduto().getPreço();
			}			
			total += valorProduto;
		}
		
		return total;
	}

}
