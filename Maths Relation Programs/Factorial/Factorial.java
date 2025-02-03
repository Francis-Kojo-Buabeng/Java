import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial = 1L;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        byte number = scanner.nextByte();
        scanner.close();

        if (number < 0) {
            System.out.println("Number can't be negative");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of the number " + number + " is: " + factorial);
        }
    }
}
