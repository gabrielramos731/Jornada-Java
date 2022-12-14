package desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	public void adicionarItem(String nome, int quantidade, double preco) {
		itens.add(new Item(nome, new Produto(quantidade, preco)));
	}
	
	public double totalCompra() {
		double total = 0;
		for(Item item : itens) 
			total += item.produtoUnico.preco * item.produtoUnico.quantidade;
		return total;
	}
	
	public void mostrarItensCompra() {
		for(Item item : itens) {
			System.out.printf("%s: %d * %.2f\n", item.nome, item.produtoUnico.quantidade, item.produtoUnico.preco);
		}
	}
}
