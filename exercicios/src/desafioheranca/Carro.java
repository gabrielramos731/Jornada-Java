package desafioheranca;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	double velocidadeAtual;
	
	Carro(int velocidademaxima){
		VELOCIDADE_MAXIMA = velocidademaxima;
	}
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	void frear() {
		if(velocidadeAtual <= 5)
			velocidadeAtual = 0;
		else
			velocidadeAtual -= 5;
	}
}
