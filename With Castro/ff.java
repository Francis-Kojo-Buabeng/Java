import java.util.Scanner;

public class ff {
    public static void main(String[] agrs) {

        int[][] E = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for the 3 by 3 even matrix(1-20):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < E[i].length; j++) {
                    int even_values = scan.nextInt();
                    if (even_values % 2 == 0) {
                        E[i][j] = even_values;
                    } else
                        System.out.println("You have entered a odd number.Can you please enter an even number");
                }
            }
        System.out.println("The Even matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Re-enter the value:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (E[i][j] == 0) {
                    int even_value = scan.nextInt();
                    E[i][j] = even_value;
                }
            }
        }
        System.out.println("The new matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }

        int[][] O = new int[3][3];
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the values of the odd matrix here (1-20):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < O[i].length; j++) {
                int odd_values = get.nextInt();
                if (odd_values % 2 == 1) {
                    O[i][j] = odd_values;
                } else
                    System.out.println("You just enter an even number please re-enter an odd value");
            }
        }System.out.println("The Odd matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(O[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Re-enter the value:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (O[i][j] == 0) {
                    int odd_value = scan.nextInt();
                    O[i][j] = odd_value;
                }
            }
        }
        System.out.println("The new matrix is:");
        for (int i=0 ;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(O[i][j]+" ");
            }
            System.out.println();
        }
        int leading_evenProduct=1;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (i==j){
                    leading_evenProduct=leading_evenProduct*E[i][j];
                }
            }
        }
        int Trail_evenProduct=1;
        Trail_evenProduct=E[0][2]*E[1][1]*E[2][0]*Trail_evenProduct;

        int Even_Difference=leading_evenProduct-Trail_evenProduct;

        System.out.println("The leading diagonal product of the even matrix is "+ leading_evenProduct);
        System.out.println("The trailing diagonal of the even matrix is "+ Trail_evenProduct);
        System.out.println("The difference between the leading diagonal and the trailing diagonal of the even matrix is "+Even_Difference);

        int leading_oddProduct=1;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (i==j){
                    leading_oddProduct=leading_oddProduct*O[i][j];
                }
            }
        }
        int Trail_oddProduct=1;
        Trail_oddProduct=E[0][2]*E[1][1]*E[2][0]*Trail_oddProduct;

        int Odd_Difference=leading_oddProduct-Trail_oddProduct;

        System.out.println("The leading diagonal product of the odd matrix is "+ leading_oddProduct);
        System.out.println("The trailing diagonal of the odd matrix is "+ Trail_oddProduct);
        System.out.println("The difference between the leading diagonal and the trailing diagonal of the odd matrix is "+Odd_Difference);

        int Difference=Trail_oddProduct-Trail_evenProduct;
        System.out.println("The difference between the two trailing diagonal of both matrix is"+ Difference);

        scan.close();

    }
}