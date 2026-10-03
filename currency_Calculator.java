package CurrencyCalc_PROJECT1;
import java.util.Scanner;

public class currency_Calculator {
    static double USD;
    static double BRITPOUND;
    static double Bolivar;
    static double Yen;
    static double won;
    static double euro;

    private static double currencyInput;
    private static double conversions;


    public static void main(String[] args) {
        currencyInput();
        conversions();
        getValues(currencyInput, conversions);
    }

    public static void currencyInput() {
    Scanner scnr = new Scanner(System.in);
        System.out.println("what is the amount in USD?");
        USD = scnr.nextDouble();
    }

    public static void conversions() {
        BRITPOUND = USD * 0.75;
        Bolivar = USD *  0.000000107684;
        Yen = USD * 0.00684422;
        won = USD *  0.000716695;
        euro = USD * 0.8890;
    }

    public static void getValues(double currencyInput, double conversions) {
        System.out.printf("British pounds: %.2f\n", BRITPOUND);
        System.out.printf("Venezuelan Bolivares: %.10f\n", Bolivar);
        System.out.printf("Japanese Yen: %.2f\n", Yen);
        System.out.printf("South Korean Won: %.2f\n", won);
        System.out.printf("European Union Euros: %.2f\n", euro);

    }
}
