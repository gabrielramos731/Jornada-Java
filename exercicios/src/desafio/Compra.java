package desafio;

import java.util.ArrayList;

public class Compra {
	
	double total;
	ArrayList<Item> itens = new ArrayList<>();
	
	public double valorCompra() {
		for(Item item : itens) {
			total += item.produtoUnico.quantidade * item.produtoUnico.preco;
		}
		return total;
	}
}
