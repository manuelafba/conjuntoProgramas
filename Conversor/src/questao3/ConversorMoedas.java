package questao3;  

public class ConversorMoedas {

    public static void realDolar(double real) {  // Método para converter reais para dólares
        double resultado = real / 5.96;  
        System.out.println(real + " BRL = " + resultado + " USD");  // Imprime o resultado da conversão
    }

    public static void realEuro(double real) {  // Método para converter reais para euros
        double resultado = real / 6.26;  
        System.out.println(real + " BRL = " + resultado + " EUR");  // Imprime o resultado da conversão
    }

    public static void realLibra(double real) {  // Método para converter reais para libras
        double resultado = real / 7.59;   
        System.out.println(real + " BRL = " + resultado + " GBP");  // Imprime o resultado da conversão
    }

    public static void dolarReal(double dolar) {  // Método para converter dólares para reais
        double resultado = dolar * 5.96;  
        System.out.println(dolar + " USD = " + resultado + " BRL");  // Imprime o resultado da conversão
    }

    public static void dolarEuro(double dolar) {  // Método para converter dólares para euros
        double resultado = dolar / 1.05;  
        System.out.println(dolar + " USD = " + resultado + " EUR");  // Imprime o resultado da conversão
    }

    public static void dolarLibra(double dolar) {  // Método para converter dólares para libras
        double resultado = dolar / 1.27;  
        System.out.println(dolar + " USD = " + resultado + " GBP");  // Imprime o resultado da conversão
    }

    public static void euroReal(double euro) {  // Método para converter euros para reais
        double resultado = euro * 6.26;  
        System.out.println(euro + " EUR = " + resultado + " BRL");  // Imprime o resultado da conversão
    }

    public static void euroDolar(double euro) {  // Método para converter euros para dólares
        double resultado = euro * 1.05;  
        System.out.println(euro + " EUR = " + resultado + " USD");  // Imprime o resultado da conversão
    }

    public static void euroLibra(double euro) {  // Método para converter euros para libras
        double resultado = euro / 1.21;  
        System.out.println(euro + " EUR = " + resultado + " GBP");  // Imprime o resultado da conversão
    }

    public static void libraReal(double libra) {  // Método para converter libras para reais
        double resultado = libra * 7.59;  
        System.out.println(libra + " GBP = " + resultado + " BRL");  // Imprime o resultado da conversão
    }

    public static void libraDolar(double libra) {  // Método para converter libras para dólares
        double resultado = libra * 1.27;  
        System.out.println(libra + " GBP = " + resultado + " USD");  // Imprime o resultado da conversão
    }

    public static void libraEuro(double libra) {  // Método para converter libras para euros
        double resultado = libra * 1.21;  
        System.out.println(libra + " GBP = " + resultado + " EUR");  // Imprime o resultado da conversão
    }
}
