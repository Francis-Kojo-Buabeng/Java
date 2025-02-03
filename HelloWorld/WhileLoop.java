import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String guess = "";

        while(!guess.equals("QUIT") ){
            System.out.print("Guess a Word: ");
            guess = scanner.next().toUpperCase(); 
            System.out.println(guess);  
        }

        scanner.close();
    }
}