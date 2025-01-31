import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculation {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = (scanner.nextFloat());
        float monthRate = (annualRate / PERCENT / MONTHS_IN_YEAR);
    
        System.out.print("Period(Years): ");
        double year = scanner.nextDouble();
        double numberOfPayment = (year * MONTHS_IN_YEAR);

        double mortgage = principal * ( monthRate * (Math.pow((1 + monthRate), numberOfPayment) / 
        ((Math.pow((1 + monthRate), numberOfPayment)) - 1)) );

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formatedMortgage = currency.format(mortgage);

        System.out.println("Mortgage: "+ formatedMortgage);
        
      

    }
}