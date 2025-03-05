
class Inner{
    public void show(){
        System.out.println("in show method");
    }

    class Outer {
        public void displayResult(){

            System.out.println("in B class"); 
        }
    }

    void createInstance() {
        Outer outer = new Outer();
        outer.displayResult();
    }


    }
    
    
    public class InnerClass {
        public static void main(String[] args) {
           Inner obj = new Inner();// object for the outer Class
           Inner.Outer obj1 = obj.new Outer(); // object fot the inner class

           obj.show();
           obj1.displayResult();
           obj.createInstance();
           
    }
}
