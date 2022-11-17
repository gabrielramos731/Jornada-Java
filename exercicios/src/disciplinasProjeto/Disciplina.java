package disciplinasProjeto;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	String nome;
	List<Double> preRequesitos = new ArrayList<>();
	
	Disciplina(String nome){
		this.nome = nome;
		preRequesitos.add(0.0);
	}
	Disciplina(String nome, Double a){
		this.nome = nome;
		preRequesitos.add(a);
	}
	Disciplina(String nome, Double a, Double b){
		this(nome, a);
		preRequesitos.add(b);
	}
	Disciplina(String nome, Double a, Double b, Double c){
		this(nome, a, b);
		preRequesitos.add(c);
	}
	
	void verificar(List<Double> materiasAprovadas) {
		if(materiasAprovadas.containsAll(preRequesitos) == true)
			System.out.println(nome);
	}
}
