
import java.util.Scanner;

public class Bempah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Name: ");
        
        String name = scanner.nextLine();

        System.out.print("Age: ");
        byte age   = scanner.nextByte();
        
        if (age < 18){
            System.out.println("Permission not allowed");
        }else{
            System.out.println("Fuck you");
        }
        System.out.println("Welcome "+ name+ "\nyou are "+ age);
        */


        long factorial = 1L;
        System.out.print("Numbers: ");
        byte number = scanner.nextByte();
        for (int i = number; i > 0; i--) {
            factorial *= i;

        }
        System.out.println("factorial: "+ factorial);
    }
}