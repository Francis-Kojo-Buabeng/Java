
import java.util.Scanner;

public class GradingSystemWithConditions {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        final byte Full_FEES = 100;
        final byte EXAM_PASS_MARK = 25;
        final byte ASSESSEMENT_PASS_MARK = 15;
        byte assessement = 0;

        int examScore =1;
        while(examScore > 0){
            
            
            while (true){
                System.out.print("-----(Enter -1 to exit the program)----\nEnter examScore: ");
                examScore = scanner.nextInt();
                if(examScore > 70){
                    System.out.println("Exam Score cannot be more the 70");
                }else break;
            }
            if(examScore == -1){
                break;
            }

            
            while(true){
                System.out.print("Enter Assessement score: ");
                assessement = scanner.nextByte();
                if(assessement > 30){
                    System.out.println("Assessement cannot be more than 30");
                }else break;
            }
            

            System.out.print("-----(Full Payment is exactly 100)-----\n Amount of fees: ");
            byte fees = scanner.nextByte();

            int totalScore = examScore + assessement;
            if(totalScore <= 100){
                  boolean feesPaid = fees == Full_FEES;
                boolean passedExam = examScore >= EXAM_PASS_MARK;
                boolean passedAssessement = assessement >= ASSESSEMENT_PASS_MARK;
                boolean condoned = totalScore <= 39;
                boolean failedBoth = !passedAssessement && !passedExam;
                System.out.println("");
                
                System.out.println("##########--STATUS--#########");
                int status;
                if(passedAssessement && passedExam) status = 1;
                else if(condoned) status = 2;
                else status = 3;


                switch (status) {
                    case 1:
                        System.out.println("Result: Passed");
                        break;

                    case 2:
                        System.out.println("Result: Condoned"); 
                        break; 
                    case 3:
                        System.out.println("Result: Failed");
                        if (failedBoth) {
                            System.out.println("Result: Repeated");
                        }else{
                            if(!passedAssessement)System.out.println("Assessement: Failed");
                            if(!passedExam)System.out.println("Exam: Failed");
                        }
                        break; 
                }

                char grade;
                if (totalScore / 10 >= 7) grade = 'A';
                else if (totalScore / 10 >= 6) grade = 'B';
                else if (totalScore / 10 >= 5) grade = 'C';
                else if (totalScore / 10 >= 4) grade = 'D';
                else grade = 'F';

                System.out.println("Total Score: " + totalScore);
                System.out.println("Grade: " + grade);

                if (feesPaid && passedAssessement && passedExam){
                    System.out.println("You are issued a certificate");
                }else if (!feesPaid){
                    System.out.println("Fee Not Fully Paid");
                }
            
                System.out.println("#######--END--#######");
                System.out.println();

            }else{
                    System.out.println("Total Score should not be more than 100");

            }
          
           
        }
        scanner.close();
    }
}