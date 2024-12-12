package questao3;

public class ConversorTemperatura {

    public static void celsiusFahrenheit(double celsius) {
        double resultado = (celsius * 1.8) + 32;
        System.out.println(celsius + " °C = " + resultado + " °F");
    }

    public static void celsiusKelvin(double celsius) {
        double resultado = celsius + 273.15;
        System.out.println(celsius + " °C = " + resultado + " K");
    }

    public static void fahrenheitCelsius(double fahrenheit) {
        double resultado = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " °F = " + resultado + " °C");
    }

    public static void fahrenheitKelvin(double fahrenheit) {
        double resultado = (fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.println(fahrenheit + " °F = " + resultado + " K");
    }

    public static void kelvinCelsius(double kelvin) {
        double resultado = kelvin - 273.15;
        System.out.println(kelvin + " K = " + resultado + " °C");
    }

    public static void kelvinFahrenheit(double kelvin) {
        double resultado = (kelvin - 273.15) * 1.8 + 32;
        System.out.println(kelvin + " K = " + resultado + " °F");
    }
}

