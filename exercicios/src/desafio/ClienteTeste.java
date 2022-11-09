package desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Gabriel");
		cliente1.adicionarCompra();
		cliente1.compras.get(0).adicionarItem("Caneta", 5, 1);
		cliente1.compras.get(0).adicionarItem("Caderno", 2, 5);
		
		cliente1.adicionarCompra();
		cliente1.compras.get(1).adicionarItem("a", 1, 10);
		cliente1.compras.get(1).adicionarItem("b", 1, 10);
		
		System.out.println(cliente1.compras.get(1).totalCompra());  //20
		System.out.println(cliente1.totalCliente());  //35
	}
}
