
import java.util.Arrays;
public class ArrayValue{
    public static void main(String[] args){

                //Method 1    
    int arrayMethod1 [] = new int[5]; //Array declearation

    //array initialization
    arrayMethod1[0] = 3;
    arrayMethod1[1] = 8;
    arrayMethod1[3] = 4;
    
    System.out.println(Arrays.toString(arrayMethod1));


    //Method 2
    int arrayMethod2 [] = {2, 5, 2, 5};
    System.out.println(Arrays.toString(arrayMethod2));

    //Method 3
    int arrayMethod3 [][] = new int[3][2];
    arrayMethod3[0][0] = 3;
    arrayMethod3[1][1] = 10;
    System.out.println(Arrays.deepToString(arrayMethod3));

    //Method 4
    //Two dimensional array
    int numbers[][] = {{1, 2, 4}, { 5, 6, 7}};
    System.out.println(Arrays.deepToString(numbers));

    //array sample code
    System.out.println();
     int Numbers[][] = {
            {1, 2, 3, 22}, 
            {4, 5, 6, 42},
            {7, 8, 9, 12}
        };
        for (int n[] : Numbers) {
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("For loop");

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Numbers[i][j] + " ");
            }
            System.out.println();
        }
         
    }
}