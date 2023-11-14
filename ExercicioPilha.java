package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

    public static void main(String[] args) {

    	int op;
        String nome;
        Scanner leia = new Scanner(System.in);

        Stack<String> pilha = new Stack<String>();

        System.out.println("\n\t\tMenu fila de clientes");
        System.out.println("\n-------------------------------------------------------");
        System.out.println("\n(1) Adicionar livro na pilha");
        System.out.println("\n(2) Listar todos os livros na pilha");
        System.out.println("\n(3) Retirar livro da Pilha ");
        System.out.println("\n(0) sair");

        do {

            System.out.println("\n-------------------------------------------------------");
            System.out.println("\nDigite sua opção: ");
            op = leia.nextInt();
            leia.nextLine();

            switch (op) {
                case 1:

                    System.out.println("Digite o nome do livro: ");
                    nome = leia.nextLine();
                    pilha.push(nome);
                    System.out.println("\nPilha: \n");

                    for (String livro : pilha) {
                        System.out.println(livro);
                    }

                    System.out.println("\nlivro Adicionado!");
                    break;

                case 2:
                    if (pilha.size() != 0) {
                        System.out.println("\nLista de todos os livros na pilha:");

                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                    } else {
                        System.out.println("A LISTA ESTÁ VAZIA!!");
                    }
                    break;

                case 3:

                    System.out.println("\nPilha: \n");
                    pilha.pop();
                    
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                    System.out.println("\nUm Livro foi retirado da pilha!");
                    break;

                case 0:

                    System.out.println("\nPrograma Finalizado!!");
                    break;

                default:

                    System.out.println("\nOpção inválida!!!");
            }

        } while (op != 0);
        leia.close();
    }

}
		


