public class Try {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.println("Even Numbers: "+ i);
            }
        }
        System.out.println("\n");

        for (int k = 0; k <= 20; k++) {
            if (k % 2 == 1){
                System.out.println("Odd Numbers: "+ k);
            }
        }

        System.out.println("");

        for (int j = 0; j < 7; j+=2) {

            System.out.println("Result: "+ ++j); 
        }

        System.out.println("");
        for (int m = 0; m < 5; m++) {

            System.out.println("outcome: "+ m++); 
        }
        
    }

       

     
}