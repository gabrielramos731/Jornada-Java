package desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Gabriel");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 5);
		compra1.adicionarItem("Papel", 5, 0.2);
		cliente1.compras.add(compra1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 2, 15);
		cliente1.compras.add(compra2);
		
		System.out.println(compra2.totalCompra()); 
		System.out.printf("Total: R$%.2f\n\n", cliente1.totalCliente());
		
		compra1.mostrarItensCompra();
		
	}
}
