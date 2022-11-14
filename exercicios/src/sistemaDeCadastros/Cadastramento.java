package sistemaDeCadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastramento {
	
	public static void main(String[] args) {
		
		int opcao, i; int quantVendedores = 0;
		String nomeBuscado;
		
		Scanner scanf = new Scanner(System.in);
		List<Vendedor> cadastroVendedores = new ArrayList<>();
		
		do {
			System.out.println("Digite a opção Desejada:  \r\n"
					+ "(1) Cadastrar Novos Vendedores\r\n"
					+ "(2) Mostrar os dados de todos os Vendedores Cadastrados\r\n"
					+ "(3) Calcular comissões \r\n"
					+ "(4) Mostrar dados de um vendedor específico \r\n"
					+ "(0) Sair do Programa \n");
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
				for(Vendedor individuo : cadastroVendedores)
					System.out.println(individuo.calcularComissao()+"\n");
				break;
			case 4:
				System.out.println("Nome do vendedor: ");
				nomeBuscado = scanf.next();
				Vendedor.encontrarVendedor(cadastroVendedores, nomeBuscado);		
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
