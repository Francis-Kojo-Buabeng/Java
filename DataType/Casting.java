public class Casting{
    public static void main(String[] args) {
        //implicit casting or automatic casting

        double number1 = 5.2;
        double number2 = number1 + 5;
        System.out.println(number2);

        //Explicit Casting or manual casting
        double x = 3.1;
        int y = (int)x + 5;
        System.out.println("Explicit cast of x to give us withou the decimal value: "+ y);

        //String casting
        String numb = "2";
        int strToInt = Integer.parseInt(numb) + 8;
        System.out.println(strToInt);


    }
}