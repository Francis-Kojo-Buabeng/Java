
import java.util.Scanner;
public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Total Numbers: ");
        byte totalNumber = scanner.nextByte();

        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("Number"+ i+": ");
            int userInput = scanner.nextInt();
            sum = sum + userInput;  
        }

        double average = sum / totalNumber;

        System.out.println("Average: "+ average);
    }
}