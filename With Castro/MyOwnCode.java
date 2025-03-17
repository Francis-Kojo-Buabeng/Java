import java.util.Arrays;
import java.util.Scanner;

public class MyOwnCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 18;
        int numbers [] = new int[size];
        System.out.println("Enter the first 19 numbers: ");

        int evenCount = 0; 
        int oddcount = 0;
        int oddArray [];
        int evenArray []; 
        
        //collecting user input numbers
        for(int i = 0; i < numbers.length; i++){
            int numb = scan.nextInt();
             numbers[i] = numb;
            if(numb % 2 == 0){
                evenCount ++;   
            }else{
                oddcount++;
            } 
        }
        evenArray = new int[evenCount];
        oddArray = new int[oddcount];
        int evenIndex = 0;
        int oddIndex = 0;

        //creating even and odd array
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenArray[evenIndex++] = numbers[i];
            }else{
                oddArray[oddIndex++] = numbers[i];
            }
        }

        int evenMatrix [][] = new int[3][3];
        int oddMatrix [][] = new int[3][3];
        int index = 0;

        //creating 3 by 3 matrix for even and odd numbers
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (index < evenArray.length){
                    evenMatrix[i][j] = evenArray[index];
                    oddMatrix[i][j] = oddArray[index];
                    index++;
                }else{
                    evenMatrix[i][j] = 0;
                    oddMatrix[i][j] = 0;
                }  
            }   
        }

        System.out.println();

        //Displaying 3 by 3 even matrix
        System.out.println("Even Matrix: ");
        for(int row[] : evenMatrix){
            for(int num : row){
                System.out.printf("%3d",num);
            }
            System.out.println();
        }

        System.out.println();

        //Displaying 3 by 3 odd matrix
        System.out.println("Odd Matrix: ");
        for(int row[] : oddMatrix){
            for(int num : row){
                System.out.printf("%3d",num);
            }
            System.out.println();
        }

        //computing Diagonal product of even Matrix
        int diagonalProductofEven = 1;
        for(int i = 0; i < 3; i++){
            diagonalProductofEven *= evenMatrix[i][i];
            }
        System.out.println("Diagonal Product of Even Matrix: "+diagonalProductofEven);
        
        System.out.println();

        //computing trail product of Even Matrix
        int trailProductOfEven = 1;
        for(int i = 0; i < 3; i++){
            trailProductOfEven *= evenMatrix[i][2-i];
        }
        System.out.println("Trail Product of even Matrix; "+ trailProductOfEven);

        System.out.println("Difference of Diagonal and Trail product: "+ (diagonalProductofEven - trailProductOfEven));

        //computing Diagonal product of Odd Matrix
        int diagonalProductOfOdd = 1;
        for(int i = 0; i < 3; i++){
            diagonalProductOfOdd *= oddMatrix[i][i];
            }
        System.out.println("Diagonal Product of Odd Matrix : "+diagonalProductOfOdd);
        
        System.out.println();

        //computing trail product of Odd Matrix
        int trailProductOfOdd = 1;
        for(int i = 0; i < 3; i++){
            diagonalProductOfOdd *= oddMatrix[i][2-i];
        }
        System.out.println("Trail Product of Odd Matrix; "+ trailProductOfOdd);

        System.out.println("Difference of Diagonal and Trail product: "+ (diagonalProductOfOdd - trailProductOfOdd));
        scan.close();
        
    }
}
