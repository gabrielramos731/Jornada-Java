package desafioheranca;

public class Teste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		Carro c2 = new Ferrari();
		
		c1.acelerar();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.velocidadeAtual);
		c2.acelerar();
		System.out.println(c2.velocidadeAtual);
	}
}
