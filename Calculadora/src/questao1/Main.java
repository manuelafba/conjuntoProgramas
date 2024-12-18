package questao1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto Calculadora
        Calculadora calculadora = new Calculadora();
        // Instanciando um objeto Scanner
        Scanner scanner = new Scanner(System.in);
        // Variável para controlar o encerramento do programa
        boolean continuar = true;
        // Variável responsável pelo direcionamento do menu
        int opcao;
        // Variáveis que guardam os operandos inteiros
        int numeroIntA, numeroIntB;
        // Variáveis que guardam os operandos decimais
        double numeroDecimalA, numeroDecimalB;
        
        // Laço para que após uma operação possa realizar outra
        while (continuar){
            // Exibir as opções que a calculadora possui
            exibirMenu();
            // Entrada do usuário conforme as opções do menu
            opcao = entradaInteira(scanner, "Sua opção: ");

            if (opcao >= 0 && opcao <= 15){
                // Tenta executar o código, porém se houver algum erro ele será tratado e mostrado no console na parte "catch"
                try {
                    // Direcionamento para cada operação de acordo com a escolha do usuário
                    switch (opcao){
                        case 1: // Adição
                            // Entrada de dois números decimais
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o primeiro número: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nSoma: " + numeroDecimalA + " + " + numeroDecimalB + " = " + calculadora.adicao(numeroDecimalA, numeroDecimalB));
                            
                            break;
                        case 2: // Subtração
                            // Entrada de dois números decimais
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o primeiro número: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nSubtração: " + numeroDecimalA + " - " + numeroDecimalB + " = " + calculadora.subtracao(numeroDecimalA, numeroDecimalB));
                            
                            break;
                        case 3: // Multiplicação
                            // Entrada de dois números decimais
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o primeiro número: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nMultiplicação: " + numeroDecimalA + " x " + numeroDecimalB + " = " + calculadora.multiplicacao(numeroDecimalA, numeroDecimalB));
                            break;
                        case 4: // Divisao
                            // Entrada de dois números decimais
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o primeiro número: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nDivisão: " + numeroDecimalA + " / " + numeroDecimalB + " = " + calculadora.divisao(numeroDecimalA, numeroDecimalB));
                            break;
                        case 5: // Divisao inteira
                            // Entrada de dois números inteiros
                            numeroIntA = entradaInteira(scanner, "\nDigite o primeiro número: ");
                            numeroIntB = entradaInteira(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nDivisão inteira: " + numeroIntA + " / " + numeroIntB + " = " + calculadora.divisaoInteira(numeroIntA, numeroIntB));
                            break;
                        case 6: // Resto da divisão
                            // Entrada de dois números decimais
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o primeiro número: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o segundo número: ");
                            // Print do resultado
                            System.out.println("\nResto da divisão: " + numeroDecimalA + " % " + numeroDecimalB + " = " + calculadora.resto(numeroDecimalA, numeroDecimalB));
                            break;
                        case 7: // Exponeciação
                            // Entrada de um número decimal (base) e um número inteiro (expoente)
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o valor da base: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o valor do expoente: ");
                            // Print do resultado
                            System.out.println("\nExponeciação: " + numeroDecimalA + " ^ " + numeroDecimalB + " = " + calculadora.exponenciacao(numeroDecimalA, numeroDecimalB));
                            break;
                        case 8: // Fatorial
                            // Entrada de um número inteiro
                            numeroIntA = entradaInteira(scanner, "\nDigite um número: ");
                            // Print do resultado
                            System.out.println("\nFatorial: " + numeroIntA + "!" + " = " + (calculadora.fatorial(numeroIntA) < 0 ? " Não existe fatorial de valores negativos." : calculadora.fatorial(numeroIntA)));
                            break;
                        case 9: // Arranjo simples
                            // Entrada de dois números inteiros (n e p)
                            numeroIntA = entradaInteira(scanner, "\nDigite o valor de n: ");
                            numeroIntB = entradaInteira(scanner, "Digite o valor de p: ");
                            // Print do resultado
                            System.out.println("\nArranjo de " + numeroIntA + " termos de " + numeroIntB + " em " +  + numeroIntB + " é: " +calculadora.arranjo(numeroIntA, numeroIntB));
                            break;
                        case 10: // Permutação simples
                            // Entrada de um número inteiro (n)
                            numeroIntA = entradaInteira(scanner, "\nDigite o valor de n: ");
                            // Print do resultado
                            System.out.println("\nPermutação simples de " + numeroIntA + " termos é: " + calculadora.permutacao(numeroIntA));
                            break;
                        case 11: // Piso
                            // Entrada de um número decimal (n)
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o valor de n: ");
                            // Print do resultado
                            System.out.println("\nPiso de " + numeroDecimalA + " é: " + calculadora.piso(numeroDecimalA));
                            break;
                        case 12: // Teto
                            // Entrada de um número decimal (n)
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o valor de n: ");
                            // Print do resultado
                            System.out.println("\nTeto de " + numeroDecimalA + " é: " + calculadora.teto(numeroDecimalA));
                        break;
                        case 13: // Raíz de grau n
                            // Entrada de um número decimal (base) e um número inteiro (grau)
                            numeroDecimalA = entradaDecimal(scanner, "\nDigite o valor da base: ");
                            numeroDecimalB = entradaDecimal(scanner, "Digite o valor do grau n: ");
                            // Print do resultado
                            System.out.println("\nRaíz de grau " + numeroDecimalB + " de " + numeroDecimalA + " é: " + calculadora.raizGrauN(numeroDecimalA, numeroDecimalB));
                            break;
                        case 14: // Validador de número primo
                            // Entrada de um número inteiro
                            numeroIntA = entradaInteira(scanner, "\nDigite um número: ");
                            // Print do resultado
                            System.out.println("\nO número " + numeroIntA + " é primo?" + (calculadora.isNumeroPrimo(numeroIntA) ? " Sim" : " Não"));
                            break;
                        case 15: // Validador de quadrado perfeito
                            // Entrada de um número inteiro
                            numeroIntA = entradaInteira(scanner, "\nDigite um número: ");
                            // Print do resultado
                            System.out.println("\nO número " + numeroIntA + " é um quadrado perfeito?" + (calculadora.isQuadradoPerfeito(numeroIntA) ? " Sim" : " Não"));
                            break;
                        case 0: // Saída do laço
                            continuar = false;
                            System.out.println("\nEncerrando calculadora.");
                            break;
                    }
                // Quando houver um erro no trecho do "try", o código será redirecionado para cá
                // Tratamento do erro com mensagem no console
                } catch (Exception e) {
                    System.out.println("\nErro: " + e.getMessage());
                }
                
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro entre 0 e 15.");
            }      
        }
    }

    // Função para exibir o menu
    public static void exibirMenu(){
        System.out.println("\n=== Calculadora ===");
        System.out.println("[01] Adição");
        System.out.println("[02] Subtração");
        System.out.println("[03] Multiplicação");
        System.out.println("[04] Divisão");
        System.out.println("[05] Divisão inteira");
        System.out.println("[06] Resto da divisão");
        System.out.println("[07] Exponenciação");
        System.out.println("[08] Fatorial");
        System.out.println("[09] Arranjos");
        System.out.println("[10] Permutações");
        System.out.println("[11] Piso");
        System.out.println("[12] Teto");
        System.out.println("[13] Raízes de grau n");
        System.out.println("[14] Validador de número primo");
        System.out.println("[15] Validador de quadrado perfeito");
        System.out.println("[0] Sair");
    }

    public static int entradaInteira(Scanner scanner, String texto){
        // Print da instrução para solicitar uma entrada
        System.out.print(texto);
        // Expressão regular para validar a entrada
        String regex = "^(\\-)?\\d+$";
        // Compilação da expressão regular
        Pattern pattern = Pattern.compile(regex);

        // Laço para pedir uma entrada válida
        while (true) { 
            // Pede uma entrada ao usuário
            String numero = scanner.nextLine();
            // Verifica se é válida na expressão regular
            Matcher matcher = pattern.matcher(numero);

            if (matcher.matches()) {
                // Caso seja válida, converte a string para int e retorna
                return Integer.parseInt(numero);
            } else {
                // Caso não seja válida, solicita a entrada novamente
                System.out.print("A entrada não é um número inteiro. Tente novamente: ");
            }
        }
    }
    
    public static double entradaDecimal(Scanner scanner, String texto){
        // Print da instrução para solicitar uma entrada
        System.out.print(texto);
        // Expressão regular para validar a entrada
        String regex = "^(\\-)?\\d+(\\.\\d*)?$";
       // Compilação da expressão regular
       Pattern pattern = Pattern.compile(regex);

       // Laço para pedir uma entrada válida
       while (true) { 
           // Pede uma entrada ao usuário
           String numero = scanner.nextLine();
           // Verifica se é válida na expressão regular
           Matcher matcher = pattern.matcher(numero);
            if (matcher.matches()) {
                // // Caso seja válida, converte a string para double e retorna
                return Double.parseDouble(numero);
            } else {
                // Caso não seja válida, solicita a entrada novamente
                System.out.print("A entrada não é um número válido. Tente novamente: ");
            }
        }
    }
}
