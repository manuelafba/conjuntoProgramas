package questao3;

public class ConversorTemperatura {

    public static void celsiusFahrenheit(double celsius) { // Método para converter de Celsius para Fahrenheit
        if (celsius < -273.15) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Celsius (-273.15 °C).");
            return;
        }
        double resultado = (celsius * 1.8) + 32; // Fórmula para conversão de Celsius para Fahrenheit
        System.out.println(celsius + " °C = " + resultado + " °F"); // Imprime o resultado da conversão
    }

    public static void celsiusKelvin(double celsius) { // Método para converter de Celsius para Kelvin
        if (celsius < -273.15) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Celsius (-273.15 °C).");
            return;
        }
        double resultado = celsius + 273.15; // Fórmula para conversão de Celsius para Kelvin
        System.out.println(celsius + " °C = " + resultado + " K"); // Imprime o resultado da conversão
    }

    public static void fahrenheitCelsius(double fahrenheit) { // Método para converter de Fahrenheit para Celsius
        if (fahrenheit < -459.67) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Fahrenheit (-459.67 °F).");
            return;
        }
        double resultado = (fahrenheit - 32) / 1.8; // Fórmula para conversão de Fahrenheit para Celsius
        System.out.println(fahrenheit + " °F = " + resultado + " °C"); // Imprime o resultado da conversão
    }

    public static void fahrenheitKelvin(double fahrenheit) { // Método para converter de Fahrenheit para Kelvin
        if (fahrenheit < -459.67) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Fahrenheit (-459.67 °F).");
            return;
        }
        double resultado = (fahrenheit - 32) * 5 / 9 + 273.15; // Fórmula para conversão de Fahrenheit para Kelvin
        System.out.println(fahrenheit + " °F = " + resultado + " K"); // Imprime o resultado da conversão
    }

    public static void kelvinCelsius(double kelvin) { // Método para converter de Kelvin para Celsius
        if (kelvin < 0) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Kelvin (0 K).");
            return;
        }
        double resultado = kelvin - 273.15; // Fórmula para conversão de Kelvin para Celsius
        System.out.println(kelvin + " K = " + resultado + " °C"); // Imprime o resultado da conversão
    }

    public static void kelvinFahrenheit(double kelvin) { // Método para converter de Kelvin para Fahrenheit
        if (kelvin < 0) {
            System.out.println("Erro: Temperatura abaixo do zero absoluto em Kelvin (0 K).");
            return;
        }
        double resultado = (kelvin - 273.15) * 1.8 + 32; // Fórmula para conversão de Kelvin para Fahrenheit
        System.out.println(kelvin + " K = " + resultado + " °F"); // Imprime o resultado da conversão
    }
}
