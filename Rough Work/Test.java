
import java.util.Scanner;

class TrickIncrement {
    int number;
    public int result(int a){
        number = a++ + ++a;
        return number;
    }
}

class IncrementTrick extends TrickIncrement{
    int numb;
    public int reveal(int x){
        numb = ++x + x++;
        return numb;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IncrementTrick obj = new IncrementTrick();
        System.out.print("Enter a number to compute this operation ( a++ + ++a ): ");
        int a = scan.nextInt();
        int result = obj.result(a);
        System.out.println("||a++ + ++a|| = "+result);
        
        System.out.print("Enter a number to compute this operation ( ++a + a++ ) : ");
        int b = scan.nextInt();
        int solution = obj.reveal(b);
        System.out.println("|| ++a + a++ || = "+solution);
        
        scan.close();
    }
}
