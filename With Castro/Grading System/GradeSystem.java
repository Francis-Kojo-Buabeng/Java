
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        int examScore = 1;
        int assessment = 1;
        int fee =1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Exam Score: ");
        examScore = scanner.nextInt();

        System.out.print("Assessement: ");
        assessment = scanner.nextInt();

        System.out.print("fee: ");
        fee = scanner.nextInt();

        boolean passedExam= examScore>=25;
        boolean passedAssessment= assessment>=15;
        boolean feePaid = fee == 100;

        
        int totalScore = examScore + assessment;
        if (totalScore  == 39) {
            System.out.println("You've been condoned");
        }

        if (passedExam && passedAssessment && feePaid) {
            System.out.println("You've a certificate");
        }

        if (!passedExam && !passedAssessment){
            System.out.println("You've been repeated");
        }

        if (!passedExam) {
            System.out.println("You've failed the Exam");

        }else{
            System.out.println("You've passed the exam");
        }
        
        if (!passedAssessment) {
            System.out.println("You've failed the assessement");
        }else{
           System.out.println("You've passed the assessement"); 
        }

    }
}