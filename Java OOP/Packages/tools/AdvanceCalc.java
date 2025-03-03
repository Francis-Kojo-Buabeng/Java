package tools;
public class AdvanceCalc extends SimpleCalc {
    public int mult(int x, int y){
        return x * y;
    }
    public int div(int x, int y){
        return x / y;
    }

    public double power(double  a, double b){
        double result = Math.pow(a, b);
        return result;
    }
}