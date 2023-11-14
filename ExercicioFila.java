package estruturadedados;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFila {

	public static void main(String[] args) {
		
		int op;
		String nome;
		Scanner leia = new Scanner(System.in);
					
		Queue<String> minhaFila = new LinkedList<>();	
		 
		 
		System.out.println("\n\t\tMenu fila de clientes");
		System.out.println("\n-------------------------------------------------------");
		System.out.println("\n(1) Adicionar um novo Cliente na fila");
		System.out.println("\n(2) Listar todos os Clientes na fila");
		System.out.println("\n(3) Chamar (retirar) uma pessoa da fila ");
		System.out.println("\n(0) sair");
				
		 do {
			 
			 System.out.println("\n-------------------------------------------------------");
			 System.out.println("\nDigite sua opção: ");
			 op = leia.nextInt();
			 leia.nextLine();
			
			switch(op) {
			case 1:
				
				System.out.println("Digite o nome do cliente: ");
				nome = leia.nextLine();
				minhaFila.add(nome);
				System.out.println("\nFila: \n");
				System.out.println(nome);
				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				if(minhaFila.size()!=0) {
					System.out.println("\nLista de todos os Clientes na fila: "+minhaFila);
				}else {
					System.out.println("A LISTA ESTA VAZIA!!");
				}
				
				break;
				
			case 3:
				
				System.out.println("\nChamando proximo cliente ");
				minhaFila.remove();
				break;
				
			case 0:
				
				System.out.println("\nMuito obrigado por utilizar o nosso Sistema!");
				break;
				
			default:
				
				System.out.println("\nOpção inválida!!!");
			}
			
		}  
		 	while(op !=0);
		 leia.close();

	}
		
	}


