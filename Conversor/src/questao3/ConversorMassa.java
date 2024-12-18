package questao3;  

public class ConversorMassa {

    public static void quilosGramas(double quilos) {  // Método para converter quilos para gramas
        double resultado = quilos * 1000;  // Fórmula de conversão: 1 quilo = 1000 gramas
        System.out.println(quilos + " kg = " + resultado + " g");  // Imprime o resultado da conversão
    }

    public static void quilosLibras(double quilos) {  // Método para converter quilos para libras
        double resultado = quilos * 2.205;  // Fórmula de conversão: 1 quilo = 2.205 libras
        System.out.println(quilos + " kg = " + resultado + " lbs");  // Imprime o resultado da conversão
    }

    public static void gramasQuilos(double gramas) {  // Método para converter gramas para quilos
        double resultado = gramas / 1000;  // Fórmula de conversão: 1000 gramas = 1 quilo
        System.out.println(gramas + " g = " + resultado + " kg");  // Imprime o resultado da conversão
    }

    public static void gramasLibras(double gramas) {  // Método para converter gramas para libras
        double resultado = gramas / 453.6;  // Fórmula de conversão: 1 libra = 453.6 gramas
        System.out.println(gramas + " g = " + resultado + " lbs");  // Imprime o resultado da conversão
    }

    public static void librasQuilos(double libras) {  // Método para converter libras para quilos
        double resultado = libras / 2.205;  // Fórmula de conversão: 1 libra = 2.205 quilos
        System.out.println(libras + " lbs = " + resultado + " kg");  // Imprime o resultado da conversão
    }

    public static void librasGramas(double libras) {  // Método para converter libras para gramas
        double resultado = libras * 453.6;  // Fórmula de conversão: 1 libra = 453.6 gramas
        System.out.println(libras + " lbs = " + resultado + " g");  // Imprime o resultado da conversão
    }
}
