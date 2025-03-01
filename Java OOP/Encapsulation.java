class Human{
    private int age;
    private String name;

    //constructor
    public Human(){ //default constructor
        age = 32;
        name = "Francis";
    }

    public Human(int age, String name){ //parameterized constructor
        this.age = age;                 //this keyword it's represent the object variable
        this.name = name;
    }

    //setter and getter methods
    public int setAge(int a){
        return age = a;
    }

    public int getAge(){
        return age;
    }

    public String setName(String n){
        return name = n;
    }

    public String getName(){
        return name;
    }
}


public class Encapsulation { 
    public static void main(String[] args){
        Human obj = new Human();
        Human obj1 = new Human(32, "Micheal");
       obj.setName("Francis");
       obj.setAge(43);
        
        System.out.println(obj.getName()+ " : "+ obj.getAge()+ " : "+ obj1.getName());
    }
}