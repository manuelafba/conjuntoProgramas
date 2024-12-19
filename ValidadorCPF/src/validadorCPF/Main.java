package validadorCPF;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Input para o CPF 
		Scanner entradaCPF = new Scanner(System.in);
		// Input para a seleção no menu 
		Scanner entradaSelecao = new Scanner(System.in);
		int selecao; // Variável para armazenar a escolha do usuário 
		
		// Loop de menu para o usuário verificar quantos CPFs quiser 
		do {
		    System.out.println(" ");
		    System.out.println("Insira o CPF utilizando o formato xxx.xxx.xxx-xx");
		    System.out.print("Insira aqui o CPF a ser validado: ");
		    // Variável cpf armazena o valor do input
		    String cpf = entradaCPF.nextLine();
		    
		    // Chamada do método "validadorPadrao" da classe CPF, passando a string fornecida como argumento
		    CPF.validadorPadrao(cpf);
		    
		    // Menu principal 
		    System.out.println(" ");
		    System.out.println("-------------------------------------------------");
		    System.out.println("Deseja verificar outro CPF?");
		    System.out.println("[1] - Sim");
		    System.out.println("[2] - Não");
		    System.out.println(" ");
		    
		    System.out.print("Insira aqui sua escolha: ");
		    // Variável para armazenar a escolha do usuário 
		    selecao = entradaSelecao.nextInt();
		
		} while(selecao != 2); // Condição de parada do loop 
		
		System.out.println(" ");
		System.out.println("Programa encerrado");
	}
}
