package desafioheranca;

public class Carro {

	double velocidadeAtual;
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	void frear() {
		if(velocidadeAtual > 0)
			velocidadeAtual -= 5;
	}
}
