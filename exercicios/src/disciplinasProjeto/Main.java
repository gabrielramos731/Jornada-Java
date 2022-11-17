package disciplinasProjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Disciplina> materias = new ArrayList<>();
		List<Double> materiasAprovadas = new ArrayList<>();
		Scanner scanf = new Scanner(System.in);
		Double aprovado;
		
		materias.add(new Disciplina("icc"));
		materias.add(new Disciplina("gaal"));
		materias.add(new Disciplina("cálculo 1"));
		materias.add(new Disciplina("ingles 1"));
		materias.add(new Disciplina("algoritmos",1.1));
		materias.add(new Disciplina("cálculo de várias variáveis",1.2));
		materias.add(new Disciplina("sistemas digitais"));
		materias.add(new Disciplina("análise numérica", 1.2, 2.1));
		
		System.out.println("Digite as materias aprovadas no formato perído,linha. Ex.(1,3)"
				+ "\n0 quando concluído");
		while(true) {
			aprovado = scanf.nextDouble();
			materiasAprovadas.add(aprovado);
			if(aprovado == 0)
				break;
		}
		
		System.out.println("Matérias disponíveis: ");
		for(Disciplina materia : materias) {
			materia.verificar(materiasAprovadas);
		}
		scanf.close();
	}
}
