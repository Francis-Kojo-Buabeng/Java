public class IncrementAndDecrement {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = number1++;
        System.out.println(number1);
        System.out.println(number2);

        int number3 = 10;
        int number4 = ++number3;
        System.out.println(number3);
        System.out.println(number4);
    }
}