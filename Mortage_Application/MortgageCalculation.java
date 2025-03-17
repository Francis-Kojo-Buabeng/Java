import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculation {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthRate = 0;
        double numberOfPayment  = 0;


        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt(); 
            if(principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Enter amount greater than or equal to $1000 or less than or equal to $1000000");
        }
        
        while(true){
            System.out.print("Annual Interest Rate: ");
            float annualRate = (scanner.nextFloat());
            if (annualRate >= 10 && annualRate <= 30){
                monthRate = (annualRate / PERCENT / MONTHS_IN_YEAR);
                break;
            }
            System.out.println("Enter a rate greater than or equal to $10 or less than or equal to $30");
            
        }
       
        while (true){
            System.out.print("Period(Years): ");
            double years = scanner.nextDouble();
            if (years >= 1 && years <= 30) {
                numberOfPayment = (years * MONTHS_IN_YEAR);
                break;   
            }
            System.out.println("Years must be greater than or equals to 1 or less than of equals to 30");
            
        }

        double mortgage = principal * ( monthRate * (Math.pow((1 + monthRate), numberOfPayment) / 
        ((Math.pow((1 + monthRate), numberOfPayment)) - 1)) );

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formatedMortgage = currency.format(mortgage);

        System.out.println("Mortgage: "+ formatedMortgage);

        scanner.close();
    }
}