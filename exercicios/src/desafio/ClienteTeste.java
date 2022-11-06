package desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Gabriel");
		
		cliente1.compras.add(new Compra());
		cliente1.compras.get(0).itens.add(new Item("Caderno"));
		cliente1.compras.get(0).itens.get(0).produtoUnico.preco = 5.20;
		cliente1.compras.get(0).itens.get(0).produtoUnico.quantidade = 3;
		cliente1.compras.get(0).itens.add(new Item("Escova"));
		cliente1.compras.get(0).itens.get(1).produtoUnico.preco = 10;
		cliente1.compras.get(0).itens.get(1).produtoUnico.quantidade = 2;
		
		cliente1.compras.add(new Compra());
		cliente1.compras.get(1).itens.add(new Item("Caneta"));
		cliente1.compras.get(1).itens.get(0).produtoUnico.preco = 1;
		cliente1.compras.get(1).itens.get(0).produtoUnico.quantidade = 10;
		
		System.out.println(cliente1.compras.get(0).valorCompra());
		System.out.println(cliente1.compras.get(1).valorCompra());
		cliente1.valorTotalCliente();
	}
}
