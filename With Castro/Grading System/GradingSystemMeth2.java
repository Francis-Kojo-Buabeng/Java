import java.util.Scanner;

public class GradingSystemMeth2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte EXAM_PASS_MARK = 25;
        final byte ASSESESEMENT_PASS_MARK = 15;
        final byte FULL_FEES = 100;
        System.out.print("Enter the total number of Students: ");
        byte totalNumberOfStudent = scanner.nextByte();

        int[] examScores = new int[totalNumberOfStudent];
        byte[] assessements = new byte[totalNumberOfStudent];
        int[] fees = new int[totalNumberOfStudent];
       

        for (byte i = 0; i < totalNumberOfStudent; i++) {
            System.out.print("Exam scores: ");
            examScores[i] = scanner.nextInt();
            
            System.out.print("Assessement scores: ");
            assessements[i] = scanner.nextByte();

            System.out.print("Amount of fees paid: ");
            fees[i] = scanner.nextInt();

            int totalScore = examScores[i] + assessements[i];
            System.out.println("");

            System.out.println("=========STATUS=============");
            
            if(examScores[i] < EXAM_PASS_MARK){
                System.out.println("Exam: Failed");
            }else{
               System.out.println("Exam: Passed"); 
            }

            if(assessements[i] < ASSESESEMENT_PASS_MARK){
                System.out.println("Assessement Test: Failed");
            }else{
               System.out.println("Assessement Test: Passed"); 
            }

            if (assessements[i] < ASSESESEMENT_PASS_MARK && examScores[i] < EXAM_PASS_MARK){
                System.out.println("You've been repeated");
            }

            if(fees[i] != FULL_FEES){
                System.out.println("Fees: Not Paid / Not fully Paid");
            }else{
                System.out.println("Fees: paid");
            }

            if(totalScore == 39){
                System.out.println("You've been condoned");
            }
            
            if(examScores[i] >= EXAM_PASS_MARK && assessements[i] >= ASSESESEMENT_PASS_MARK && fees[i] == FULL_FEES){
                System.out.println("You've been awarded a certificate");
            }else{
                System.out.println("You don't quality to hava a certificate");   
            }
            System.out.println("");
        }

    }
}