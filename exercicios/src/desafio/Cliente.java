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
//			total += compra.valorCompra();
			System.out.println(compra.valorCompra());
		}
		return total;
	}
	
}
