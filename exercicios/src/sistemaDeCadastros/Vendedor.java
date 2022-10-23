package sistemaDeCadastros;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Vendedor {
	
	String nome;
	String cpf;
	String dataDeNascimento;
	double salarioBase;
	double totalVendido;
	
	Scanner scanf = new Scanner(System.in);

	void cadastrar() {
		System.out.println("Nome: ");
		this.nome = scanf.next();
		System.out.println("CPF: ");
		this.cpf = scanf.next();
		System.out.println("Data de Nascimento: ");
		this.dataDeNascimento = scanf.next();
		System.out.println("Salário base: ");
		this.salarioBase = scanf.nextDouble();
		System.out.println("Total vendido: ");
		this.totalVendido = scanf.nextDouble();
	}
	
	public String toString() {
		return "Vendedor [nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + ", salarioBase="
				+ salarioBase + ", totalVendido=" + totalVendido + "]";
	}

	public static void calcularComissao(List<Vendedor> cadastroVendedores) {
		for(Vendedor individuo : cadastroVendedores) {
			System.out.printf("\n%s: R$%.2f\n", individuo.nome, individuo.totalVendido * 0.03);
		}
		System.out.println("\n");
	}

	public boolean equals(Object obj) {
		Vendedor outro = (Vendedor) obj;
		return this.nome.equals(outro.nome);
	}
	
	public static int encontrarVendedor(List<Vendedor> cadastroVendedores, String nomeBuscado) {
		Vendedor obj = new Vendedor();
		obj.nome = nomeBuscado;
		for(Vendedor individuo : cadastroVendedores) {
			if(individuo.equals(obj))
				return cadastroVendedores.indexOf(individuo);
		}
		return -1;
	}
}
