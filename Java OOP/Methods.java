




class Students {
    String name;
    int mark;
    int rollno;

    static int age;

    public void Student(){
        System.out.println(name + " : " + mark+ " : "+rollno+ " : " +age);
    }
}




public class Methods {
    public static void main(String[] args) {
         Students s1 = new Students();
         s1.name = "Francis";
         s1.rollno = 3;
         s1.mark = 88;
       
        
        Students s2 = new Students();
        s2.name = "Alfred";
        s2.rollno = 4;
        s2.mark = 90;
        Students.age = 199;

        Students s3 = new Students();
        s3.name = "Christopher";
        s3.rollno = 5;
        s3.mark = 98;
 
        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        s1.Student();

        // for(Students stud : students){ // called for each loop
        //     System.out.println(stud.name);
        // }

        // StringBuffer first = new StringBuffer("Francis");
        // System.out.println(first.capacity());
    
        // first.append(" Buabeng"); 
        // System.out.println(first); 

       
    }

   
}


