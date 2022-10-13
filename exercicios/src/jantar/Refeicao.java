package jantar;

public class Refeicao {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Gabriel", 70);
		Comida c1 = new Comida("Arroz", 0.25);
		Comida c2 = new Comida("Feijao", 0.13);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
