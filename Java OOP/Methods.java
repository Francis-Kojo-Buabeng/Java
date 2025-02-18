



class Calculator {
    public int add(int a, int b) { //Method
        return a + b;
    }

     public int add(int a, int b, int c) { //Method overloading is a method of the same name with different parameters
        return a + b + c;
    }
}


public class Methods {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //System.out.println(cal.add(4, 3));
        //System.out.println(cal.add(4, 3, 54));
        

        int numbers[][] = {
            {1, 2, 3, 22}, 
            {4, 5, 6, 42},
            {7, 8, 9, 12}
        };
        for (int n[] : numbers) {
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("For loop");

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}