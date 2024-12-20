package validadorCPF;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CPF {
    
	public static void validadorPadrao(String cpf) {
		// Compilando o formato "xxx.xxx.xxx-xx" 
		Pattern padrao = Pattern.compile("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}$");
		// Comparação entre o padrão criado e a entrada do usuário
		Matcher comparador = padrao.matcher(cpf);
		// Booleana que irá retornar true caso a string do usuário seja igual ao padrão estabelecido 
		boolean validador = comparador.find();
		
		// Se a string satisfazer o padrão de um cpf:
		if(validador) {
			// Realizando o tratamento do input para o formato "xxxxxxxxxxx", para facilitar a manipulalção
			String cpfTratado = cpf.replaceAll("[\\.\\-]", "");
			/** Após o tratamento, é chamado o método "checagemFormato",
			 * passando a string tratada como argumento 
			**/
			somaDigitos(cpfTratado);
			
		// Tratamento de erro caso o formato do cpf seja inválido
		} else {
		    System.out.println(" ");
			System.out.println("O CPF informado não atende ao formato correto");
			System.out.println("Por favor, insira o CPF utilizando o formato: xxx.xxx.xxx-xx");
		}
	}
	
	/** Método responsável por realizar a soma dos 9 primeiros dígitos do CPF 
	 * e verificar a validade do décimo dígito, nomeado "primeiro dígito verificador"
	**/
	public static void somaDigitos(String cpf) {
		int soma = 0; // Armazena a soma dos dígitos
		int num = 10; // Varíavel de controle para iteração dos dígitos 
		
		// Loop de iteração que irá percorrer os dígitos do CPF
		for(int i = 0; i <= cpf.length(); i ++) {
		    // Condição de parada que irá garantir a soma até o nono dígito apenas
			if(num == 1) {
				break;
			// Lógica utilizada para a soma 
			} else {
			    // Realizando a multiplicação do dígito na posição i pelo valor presente em num
				int resultado = num * (cpf.charAt(i) - '0'); // 
				// Somando o resultado da multiplicação 
				soma += resultado;
				// Decrementando a variável de controle 
				num -= 1;
			}
		}
		
		// Dividindo o valor total da soma dos dígitos por 11 para obter o resto 
		int resto = soma % 11;
		
		// Checando o valor do primeiro digito verificador caso o resto seja "0" ou "1"
		if(resto == 0 | resto == 1) {
		    // Armazenando o valor que o primeiro dígito verificador deve possuir 
			int checagemDigito = 0;
			/** Checando se o valor esperado é igual ao valor presente na décima posição 
			 * do CPF fornecido pelo usuário
			**/
			if(checagemDigito == (cpf.charAt(9) - '0')) {
			    // Caso a condição seja verdadeira, o método "segundoDigito" é chamado
				segundoDigito(cpf);
			} else {
			    // Saídas informando o erro de lógica no dígito verificador
			    System.out.println(" ");
				System.out.println("CPF inválido");
				System.out.println("Primeiro digito verificador incorreto");
				return;
			}
		// Checando o valor do primeiro dígito caso o resto vá de "0" a "9"
		} else if(resto == 2| resto == 3| resto == 4| resto == 5| resto == 6|
				resto == 7| resto == 8| resto == 9| resto == 10) {
			// Armazena o valor do resto da divisão subtraído por 11
			int verificadorResto = 11 - resto;
			// Caso o valor subtraído seja igual ao décimo dígito do CPF fornecido pelo usuário:
			if(verificadorResto == (cpf.charAt(9) - '0')) {
			    // Método "segundoDigito" é chamado
				segundoDigito(cpf);
			// Caso a comparação seja inválida:
			} else {
			    // Saídas informando o erro de lógica no dígito verificador
			    System.out.println(" ");
				System.out.println("CPF inválido");
				System.out.println("Primeiro digito verificador incorreto");
				return;
				}
		/** Saídas informando o erro de lógica no dígito verificador caso o resto 
		 * não enquadre-se nos casos descritos acima 
		**/
		} else {
		    System.out.println(" ");
			System.out.println("CPF inválido");
			System.out.println("Primeiro digito verificador incorreto");
			return;
		}		
	}
	
	/** Método utilizado para realizar a verificação do décimo primeiro dígito 
	 * presente no CPF do usuário, nomeado de "segundo dígito verificador"
	**/
	public static void segundoDigito(String cpf) {
		int soma = 0; // Armazena a soma dos dígitos 
		int num = 11; // Variável de controle para iteração dos dígitos 
		
		// Loop utilizado para percorrer os dígitos do CPF
		for(int i = 0; i <= cpf.length(); i ++) {
		    // Condição de parada que irá garantir a soma até o décimo dígito apenas 
			if(num == 1) {
				break;
			} else {
			    /** Armazenando o valor da múltiplicação do dígito do CPF na posição i 
			     * pelo valor de num
			    **/
				int resultado = num * (cpf.charAt(i) - '0');
				// Somando o resultado da multiplicação
				soma += resultado;
				// Decrementando a varíavel num
				num -= 1;
			}
		}
		
		// Dividindo valor total de soma por 11 para obter o resto 
		int resto = soma % 11;
		
		// Checando o valor do primeiro digito verificador caso o resto seja "0" ou "1"
		if(resto == 0 | resto == 1) {
		    // Armazenando o valor que o primeiro dígito verificador deve possuir 
			int checagemDigito = 0;
			/** Checando se o valor esperado é igual ao valor presente na décima posição 
			 * do CPF fornecido pelo usuário
			**/
			if(checagemDigito == (cpf.charAt(10) - '0')) {
			    // Saída confirmando a validade do CPF 
			    System.out.println(" ");
				System.out.println("Seu CPF é válido");
			} else {
			    // Saídas informando erro no formato
			    System.out.println(" ");
				System.out.println("CPF inválido");
				System.out.println("Segundo digito verificador incorreto");
				return;
			}
		// Checando o valor do primeiro dígito caso o resto vá de "0" a "9"
		} else if(resto == 2| resto == 3| resto == 4| resto == 5| resto == 6|
				resto == 7| resto == 8| resto == 9| resto == 10) {
			// Armazena o valor do resto da divisão subtraído por 11
			int verificadorResto = 11 - resto;
			// Caso o valor subtraído seja igual ao décimo dígito do CPF fornecido pelo usuário:
			if(verificadorResto == (cpf.charAt(10) - '0')) {
			    // Saída confirmando a validade do CPF 
			    System.out.println(" ");
				System.out.println("Seu CPF é válido");
			} else {
			    // Saídas informando erro no formato
			    System.out.println(" ");
				System.out.println("CPF inválido");
				System.out.println("Segundo digito verificador incorreto");
				return;
				}
		/** Saídas informando o erro de lógica no dígito verificador caso o resto 
		 * não enquadre-se nos casos descritos acima 
		**/
		} else {
		    System.out.println(" ");
			System.out.println("CPF inválido");
			System.out.println("Segundo digito verificador incorreto");
			return;
		}		
	}
}
