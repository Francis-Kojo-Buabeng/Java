import java.text.NumberFormat;
public class NumberFormats {
    public static void main(String[] args) {

    //NumberFormat is an abstract therefore cannot be instantiated

    NumberFormat currency =  NumberFormat.getCurrencyInstance(); // call a factory method
    double number = 32434.23;
    String result = currency.format(number);
    System.out.println(result);

    NumberFormat percent = NumberFormat.getPercentInstance();
    String output = percent.format(0.09);
    System.out.println(output);

    //short syntax
    String question = NumberFormat.getPercentInstance().format(0.008);
    System.out.print(question);

    }
}