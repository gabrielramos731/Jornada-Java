package desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	double total;
	ArrayList<Compra> compras = new ArrayList<>();

	public Cliente(String nome){
		this.nome = nome;
	}
	
	public double valorTotalCliente(){
		for(Compra compra : compras) {
			for(Item item : compra.itens) {
				total += item.produtoUnico.preco * item.produtoUnico.quantidade;
			}
		}
		return total;
	}
}
