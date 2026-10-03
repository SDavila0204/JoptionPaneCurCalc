package CurrencyCalc_PROJECT1;
import javax.swing.*;

public class Currency_Calc_JoptionPane {
    static double USD;
    static double BRITPOUND;
    static double Bolivar;
    static double Yen;
    static double won;
    static double euro;

    public static void main(String[] args) {
        currencyInput();
        conversions();
        getValues();
    }

    public static void currencyInput() {
        try {
            String currenrcyinput = JOptionPane.showInputDialog("Enter amount in USD: ");
            USD = Double.parseDouble(currenrcyinput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid. Please enter valid number.");
            System.exit(0);
        }

    }

    public static void conversions() {
        BRITPOUND = USD * 0.75;
        Bolivar = USD *  0.000000107684;
        Yen = USD * 0.00684422;
        won = USD *  0.000716695;
        euro = USD * 0.8890;
    }

    public static void getValues() {
        String USD_Convertions = String.format(
                "Currency Covertions:\n" +
                "amount in british pounds: %.2f\n" +
                "amount in Venezuelan Bolivares: %.10f\n" +
                "amount in Japanese Yen: %.2f\n" +
                "amount in South Korean Won: %.2f\n" +
                "amount in European Union Euros: %.2f\n",
                BRITPOUND, Bolivar, Yen, won, euro
        );
        JOptionPane.showMessageDialog(null, USD_Convertions);
    }
}

