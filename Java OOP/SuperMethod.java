class A{
    public A(){
        System.out.println("in A");
    }

    public A(int num){
        System.out.println("in A int");
    }
}

class B extends A{
    String name;
    public B(){
        super();  //Every constructor has super() by default
        System.out.println("in B");
        System.out.println(name);
    }
    public B(String num){
        this(); //Used to call all the constructor within which the this() belongs
        System.out.println("in B String");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B obj = new B("Test");
        String name = obj.name = "Francis";
        System.out.println(name);
    }
}