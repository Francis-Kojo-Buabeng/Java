import java.awt.Point;
public class DataType {
    public static void main(String[] args) {
       
       //Primative DataTypes
        byte age = 33; // byte can store 1 byte 
        short monthNumber = 12; // short can stores 2 bytes
        int viewCounter = 243_233; // stores 4 bytes
        long deathRates = 4_323_234_323L; //stores 8 bytes of storage
        float volumeCircle = 20.3F; //Stores 4 bytes of storage
        double volumeEarth = 423_423.32; //Stores 8 bytes of storage
        char letter = 'A'; //1 byte
        boolean isJavaFun = true; //1 byte

        System.out.print(age);
        System.out.println(monthNumber);
        System.out.println(viewCounter);
        System.out.println(deathRates);
        System.out.println(volumeEarth);
        System.out.println(letter);
        System.out.println(volumeCircle);
        System.out.println(isJavaFun);

          //Reference Type

        Point point1 = new Point(1,3);
        Point point2 = point1;
        point1.x = 5;
        System.out.println(point1);
        System.out.println(point2);
        
       
    }
}