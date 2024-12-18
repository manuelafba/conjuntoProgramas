package questao3;

public class ConversorTemperatura {

    public static void celsiusFahrenheit(double celsius) {  // Método para converter de Celsius para Fahrenheit
        double resultado = (celsius * 1.8) + 32;  // Fórmula para conversão de Celsius para Fahrenheit
        System.out.println(celsius + " °C = " + resultado + " °F");  // Imprime o resultado da conversão
    }

    public static void celsiusKelvin(double celsius) {  // Método para converter de Celsius para Kelvin
        double resultado = celsius + 273.15;  // Fórmula para conversão de Celsius para Kelvin
        System.out.println(celsius + " °C = " + resultado + " K");  // Imprime o resultado da conversão
    }

    public static void fahrenheitCelsius(double fahrenheit) {  // Método para converter de Fahrenheit para Celsius
        double resultado = (fahrenheit - 32) / 1.8;  // Fórmula para conversão de Fahrenheit para Celsius
        System.out.println(fahrenheit + " °F = " + resultado + " °C");  // Imprime o resultado da conversão
    }

    public static void fahrenheitKelvin(double fahrenheit) {  // Método para converter de Fahrenheit para Kelvin
        double resultado = (fahrenheit - 32) * 5 / 9 + 273.15;  // Fórmula para conversão de Fahrenheit para Kelvin
        System.out.println(fahrenheit + " °F = " + resultado + " K");  // Imprime o resultado da conversão
    }

    public static void kelvinCelsius(double kelvin) {  // Método para converter de Kelvin para Celsius
        double resultado = kelvin - 273.15;  // Fórmula para conversão de Kelvin para Celsius
        System.out.println(kelvin + " K = " + resultado + " °C");  // Imprime o resultado da conversão
    }

    public static void kelvinFahrenheit(double kelvin) {  // Método para converter de Kelvin para Fahrenheit
        double resultado = (kelvin - 273.15) * 1.8 + 32;  // Fórmula para conversão de Kelvin para Fahrenheit
        System.out.println(kelvin + " K = " + resultado + " °F");  // Imprime o resultado da conversão
    }
}
