package elevador;

public class ElevadorTeste {
	public static void main(String[] args) {
		
		Elevador e1 = new Elevador(10, 14);
		
		System.out.println(e1.quantAtual);
		e1.entra(8);
		System.out.println(e1.quantAtual);
		e1.sai(3);
		System.out.println(e1.quantAtual);
	}
}
