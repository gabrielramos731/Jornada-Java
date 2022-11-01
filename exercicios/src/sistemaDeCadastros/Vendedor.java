package sistemaDeCadastros;

import java.util.List;
import java.util.Scanner;

public class Vendedor {
	
	String nome;
	String cpf;
	String dataDeNascimento;
	double salarioBase;
	double totalVendido;
	
	Scanner scanf = new Scanner(System.in);

	public void cadastrar() {
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
	
	public String calcularComissao() {
		return this.nome + ": R$" + this.totalVendido*0.03;
	}

	public boolean equals(Vendedor obj) {   //equals sobrescrito (compara apenas o nome)
		return this.nome.equals(obj.nome);
	}

	public static void encontrarVendedor(List<Vendedor> cadastroVendedores, String nomeBuscado) {
		int cont = 0;
		Vendedor obj = new Vendedor();
		obj.nome = nomeBuscado;
		for(Vendedor individuo : cadastroVendedores) {
			if(individuo.equals(obj)) {
				System.out.println(individuo.toString() + "\n");
				cont = 1;
			}
		}
		if(cont == 0)
			System.out.println("\nVendedor não cadastrado!\n");
	}
}
