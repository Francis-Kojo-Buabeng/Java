import java.util.Scanner;

public class EvenOddMatrix{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int ne =18;
        int [] sample = new int[ne];
        System.out.println("Type the first 19 numbers: ");

        int evencount = 0;
        int oddcount =0;
        


        for(int i=0;i<sample.length;i++){
            int num;

            num=scan.nextInt();
            sample[i]=num;


            
            if (num%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }

            int [] evennumbers = new int[evencount];
            int [] oddnumbers = new int[oddcount];


            int eindex = 0;
            int oindex = 0;

            for (int n : sample) {
                if(n%2==0){
                    evennumbers[oindex++] = n;
                }
                else{
                    oddnumbers[eindex++]=n;
                }
                
            }

            for (int o : evennumbers) {
                System.out.println(o);
            }
            for (int o : oddnumbers) {
                System.out.println(o);
            }

            // Convert even and odd numbers to 3×3 matrices
        int[][] evenMatrix = convertToMatrix(evennumbers);
        int[][] oddMatrix = convertToMatrix(oddnumbers);

        // Display results
        System.out.println("\nEven Numbers Matrix:");
        printMatrix(evenMatrix);
        System.out.println("Leading Diagonal Product: " + diagonalProduct(evenMatrix, true));
        // System.out.println("False Diagonal Product: " + diagonalProduct(evenMatrix, false));
        System.out.println("The difference of the product of the leading diagonal and the trailing diagonal elements: " + (diagonalProduct(evenMatrix, false) - diagonalProduct(evenMatrix, true)));

        System.out.println("\nOdd Numbers Matrix:");
        printMatrix(oddMatrix);
        System.out.println("Leading Diagonal Product: " + diagonalProduct(oddMatrix, true));
        // System.out.println("False Diagonal Product: " + diagonalProduct(oddMatrix, false));

        scan.close();


        System.out.println("The difference of the product of the leading diagonal and the trailing diagonal elements: " + (diagonalProduct(oddMatrix, false) - diagonalProduct(oddMatrix, true)));

        System.out.println("The difference of the product of the trailing diagonal odd numbers and the trailing diagonal even elements: " + (diagonalProduct(oddMatrix, false) - diagonalProduct(evenMatrix, false)));
    
        
}

// Convert a 1D array into a 3x3 matrix, filling missing spots with 0
public static int[][] convertToMatrix(int[] arr) {
    int[][] matrix = new int[3][3];
    int index = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (index < arr.length) {
                matrix[i][j] = arr[index++];
            } else {
                matrix[i][j] = 0; // Fill empty spots with 0
            }
        }
    }
    return matrix;
}

// Print a 3×3 matrix in a structured format
public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int num : row) {
            System.out.printf("%3d ", num);
        }
        System.out.println();
    }
}

public static int diagonalProduct(int[][] matrix, boolean isLeading) {
    int product = 1;
    for (int i = 0; i < 3; i++) {
        if (isLeading) {
            product *= matrix[i][i]; // Leading diagonal: (0,0), (1,1), (2,2)
        } else {
            product *= matrix[i][2 - i]; // False diagonal: (0,2), (1,1), (2,0)
        }
    }
    return product;
}
}