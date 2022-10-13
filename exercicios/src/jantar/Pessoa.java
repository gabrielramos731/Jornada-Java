package jantar;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida c1) {
		return peso + c1.peso;
	}
}
