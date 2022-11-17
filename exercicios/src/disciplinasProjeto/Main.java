package disciplinasProjeto;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Disciplina> materias = new ArrayList<>();
		
		Disciplina icc = new Disciplina("introdução a ciência da computação");
		Disciplina gaal = new Disciplina("geomtria analítica e álgebra linear");
		Disciplina c1 = new Disciplina("cálculo 1");
		Disciplina ingles1 = new Disciplina("inglês 1");
		Disciplina algorit = new Disciplina("algoritmos e programação");
		Disciplina c2 = new Disciplina("cálculo 2");
		Disciplina sistemasDigitais = new Disciplina("sistemas digitais");
		materias.add(new Disciplina("oi"));
		materias.add(icc);
		materias.get(1).preRequesitos.add(1);
		System.out.println(icc.preRequesitos.get(0));
		
	}
}
