package questao3;

import java.util.Scanner; // Importando a classe Scanner

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para ler as entradas do usuário
		boolean continuar = true; // Variável para controlar a execução do loop principal

		while (continuar) { // Loop que continua enquanto a variável "continuar" for verdadeira
			// Menu principal com opções para o usuário escolher qual tipo de conversão deseja realizar
			System.out.println("Escolha o tipo de conversão:");
			System.out.println("1. Temperatura");
			System.out.println("2. Comprimento");
			System.out.println("3. Massa");
			System.out.println("4. Moeda");
			System.out.println("5. Sair");

			int opcaoPrincipal = scanner.nextInt(); // Lê a opção escolhida pelo usuário representada por um inteiro
			if (opcaoPrincipal > 0 && opcaoPrincipal <= 5) {
				switch (opcaoPrincipal) { // Switch case para processar a opção escolhida
				case 1:
					menuTemperatura(scanner); // Chama o menu de conversão de temperatura
					break;
				case 2:
					menuComprimento(scanner); // Chama o menu de conversão de comprimento
					break;
				case 3:
					menuMassa(scanner); // Chama o menu de conversão de massa
					break;
				case 4:
					menuMoedas(scanner); // Chama o menu de conversão de moedas
					break;
				case 5:
					continuar = false; // Troca o valor da variável "continuar" caso o usuário decida não fazer nenhuma operação e encerra o programa
					System.out.println("Programa encerrado.");
					break;
				}
			} else {
				System.out.println("Opção inválida."); // Mensagem exibida caso uma opção inválida seja escolhida
			}
		}
		scanner.close(); // Fecha o scanner após o fim da execução
	}

	// Menu de conversão de temperatura
	public static void menuTemperatura(Scanner scanner) {
		boolean continuarTemperatura = true; // Variável para controlar o loop de conversões de temperatura
		while (continuarTemperatura) { // Loop que continua enquanto a variável "continuarTemperatura" for verdadeira
			System.out.println("Escolha a conversão de temperatura desejada: "); // Menu com opções de conversão de temperatura
			System.out.println("1. Celsius para Fahrenheit");
			System.out.println("2. Celsius para Kelvin");
			System.out.println("3. Fahrenheit para Celsius");
			System.out.println("4. Fahrenheit para Kelvin");
			System.out.println("5. Kelvin para Celsius");
			System.out.println("6. Kelvin para Fahrenheit");

			int opcaoTemperatura = scanner.nextInt(); // Lê a opção de conversão

			if (opcaoTemperatura > 0 && opcaoTemperatura <= 6) {
				System.out.print("Digite o valor da temperatura: ");
				double valorTemperatura = scanner.nextDouble(); // Lê o valor da temperatura

				switch (opcaoTemperatura) { // Switch case para realizar a conversão de acordo com a opção escolhida
				// Chamada de métodos da classe ConversorTemperatura passando a temperatura digitada como parâmetro
				case 1:
					ConversorTemperatura.celsiusFahrenheit(valorTemperatura);
					break;
				case 2:
					ConversorTemperatura.celsiusKelvin(valorTemperatura);
					break;
				case 3:
					ConversorTemperatura.fahrenheitCelsius(valorTemperatura);
					break;
				case 4:
					ConversorTemperatura.fahrenheitKelvin(valorTemperatura);
					break;
				case 5:
					ConversorTemperatura.kelvinCelsius(valorTemperatura);
					break;
				case 6:
					ConversorTemperatura.kelvinFahrenheit(valorTemperatura);
					break;
				}
			} else {
				System.out.println("Opção inválida."); // Mensagem exibida caso uma opção inválida seja escolhida
			}

		System.out.println("Deseja fazer outra conversão de temperatura?"); // Pergunta se o usuário deseja realizar outra conversão
		System.out.println("1. Sim");
		System.out.println("2. Não");
		int resposta = scanner.nextInt(); // Lê a resposta
		if (resposta == 2) {
			continuarTemperatura = false; // Se a resposta for 2, encerra o loop
			}
		}
	}

	// Menu de conversão de comprimento
	public static void menuComprimento(Scanner scanner) {
		boolean continuarComprimento = true; // Variável para controlar o loop de conversões de comprimento
		while (continuarComprimento) { // Loop que continua enquanto a variável "continuarComprimento" for verdadeira
			System.out.println("Escolha a conversão de comprimento desejada: "); // Menu com opções de conversão de comprimento
			System.out.println("1. Metros para Centímetros");
			System.out.println("2. Metros para Milímetros");
			System.out.println("3. Metros para Polegadas");
			System.out.println("4. Metros para Pés");
			System.out.println("5. Centímetros para Metros");
			System.out.println("6. Centímetros para Milímetros");
			System.out.println("7. Centímetros para Polegadas");
			System.out.println("8. Centímetros para Pés");
			System.out.println("9. Milímetros para Metros");
			System.out.println("10. Milímetros para Centímetros");
			System.out.println("11. Milímetros para Polegadas");
			System.out.println("12. Milímetros para Pés");
			System.out.println("13. Polegadas para Metros");
			System.out.println("14. Polegadas para Centímetros");
			System.out.println("15. Polegadas para Milímetros");
			System.out.println("16. Polegadas para Pés");
			System.out.println("17. Pés para Metros");
			System.out.println("18. Pés para Centímetros");
			System.out.println("19. Pés para Milímetros");
			System.out.println("20. Pés para Polegadas");

			int opcaoComprimento = scanner.nextInt(); // Lê a opção de conversão

			if (opcaoComprimento > 0 && opcaoComprimento <= 20) {
				System.out.print("Digite o valor do comprimento: ");
				double valorComprimento = scanner.nextDouble(); // Lê o valor do comprimento

				switch (opcaoComprimento) { // Switch case para realizar a conversão de acordo com a opção escolhida
				// Chamada de métodos da classe ConversorComprimento passando o comprimento digitado como parâmetro
				case 1:
					ConversorComprimento.metrosCentimetros(valorComprimento);
					break;
				case 2:
					ConversorComprimento.metrosMilimetros(valorComprimento);
					break;
				case 3:
					ConversorComprimento.metrosPolegadas(valorComprimento);
					break;
				case 4:
					ConversorComprimento.metrosPes(valorComprimento);
					break;
				case 5:
					ConversorComprimento.centimetrosMetros(valorComprimento);
					break;
				case 6:
					ConversorComprimento.centimetrosMilimetros(valorComprimento);
					break;
				case 7:
					ConversorComprimento.centimetrosPolegadas(valorComprimento);
					break;
				case 8:
					ConversorComprimento.centimetrosPes(valorComprimento);
					break;
				case 9:
					ConversorComprimento.milimetrosMetros(valorComprimento);
					break;
				case 10:
					ConversorComprimento.milimetrosCentimetros(valorComprimento);
					break;
				case 11:
					ConversorComprimento.milimetrosPolegadas(valorComprimento);
					break;
				case 12:
					ConversorComprimento.milimetrosPes(valorComprimento);
					break;
				case 13:
					ConversorComprimento.polegadasMetros(valorComprimento);
					break;
				case 14:
					ConversorComprimento.polegadasCentimetros(valorComprimento);
					break;
				case 15:
					ConversorComprimento.polegadasMilimetros(valorComprimento);
					break;
				case 16:
					ConversorComprimento.polegadasPes(valorComprimento);
					break;
				case 17:
					ConversorComprimento.pesMetros(valorComprimento);
					break;
				case 18:
					ConversorComprimento.pesCentimetros(valorComprimento);
					break;
				case 19:
					ConversorComprimento.pesMilimetros(valorComprimento);
					break;
				case 20:
					ConversorComprimento.pesPolegadas(valorComprimento);
					break;
				}
			} else {
				System.out.println("Opção inválida."); // Mensagem exibida caso uma opção inválida seja escolhida
			}

		System.out.println("Deseja fazer outra conversão de comprimento?"); // Pergunta se o usuário deseja realizar outra conversão
		System.out.println("1. Sim");
		System.out.println("2. Não");
		int resposta = scanner.nextInt(); // Lê a resposta
		if (resposta == 2) {
			continuarComprimento = false; // Se a resposta for 2, encerra o loop
		}
	}
	}
	
	// Menu de conversão de massa
	public static void menuMassa(Scanner scanner) {
		boolean continuarMassa = true; // Variável para controlar o loop de conversões de massa
		while (continuarMassa) { // Loop que continua enquanto a variável "continuarMassa" for verdadeira
			System.out.println("Escolha a conversão de massa desejada: "); // Menu com opções de conversão de massa
			System.out.println("1. Quilogramas para Gramas");
			System.out.println("2. Quilogramas para Libras");
			System.out.println("3. Gramas para Quilogramas");
			System.out.println("4. Gramas para Libras");
			System.out.println("5. Libras para Quilogramas");
			System.out.println("6. Libras para Gramas");

			int opcaoMassa = scanner.nextInt(); // Lê a opção escolhida
			scanner.nextLine(); // Consome a nova linha residual

			if (opcaoMassa > 0 && opcaoMassa <= 6) {
				System.out.print("Digite o valor da massa: ");
				double valorMassa = scanner.nextDouble(); // Lê o valor da massa
				scanner.nextLine(); // Consome a nova linha residual

				switch (opcaoMassa) { // Switch case para realizar a conversão de acordo com a opção escolhida
				// Chamada de métodos da classe ConversorMassa passando a massa digitada como parâmetro
				case 1:
					ConversorMassa.quilosGramas(valorMassa);
					break;
				case 2:
					ConversorMassa.quilosLibras(valorMassa);
					break;
				case 3:
					ConversorMassa.gramasQuilos(valorMassa);
					break;
				case 4:
					ConversorMassa.gramasLibras(valorMassa);
					break;
				case 5:
					ConversorMassa.librasQuilos(valorMassa);
					break;
				case 6:
					ConversorMassa.librasGramas(valorMassa);
					break;
				}
			} else {
				System.out.println("Opção inválida."); // Mensagem exibida caso uma opção inválida seja escolhida
			}

			System.out.println("Deseja fazer outra conversão de massa?"); // Pergunta se o usuário deseja realizar outra conversão
			System.out.println("1. Sim");
			System.out.println("2. Não");
			int resposta = scanner.nextInt(); // Lê a resposta

			if (resposta == 2) {
				continuarMassa = false; // Se a resposta for 2, encerra o loop
			}
		}
	}

	// Menu de conversão de moedas
	public static void menuMoedas(Scanner scanner) {
		boolean continuarMoedas = true; // Variável para controlar o loop de conversões de moedas
		while (continuarMoedas) { // Loop que continua enquanto a variável "continuarMoedas" for verdadeira
			System.out.println("Escolha a conversão de moedas desejada: "); // Menu com opções de conversão de moedas
			System.out.println("1. Real para Dólar");
			System.out.println("2. Real para Euro");
			System.out.println("3. Real para Libra");
			System.out.println("4. Dólar para Real");
			System.out.println("5. Dólar para Euro");
			System.out.println("6. Dólar para Libra");
			System.out.println("7. Euro para Real");
			System.out.println("8. Euro para Dólar");
			System.out.println("9. Euro para Libra");
			System.out.println("10. Libra para Real");
			System.out.println("11. Libra para Dólar");
			System.out.println("12. Libra para Euro");

			int opcaoMoeda = scanner.nextInt(); // Lê a opção escolhida

			if (opcaoMoeda > 0 && opcaoMoeda <= 12) {
				System.out.print("Digite o valor da moeda: ");
				double valorMoeda = scanner.nextDouble(); // Lê o valor da moeda

				switch (opcaoMoeda) { // Switch case para realizar a conversão de acordo com a opção escolhida
				// Chamada de métodos da classe ConversorMoedas passando a moeda digitada como parâmetro
				case 1:
					ConversorMoedas.realDolar(valorMoeda);
					break;
				case 2:
					ConversorMoedas.realEuro(valorMoeda);
					break;
				case 3:
					ConversorMoedas.realLibra(valorMoeda);
					break;
				case 4:
					ConversorMoedas.dolarReal(valorMoeda);
					break;
				case 5:
					ConversorMoedas.dolarEuro(valorMoeda);
					break;
				case 6:
					ConversorMoedas.dolarLibra(valorMoeda);
					break;
				case 7:
					ConversorMoedas.euroReal(valorMoeda);
					break;
				case 8:
					ConversorMoedas.euroDolar(valorMoeda);
					break;
				case 9:
					ConversorMoedas.euroLibra(valorMoeda);
					break;
				case 10:
					ConversorMoedas.libraReal(valorMoeda);
					break;
				case 11:
					ConversorMoedas.libraDolar(valorMoeda);
					break;
				case 12:
					ConversorMoedas.libraEuro(valorMoeda);
					break;
				}
			} else {
				System.out.println("Opção inválida."); // Mensagem exibida caso uma opção inválida seja escolhida
			}

			System.out.println("Deseja fazer outra conversão de moedas?"); // Pergunta se o usuário deseja realizar outra conversão
			System.out.println("1. Sim");
			System.out.println("2. Não");
			int resposta = scanner.nextInt(); // Lê a resposta
			if (resposta == 2) {
				continuarMoedas = false; // Se a resposta for 2, encerra o loop
			}
		}
	}
}
