package disciplinasProjeto;

import java.util.ArrayList;

public class Disciplina {
	
	String nome;
	ArrayList<Integer> preRequesitos = new ArrayList<>();
	
	Disciplina(String nome){
		this.nome = nome;
	}
}
