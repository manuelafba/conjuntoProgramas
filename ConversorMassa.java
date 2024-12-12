package questao3;

public class ConversorMassa {

    public static void quilosGramas(double quilos) {
        double resultado = quilos * 1000;
        System.out.println(quilos + " kg = " + resultado + " g");
    }

    public static void quilosLibras(double quilos) {
        double resultado = quilos * 2.205;
        System.out.println(quilos + " kg = " + resultado + " lbs");
    }

    public static void gramasQuilos(double gramas) {
        double resultado = gramas / 1000;
        System.out.println(gramas + " g = " + resultado + " kg");
    }

    public static void gramasLibras(double gramas) {
        double resultado = gramas / 453.6;
        System.out.println(gramas + " g = " + resultado + " lbs");
    }

    public static void librasQuilos(double libras) {
        double resultado = libras / 2.205;
        System.out.println(libras + " lbs = " + resultado + " kg");
    }

    public static void librasGramas(double libras) {
        double resultado = libras * 453.6;
        System.out.println(libras + " lbs = " + resultado + " g");
    }
}
