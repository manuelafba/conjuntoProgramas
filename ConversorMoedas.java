package questao3;

public class ConversorMoedas {

    public static void realDolar(double real) {
        double resultado = real / 5.96;
        System.out.println(real + " BRL = " + resultado + " USD");
    }

    public static void realEuro(double real) {
        double resultado = real / 6.26;
        System.out.println(real + " BRL = " + resultado + " EUR");
    }

    public static void realLibra(double real) {
        double resultado = real / 7.59;
        System.out.println(real + " BRL = " + resultado + " GBP");
    }

    public static void dolarReal(double dolar) {
        double resultado = dolar * 5.96;
        System.out.println(dolar + " USD = " + resultado + " BRL");
    }

    public static void dolarEuro(double dolar) {
        double resultado = dolar / 1.05;
        System.out.println(dolar + " USD = " + resultado + " EUR");
    }

    public static void dolarLibra(double dolar) {
        double resultado = dolar / 1.27;
        System.out.println(dolar + " USD = " + resultado + " GBP");
    }

    public static void euroReal(double euro) {
        double resultado = euro * 6.26;
        System.out.println(euro + " EUR = " + resultado + " BRL");
    }

    public static void euroDolar(double euro) {
        double resultado = euro * 1.05;
        System.out.println(euro + " EUR = " + resultado + " USD");
    }

    public static void euroLibra(double euro) {
        double resultado = euro / 1.21;
        System.out.println(euro + " EUR = " + resultado + " GBP");
    }

    public static void libraReal(double libra) {
        double resultado = libra * 7.59;
        System.out.println(libra + " GBP = " + resultado + " BRL");
    }

    public static void libraDolar(double libra) {
        double resultado = libra * 1.27;
        System.out.println(libra + " GBP = " + resultado + " USD");
    }

    public static void libraEuro(double libra) {
        double resultado = libra * 1.21;
        System.out.println(libra + " GBP = " + resultado + " EUR");
    }
}

