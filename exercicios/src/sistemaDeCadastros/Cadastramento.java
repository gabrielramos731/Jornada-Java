package sistemaDeCadastros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cadastramento {
	
	public static void main(String[] args) {
		
		int opcao, i; int quantVendedores = 0, indexProcurado;
		String nomeBuscado;
		Scanner scanf = new Scanner(System.in);
		
		List<Vendedor> cadastroVendedores = new ArrayList<>();
		
		do {
			System.out.println("Digite a opção Desejada:  \r\n"
					+ "Cadastrar Novos Vendedores (1)\r\n"
					+ "Mostrar os dados de todos os Vendedores Cadastrados (2)\r\n"
					+ "calcular comissões (3)\r\n"
					+ "Mostrar dados de um vendedor específico (4)\r\n"
					+ "Sair do Programa (0)\n");
			opcao = scanf.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Quantos vendedores deseja cadastrar: ");
				quantVendedores = scanf.nextInt();
				for (i=0; i<quantVendedores; i++) {
					Vendedor obj = new Vendedor();
					obj.cadastrar();
					cadastroVendedores.add(obj);
				}
				break;
			case 2:
				for(Vendedor individuo : cadastroVendedores)
					System.out.println(individuo);
				break;
			case 3:
				Vendedor.calcularComissao(cadastroVendedores);
				break;
			case 4:
				System.out.println("Nome do vendedor: ");
				nomeBuscado = scanf.next();
				indexProcurado = Vendedor.encontrarVendedor(cadastroVendedores, nomeBuscado);
				System.out.println(indexProcurado);
				break;
			case 0:
				System.out.println("\nPrograma encerrado!\n");
				break;
			default:
				System.out.println("\nOpção inválida\n");
			}
		} while(opcao != 0);
	}
}
