package desafioheranca;

public class Ferrari extends Carro {

	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	void acelerar() {
		velocidadeAtual += 15;
	}
}
