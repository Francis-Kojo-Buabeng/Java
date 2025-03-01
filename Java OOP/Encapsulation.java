class Human{
    private int age;
    private String name;

    public int setAge(int a){
        return age = a;
    }

    public int getAge(){
        return age;
    }

    public String setName(String n){
        return name = n;
    }

    public String agName(){
        return name;
    }
}


public class Encapsulation { 
    public static void main(String[] args){
        Human obj = new Human();
       obj.setName("Francis");
       obj.setAge(43);
        
        System.out.println(obj.agName()+ " : "+ obj.getAge());
    }
}