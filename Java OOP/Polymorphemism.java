// Polymorphemism -> Poly means many and Morphemism - forms

class Computer {
    public void show(){
        System.out.println("in computer");
    }
}

class Laptop extends Computer{
    @Override
    public void show(){
        System.out.println("in Laptop");
    }
}

class Phone extends Computer{
     @Override
    public void show(){
        System.out.println("in Phone");
    }
}
class HomeAppliance extends Computer{
     @Override
    public void show(){
        System.out.println("in Home appliances");
    }
}

public class Polymorphemism {
    public static void main(String[] args) {
        Computer obj = new Laptop();
        obj.show();

        obj = new Phone();
        obj.show();

        obj = new HomeAppliance();
        obj.show();

        obj = new Computer();
        obj.show();
    }
}