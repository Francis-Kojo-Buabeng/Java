
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name: ");
        String name = scanner.next().toUpperCase();

        System.out.println("Enter your Age: ");
        Byte age = scanner.nextByte();
        System.out.println(name+", you're "+age+" years old");
    }
}