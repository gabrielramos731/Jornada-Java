package elevador;

public class Elevador {
	
	int andarAtual, totalAndares, totalCapacidade, quantAtual;
	
	Elevador(int totalAndares, int totalCapacidade){
		this.totalAndares = totalAndares;
		this.totalCapacidade = totalCapacidade;
	}
	
	void entra(int a) {
		if(quantAtual + a <= totalCapacidade)
			quantAtual+=a;
		else {
			System.out.println("Capacidade máxima excedida.");
			quantAtual = totalCapacidade;
		}
	}
	
	void sai(int a) {
		if(quantAtual > 0 && quantAtual - a >= 0)
			quantAtual-=a;
		else
			System.out.println("Quantidade superior a quantidade total");
	}
}
