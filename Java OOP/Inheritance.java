
import java.text.NumberFormat;

class ParentClass{
    private String name;
    int age;
    int price;

    public ParentClass(){
        name = "Francis";
        age = 33;
        price = 300;
    }

    public String setName(String n){
        return name = n;
    }
    public String getName(){
        return name;
    }
}

class ChildClass extends ParentClass{ //Child class inherit the properties of the parent class with the keyword extends
    String model;
    int yearOfDate;
}

public class Inheritance {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.model = "Toyota";
        obj.age = 11;
        obj.yearOfDate = 2028;
        obj.setName("Micheal");

        ParentClass objOfP = new ParentClass();
        objOfP.price = 30_000;

        NumberFormat formatNo = NumberFormat.getCurrencyInstance();
        String formatedPrice = formatNo.format(objOfP.price);

        System.out.println("name : "+obj.getName()+ "\nmodel : "+ obj.model+ "\nyear of manufacture : "+ obj.yearOfDate+ "\ncar age : "+ obj.age);
        System.out.println("price : "+ formatedPrice);
    }
}