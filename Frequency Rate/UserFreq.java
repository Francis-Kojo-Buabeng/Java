
import java.util.Scanner;

public class UserFreq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total numbers: ");
        int totalItem = scan.nextInt();

        int numbers[] = new int[totalItem];

        for (int i = 0; i < totalItem; i++) {
            System.out.print("Enter numbers: ");
            numbers[i] = scan.nextInt();
        }
        
        for (int i = 0; i < totalItem; i++) {
            if(numbers[i] == -1)continue;

                int count = 1;
            for(int j = i + 1; j < totalItem; j++){
                if(numbers[j] == numbers[i]){
                    count++;
                    numbers[j] = -1;
                }
            }
          

            System.out.println(numbers[i]+ " appears "+ count+ " times");
        }

        scan.close();
    }
}
