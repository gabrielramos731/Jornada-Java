package desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCompra() {
		compras.add(new Compra());
	}
	
	public double totalCliente() {
		double total = 0;
		for(Compra compra : compras) {
			total += compra.totalCompra();
//			System.out.println("2: "+total);
		}
	return total;
	}
}
