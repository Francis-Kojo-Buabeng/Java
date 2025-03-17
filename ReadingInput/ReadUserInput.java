
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner instantiation
        System.out.print("What's your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your Age: ");
        Byte age = scanner.nextByte();
        System.out.println(name+", you're "+age+" years old");
        scanner.close();
    }
}