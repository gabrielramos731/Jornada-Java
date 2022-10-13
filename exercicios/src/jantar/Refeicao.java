package jantar;

public class Refeicao {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Gabriel", 70);
		Comida c1 = new Comida("Arroz", 0.25);
		Comida c2 = new Comida("Feijao", 0.13);
		
		System.out.printf("%s antes -> %.2fKg\n", p1.nome, p1.peso);
		p1.peso = p1.comer(c1);
		System.out.printf("%s comeu %s -> %.2fKg\n", p1.nome, c1.nome, p1.peso);
		p1.peso = p1.comer(c2);
		System.out.printf("%s comeu %s -> %.2fKg\n", p1.nome, c2.nome, p1.peso);
	}
}
