package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Menu Principal
            System.out.println("Escolha o tipo de conversão:");
            System.out.println("1. Temperatura");
            System.out.println("2. Comprimento");
            System.out.println("3. Massa");
            System.out.println("4. Moeda");
            System.out.println("5. Sair");

            int opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuTemperatura(scanner);
                    break;
                case 2:
                    menuComprimento(scanner);
                    break;
                case 3:
                    menuMassa(scanner);
                    break;
                case 4:
                    menuMoedas(scanner);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    // Conversão de Temperatura
    public static void menuTemperatura(Scanner scanner) {
        boolean continuarTemperatura = true;
        while (continuarTemperatura) {
            System.out.println("Escolha a conversão de temperatura desejada: ");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Celsius para Kelvin");
            System.out.println("3. Fahrenheit para Celsius");
            System.out.println("4. Fahrenheit para Kelvin");
            System.out.println("5. Kelvin para Celsius");
            System.out.println("6. Kelvin para Fahrenheit");

            int opcao = scanner.nextInt();
            System.out.print("Digite o valor da temperatura: ");
            double valorTemperatura = scanner.nextDouble();

            switch (opcao) {
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
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja fazer outra conversão?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            int resposta = scanner.nextInt();
            if (resposta == 2) {
                continuarTemperatura = false;
            }
        }
    }

    // Conversão de Comprimento
    public static void menuComprimento(Scanner scanner) {
        boolean continuarComprimento = true;
        while (continuarComprimento) {
            System.out.println("Escolha a conversão de comprimento desejada: ");
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

            int opcao = scanner.nextInt();
            System.out.print("Digite o valor do comprimento: ");
            double valorComprimento = scanner.nextDouble();

            switch (opcao) {
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
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja fazer outra conversão?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            int resposta = scanner.nextInt();
            if (resposta == 2) {
                continuarComprimento = false;
            }
        }
    }

    // Conversão de Massa
    public static void menuMassa(Scanner scanner) {
        boolean continuarMassa = true;
        while (continuarMassa) {
            System.out.println("Escolha a conversão de massa desejada: ");
            System.out.println("1. Quilogramas para Gramas");
            System.out.println("2. Quilogramas para Libras");
            System.out.println("3. Gramas para Quilogramas");
            System.out.println("4. Gramas para Libras");
            System.out.println("5. Libras para Quilogramas");
            System.out.println("6. Libras para Gramas");

            int opcao = scanner.nextInt();
            System.out.print("Digite o valor da massa: ");
            double valorMassa = scanner.nextDouble();

            switch (opcao) {
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
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja fazer outra conversão?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            int resposta = scanner.nextInt();
            if (resposta == 2) {
                continuarMassa = false;
            }
        }
    }

    public static void menuMoedas(Scanner scanner) {
        boolean continuarMoedas = true;
        while (continuarMoedas) {
            System.out.println("Escolha a conversão de moedas desejada: ");
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

            int opcao = scanner.nextInt();
            System.out.print("Digite o valor da moeda: ");
            double valorMoeda = scanner.nextDouble();

            // Conversões de moedas
            switch (opcao) {
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
            default:
                System.out.println("Opção inválida.");
                break;
        }

            System.out.println("Deseja fazer outra conversão?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            int resposta = scanner.nextInt();
            if (resposta == 2) {
                continuarMoedas = false;
            }
        }
    }
}
