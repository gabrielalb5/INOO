package model;

public class Conversor {
    private static final double fahrenheit_divisao = (9.0/5.0);
    private static final double milha = 0.621371;

    public static void celsiusFahrenheit(double celsius){
        double fahrenheit = (celsius*fahrenheit_divisao)+32;
        System.out.println(celsius+"°C = "+fahrenheit+"°F");
    }

    public static void milhasKm(double km){
        System.out.println(km+"km = "+km*milha+" milhas");
    }
}
