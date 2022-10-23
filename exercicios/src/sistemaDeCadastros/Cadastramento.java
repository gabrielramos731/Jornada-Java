package sistemaDeCadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastramento {
	
	public static void main(String[] args) {
		
		int opcao, i; int quantVendedores = 0, indexProcurado;
		String nomeBuscado;
		
		String a = "i", b = "i";
		System.out.println(a.equals(b));
		
		Vendedor v1 = new Vendedor();
		v1.nome="a";
		v1.cpf="1";
		Vendedor v2 = new Vendedor();
		v2.nome="a";
		v2.cpf="0";
		System.out.println(v1.equals(v2));
		
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
					System.out.println(individuo.toString() + "\n");
				break;
			case 3:
				Vendedor.calcularComissao(cadastroVendedores);
				break;
			case 4:  //nao mostra os repetidos
				System.out.println("Nome do vendedor: ");
				nomeBuscado = scanf.next();
				indexProcurado = Vendedor.encontrarVendedor(cadastroVendedores, nomeBuscado);
				if(indexProcurado == -1)
					System.out.println("Vendedor não cadastrado\n");
				else
					System.out.println(cadastroVendedores.get(indexProcurado) + "\n");					
				break;
			case 0:
				System.out.println("\nPrograma encerrado!\n");
				break;
			default:
				System.out.println("\nOpção inválida\n");
			}
		} while(opcao != 0);
		scanf.close();
	}
}
