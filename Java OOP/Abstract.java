abstract class Car{
    public abstract void Drive();

    public void PlayMusic(){
        System.out.println("Playing Music");
    }
}

class Jeep extends Car{
    @Override
    public void Drive(){
        System.out.println("driving in Jeep");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Jeep obj = new Jeep();
        obj.Drive();
        obj.PlayMusic();
    }
    
}
