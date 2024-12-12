package questao3; 

public class ConversorComprimento {

    public static void metrosCentimetros(double metros) {  // Método para converter metros para centímetros
        double resultado = metros * 100;  // Fórmula de conversão: 1 metro = 100 centímetros
        System.out.println(metros + " m = " + resultado + " cm");  // Imprime o resultado da conversão
    }

    public static void metrosMilimetros(double metros) {  // Método para converter metros para milímetros
        double resultado = metros * 1000;  // Fórmula de conversão: 1 metro = 1000 milímetros
        System.out.println(metros + " m = " + resultado + " mm");  // Imprime o resultado da conversão
    }

    public static void metrosPolegadas(double metros) {  // Método para converter metros para polegadas
        double resultado = metros * 39.37;  // Fórmula de conversão: 1 metro = 39.37 polegadas
        System.out.println(metros + " m = " + resultado + " in");  // Imprime o resultado da conversão
    }

    public static void metrosPes(double metros) {  // Método para converter metros para pés
        double resultado = metros * 3.281;  // Fórmula de conversão: 1 metro = 3.281 pés
        System.out.println(metros + " m = " + resultado + " ft");  // Imprime o resultado da conversão
    }

    public static void centimetrosMetros(double centimetros) {  // Método para converter centímetros para metros
        double resultado = centimetros / 100;  // Fórmula de conversão: 100 centímetros = 1 metro
        System.out.println(centimetros + " cm = " + resultado + " m");  // Imprime o resultado da conversão
    }

    public static void centimetrosMilimetros(double centimetros) {  // Método para converter centímetros para milímetros
        double resultado = centimetros * 10;  // Fórmula de conversão: 1 centímetro = 10 milímetros
        System.out.println(centimetros + " cm = " + resultado + " mm");  // Imprime o resultado da conversão
    }

    public static void centimetrosPolegadas(double centimetros) {  // Método para converter centímetros para polegadas
        double resultado = centimetros / 2.54;  // Fórmula de conversão: 1 polegada = 2.54 centímetros
        System.out.println(centimetros + " cm = " + resultado + " in");  // Imprime o resultado da conversão
    }

    public static void centimetrosPes(double centimetros) {  // Método para converter centímetros para pés
        double resultado = centimetros / 30.48;  // Fórmula de conversão: 1 pé = 30.48 centímetros
        System.out.println(centimetros + " cm = " + resultado + " ft");  // Imprime o resultado da conversão
    }

    public static void milimetrosMetros(double milimetros) {  // Método para converter milímetros para metros
        double resultado = milimetros / 1000;  // Fórmula de conversão: 1000 milímetros = 1 metro
        System.out.println(milimetros + " mm = " + resultado + " m");  // Imprime o resultado da conversão
    }

    public static void milimetrosCentimetros(double milimetros) {  // Método para converter milímetros para centímetros
        double resultado = milimetros / 10;  // Fórmula de conversão: 10 milímetros = 1 centímetro
        System.out.println(milimetros + " mm = " + resultado + " cm");  // Imprime o resultado da conversão
    }

    public static void milimetrosPolegadas(double milimetros) {  // Método para converter milímetros para polegadas
        double resultado = milimetros / 25.4;  // Fórmula de conversão: 1 polegada = 25.4 milímetros
        System.out.println(milimetros + " mm = " + resultado + " in");  // Imprime o resultado da conversão
    }

    public static void milimetrosPes(double milimetros) {  // Método para converter milímetros para pés
        double resultado = milimetros / 304.8;  // Fórmula de conversão: 1 pé = 304.8 milímetros
        System.out.println(milimetros + " mm = " + resultado + " ft");  // Imprime o resultado da conversão
    }

    public static void polegadasMetros(double polegadas) {  // Método para converter polegadas para metros
        double resultado = polegadas / 39.37;  // Fórmula de conversão: 1 metro = 39.37 polegadas
        System.out.println(polegadas + " in = " + resultado + " m");  // Imprime o resultado da conversão
    }

    public static void polegadasCentimetros(double polegadas) {  // Método para converter polegadas para centímetros
        double resultado = polegadas * 2.54;  // Fórmula de conversão: 1 polegada = 2.54 centímetros
        System.out.println(polegadas + " in = " + resultado + " cm");  // Imprime o resultado da conversão
    }

    public static void polegadasMilimetros(double polegadas) {  // Método para converter polegadas para milímetros
        double resultado = polegadas * 25.4;  // Fórmula de conversão: 1 polegada = 25.4 milímetros
        System.out.println(polegadas + " in = " + resultado + " mm");  // Imprime o resultado da conversão
    }

    public static void polegadasPes(double polegadas) {  // Método para converter polegadas para pés
        double resultado = polegadas / 12;  // Fórmula de conversão: 1 pé = 12 polegadas
        System.out.println(polegadas + " in = " + resultado + " ft");  // Imprime o resultado da conversão
    }

    public static void pesMetros(double pes) {  // Método para converter pés para metros
        double resultado = pes / 3.281;  // Fórmula de conversão: 1 metro = 3.281 pés
        System.out.println(pes + " ft = " + resultado + " m");  // Imprime o resultado da conversão
    }

    public static void pesCentimetros(double pes) {  // Método para converter pés para centímetros
        double resultado = pes * 30.48;  // Fórmula de conversão: 1 pé = 30.48 centímetros
        System.out.println(pes + " ft = " + resultado + " cm");  // Imprime o resultado da conversão
    }

    public static void pesMilimetros(double pes) {  // Método para converter pés para milímetros
        double resultado = pes * 304.8;  // Fórmula de conversão: 1 pé = 304.8 milímetros
        System.out.println(pes + " ft = " + resultado + " mm");  // Imprime o resultado da conversão
    }

    public static void pesPolegadas(double pes) {  // Método para converter pés para polegadas
        double resultado = pes * 12;  // Fórmula de conversão: 1 pé = 12 polegadas
        System.out.println(pes + " ft = " + resultado + " in");  // Imprime o resultado da conversão
    }
}
