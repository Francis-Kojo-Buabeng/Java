
class Calc{
    public int add(int n1, int n2){ // This is a method
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    @Override
    public int add(int x, int y){ //This is a method overrider
       return (x + y) + 10;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int result = obj.add(5,5);
        System.out.println(result);
    }
}