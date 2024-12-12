package questao3;

public class ConversorComprimento {

    public static void metrosCentimetros(double metros) {
        double resultado = metros * 100;
        System.out.println(metros + " m = " + resultado + " cm");
    }

    public static void metrosMilimetros(double metros) {
        double resultado = metros * 1000;
        System.out.println(metros + " m = " + resultado + " mm");
    }

    public static void metrosPolegadas(double metros) {
        double resultado = metros * 39.37;
        System.out.println(metros + " m = " + resultado + " in");
    }

    public static void metrosPes(double metros) {
        double resultado = metros * 3.281;
        System.out.println(metros + " m = " + resultado + " ft");
    }

    public static void centimetrosMetros(double centimetros) {
        double resultado = centimetros / 100;
        System.out.println(centimetros + " cm = " + resultado + " m");
    }

    public static void centimetrosMilimetros(double centimetros) {
        double resultado = centimetros * 10;
        System.out.println(centimetros + " cm = " + resultado + " mm");
    }

    public static void centimetrosPolegadas(double centimetros) {
        double resultado = centimetros / 2.54;
        System.out.println(centimetros + " cm = " + resultado + " in");
    }

    public static void centimetrosPes(double centimetros) {
        double resultado = centimetros / 30.48;
        System.out.println(centimetros + " cm = " + resultado + " ft");
    }

    public static void milimetrosMetros(double milimetros) {
        double resultado = milimetros / 1000;
        System.out.println(milimetros + " mm = " + resultado + " m");
    }

    public static void milimetrosCentimetros(double milimetros) {
        double resultado = milimetros / 10;
        System.out.println(milimetros + " mm = " + resultado + " cm");
    }

    public static void milimetrosPolegadas(double milimetros) {
        double resultado = milimetros / 25.4;
        System.out.println(milimetros + " mm = " + resultado + " in");
    }

    public static void milimetrosPes(double milimetros) {
        double resultado = milimetros / 304.8;
        System.out.println(milimetros + " mm = " + resultado + " ft");
    }

    public static void polegadasMetros(double polegadas) {
        double resultado = polegadas / 39.37;
        System.out.println(polegadas + " in = " + resultado + " m");
    }

    public static void polegadasCentimetros(double polegadas) {
        double resultado = polegadas * 2.54;
        System.out.println(polegadas + " in = " + resultado + " cm");
    }

    public static void polegadasMilimetros(double polegadas) {
        double resultado = polegadas * 25.4;
        System.out.println(polegadas + " in = " + resultado + " mm");
    }

    public static void polegadasPes(double polegadas) {
        double resultado = polegadas / 12;
        System.out.println(polegadas + " in = " + resultado + " ft");
    }

    public static void pesMetros(double pes) {
        double resultado = pes / 3.281;
        System.out.println(pes + " ft = " + resultado + " m");
    }

    public static void pesCentimetros(double pes) {
        double resultado = pes * 30.48;
        System.out.println(pes + " ft = " + resultado + " cm");
    }

    public static void pesMilimetros(double pes) {
        double resultado = pes * 304.8;
        System.out.println(pes + " ft = " + resultado + " mm");
    }

    public static void pesPolegadas(double pes) {
        double resultado = pes * 12;
        System.out.println(pes + " ft = " + resultado + " in");
    }
}
