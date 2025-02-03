
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Month Number: ");
        byte month = scanner.nextByte();

        switch (month) {
            case 1:
                System.out.println("On the Month: January");
                break;
            case 2:
                System.out.println("On the Month: February");
                break;
            case 3:
                System.out.println("On the Month: March");
                break;
            case 4:
                System.out.println("On the Month: April");
                break;
            case 5:
                System.out.println("On the Month: May");
                break;
            case 6:
                System.out.println("On the Month: June");
                break;
            case 7:
                System.out.println("On the Month: July");
                break;
            case 8:
                System.out.println("On the Month: August");
                break;
            case 9:
                System.out.println("On the Month: September");
                break;
            case 10:
                System.out.println("On the Month: October");
                break;
            case 11:
                System.out.println("On the Month: November");
                break;
            case 12:
                System.out.println("On the Month: December");
                break;
            default:
                System.out.println("Check your input Month Number");
        }

        scanner.close();
    }
}