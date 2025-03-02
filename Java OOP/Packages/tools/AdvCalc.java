package tools;
public class AdvCalc extends Calc {
    public int mult(int x, int y){
        return x * y;
    }
    public int div(int x, int y){
        return x / y;
    }

    public double power(double  a, double b){
        double resutl = Math.pow(a, b);
        return resutl;
    }
}