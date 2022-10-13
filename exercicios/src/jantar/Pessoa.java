package jantar;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida c1) {
		this.peso += c1.peso;
	}
	
	String apresentar() {
		return "Olá eu sou " + nome + "e tenho " + peso + "Kgs.";
	}
}
