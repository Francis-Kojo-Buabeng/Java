
import java.util.Scanner;

public class Bempah {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long factorial = 1L;
            System.out.print("Numbers: ");
            byte number = scanner.nextByte();
            for (int i = number; i > 0; i--) {
                factorial *= i;
                
            }
            System.out.println("factorial: "+ factorial);
        }
    }
}