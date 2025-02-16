
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Name nameObj = new Name();
        Age ageObj = new Age();
        System.out.println("Name: ");
        String nameUser = scanner.next();
        nameObj.name(nameUser);

        System.out.println("Age: ");
        byte ageUser = scanner.nextByte();
        ageObj.age(ageUser);

        System.out.println("You are "+ nameObj.name(nameUser) + ", and you are "+ ageObj.age(ageUser)+ " years old");

        SayHi();
        SayHi("NesoAcademy");
        Increment objs = new Increment();
        int w = 1;
        objs.increment(w);
        System.out.println("w: "+w);

        Output obj = new Output(); //object created for the class Output
        obj.myfunction();

        Addition add = new Addition();

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();
        int result = add.addition(x, y);
        System.out.println("x + y = "+result);

           
    }
    public static void SayHi(){
            System.out.println("Hi");
        }

    public static void SayHi(String name){
            System.out.println("Hi "+ name);
        }    
}

class Output{
         void myfunction(){ //Without the static key word , an object creation is required
            System.out.println("Hello, world!");
       }
    }


class Addition {
    int addition(int x, int y){
        return x + y;
    }
}


class Increment {
    int increment(int x){
        x++;
        System.out.println(x);
        return x;
    }
}

class Name {
    String name(String name){
        return name;
    }
}
class Age {
    byte age(byte age){
        return age;
    }
}