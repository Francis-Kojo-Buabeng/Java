
import java.text.NumberFormat;

class ParentClass{
    String name;
    int age;
    int price;

    public ParentClass(){
        name = "Francis";
        age = 33;
        price = 300;
    }
}

class ChildClass extends ParentClass{
    String model;
    int yearOfDate;
}

public class Inheritance {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.model = "Toyota";
        obj.age = 11;
        obj.yearOfDate = 2028;

        ParentClass objOfP = new ParentClass();
        objOfP.price = 30_000;

        NumberFormat formatNo = NumberFormat.getCurrencyInstance();
        String formatedPrice = formatNo.format(objOfP.price);

        System.out.println(NumberFormat.getCurrencyInstance().format(objOfP.price));

        System.out.println("name : "+obj.name+ "\nmodel : "+ obj.model+ "\nyear of manufacture : "+ obj.yearOfDate+ "\ncar age : "+ obj.age);
        System.out.println("price : "+ formatedPrice);
    }
}