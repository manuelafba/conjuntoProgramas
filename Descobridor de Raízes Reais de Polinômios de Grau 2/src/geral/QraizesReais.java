package geral;

import java.util.regex.*;
import java.util.Scanner;

/**
 * Classe para calcular as raízes reais de um polinômio de grau 2 na forma ax² + bx + c.
 */
public class QraizesReais {

	// Scanner para entrada do usuário
	private Scanner scanner = new Scanner(System.in);

	// Margem de erro para aproximação de valores
	private double EPSILON = 1e-6;

	/**
	 * Método principal para calcular e exibir as raízes reais de um polinômio quadrático.
	 * O usuário deve fornecer os valores dos coeficientes 'a', 'b' e 'c'.
	 */
	public void raizesReais() {
		double coeficienteA = coletarCoeficiente("a", true);
		double coeficienteB = coletarCoeficiente("b", false);
		double coeficienteC = coletarCoeficiente("c", false);

		// Calculando o discriminante
		double discriminante = calcularDiscriminante(coeficienteA, coeficienteB, coeficienteC);

		// Exibindo a expressão do polinômio
		exibirExpressao(coeficienteA, coeficienteB, coeficienteC);

		// Determinando as raízes com base no discriminante
		if (discriminante < 0) {
			System.out.println("A expressão formada não possui raízes reais.");
		} else {
			calcularEExibirRaizes(coeficienteA, coeficienteB, coeficienteC, discriminante);
		}
	}

	/**
	 * Método para calcular o discriminante (determinante) de um polinômio quadrático.
	 * Fórmula: discriminante = b² - 4ac.
	 *
	 * @param a Coeficiente 'a'.
	 * @param b Coeficiente 'b'.
	 * @param c Coeficiente 'c'.
	 * @return O valor do discriminante.
	 */
	private double calcularDiscriminante(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	/**
	 * Método para exibir a expressão do polinômio na forma ax² + bx + c.
	 *
	 * @param a Coeficiente 'a'.
	 * @param b Coeficiente 'b'.
	 * @param c Coeficiente 'c'.
	 */
	private void exibirExpressao(double a, double b, double c) {
		System.out.printf("Expressão formada: (%.2fx²) + (%.2fx) + (%.2f)%n", a, b, c);
	}

	/**
	 * Método para calcular e exibir as raízes do polinômio.
	 *
	 * @param a Coeficiente 'a'.
	 * @param b Coeficiente 'b'.
	 * @param c Coeficiente 'c'.
	 * @param discriminante Valor do discriminante.
	 */
	private void calcularEExibirRaizes(double a, double b, double c, double discriminante) {
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

		// Testando as raízes
		double resultado1 = a * raiz1 * raiz1 + b * raiz1 + c;
		double resultado2 = a * raiz2 * raiz2 + b * raiz2 + c;

		if (Math.abs(resultado1) < EPSILON) resultado1 = 0;
		if (Math.abs(resultado2) < EPSILON) resultado2 = 0;

		if (Math.abs(raiz1 - raiz2) < EPSILON) {
			System.out.printf("A expressão possui uma raiz única: %.3f%n", raiz1);
			System.out.printf("Teste da raiz: %.3f * %.3f² + %.3f * %.3f + %.3f = %.3f%n", a, raiz1, b, raiz1, c, resultado1);
		} else {
			System.out.printf("A expressão possui duas raízes reais: Raiz1 = %.3f e Raiz2 = %.3f%n", raiz1, raiz2);
			System.out.printf("Teste da raiz 1: %.3f * %.3f² + %.3f * %.3f + %.3f = %.3f%n", a, raiz1, b, raiz1, c, resultado1);
			System.out.printf("Teste da raiz 2: %.3f * %.3f² + %.3f * %.3f + %.3f = %.3f%n", a, raiz2, b, raiz2, c, resultado2);
		}
	}

	/**
	 * Método para coletar um coeficiente válido do usuário.
	 *
	 * @param nome Nome do coeficiente para exibição.
	 * @param obrigatorio Indica se o coeficiente deve ser diferente de zero.
	 * @return O valor numérico do coeficiente.
	 */
	private double coletarCoeficiente(String nome, boolean obrigatorio) {
		while (true) {
			System.out.printf("Digite o coeficiente '%s' do polinômio de grau 2: ", nome);
			double valor = coletarNumero();
			if (obrigatorio && Math.abs(valor) < EPSILON) {
				System.out.println("O coeficiente 'a' não pode ser zero. Tente novamente.");
			} else {
				return valor;
			}
		}
	}

	/**
	 * Método para coletar um número válido a partir da entrada do usuário.
	 *
	 * @return O valor numérico inserido pelo usuário.
	 */
	private double coletarNumero() {
		String regex = "^-?\\d+(\\.\\d+)?$"; // Aceita números inteiros e decimais
		Pattern pattern = Pattern.compile(regex);

		while (true) {
			String entrada = scanner.nextLine();
			Matcher matcher = pattern.matcher(entrada);

			if (matcher.matches()) {
				return Double.parseDouble(entrada);
			} else {
				System.out.print("Entrada inválida. Por favor, insira um número válido: ");
			}
		}
	}

}
