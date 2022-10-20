package sistemaDeCadastros;

import java.util.Scanner;

public class Vendedor {
	
	String nome = "s";
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
		return "\nNome: " + nome + "\nCPF: " + cpf + "\nData de nascimento: " + dataDeNascimento + 
				"\nSalario base: " + salarioBase + "\nToatal vendido: " + totalVendido + "\n";
	}
}
