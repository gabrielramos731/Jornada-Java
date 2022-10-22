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
	
	public static void calcularComissao(List<Vendedor> cadastroVendedores) {
		for(Vendedor individuo : cadastroVendedores) {
			System.out.printf("\n%s: R$%.2f\n", individuo.nome, individuo.totalVendido * 0.03);
		}
		System.out.println("\n");
	}
	
	public int hashCode() {
		return Objects.hash(cpf, dataDeNascimento, nome, salarioBase, totalVendido);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataDeNascimento, other.dataDeNascimento)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salarioBase) == Double.doubleToLongBits(other.salarioBase)
				&& Double.doubleToLongBits(totalVendido) == Double.doubleToLongBits(other.totalVendido);
	}

	public static int encontrarVendedor(List<Vendedor> cadastroVendedores, String nomeBuscado) {
		for(Object individuo : cadastroVendedores) {
			if(individuo.equals(new Vendedor().nome == nomeBuscado));
			return cadastroVendedores.indexOf(individuo);
		}
		return -1;
	}
}
