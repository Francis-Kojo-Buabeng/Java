import tools.*;
public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int result = obj.add(3, 2);
        int re = obj.sub(4, 4);
        int r1 = obj.div(4, 4);
        double pow = obj.power(6, 2);
        System.out.println("Add: "+result + "\nsub : "+ re + "\nPower: " + pow);
        System.out.println("div: "+ r1);
    }
}