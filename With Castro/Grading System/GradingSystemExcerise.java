import java.util.Scanner;

public class GradingSystemExcerise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final byte EXAM_PASS_MARK = 25;
        final byte ASSESESEMENT_PASS_MARK = 15;
        final byte FULL_FEES = 100;

        while (true) {
            System.out.print("Enter exam score (-1 to stop): ");
            int examScores = scanner.nextInt();
            if (examScores == -1) break;
            

            System.out.print("Assessement scores: ");
            byte assessementScore = scanner.nextByte();

            System.out.print("Amount of fees paid: ");
            byte fees = scanner.nextByte();

            int totalScore = examScores + assessementScore;
            if(totalScore == 39){
                System.out.println("You've been condoned");
            }
            if(examScores >= EXAM_PASS_MARK && assessementScore >= ASSESESEMENT_PASS_MARK && fees == FULL_FEES){
                System.out.println("You've been awarded a certificate");
            }else{
                System.out.println("Fees: paid");
            }

              String result;

            
            if (examScores >= EXAM_PASS_MARK && assessementScore >= ASSESESEMENT_PASS_MARK) {
                result = "Passed";
            } else if (totalScore >= 39) {
                result = "Condoned";
            } else {
                result = "Failed";
            }

            
            switch (result) {
                case "Passed":
                    System.out.println("Student passed the exam.");
                    break;
                case "Condoned":
                    System.out.println("Student is condoned.");
                    break;
                case "Failed":
                    System.out.println("Student failed.");
                    break;
            }
        









        }

        //scanner.close();
    }
}


































            // int exam = scanner.nextInt();
            // if (exam == -1) break;

            // System.out.print("Enter assessment score: ");
            // int assessment = scanner.nextInt();

            // int total = exam + assessment;
            // String result;

            
            // if (exam >= 25 && assessment >= 15) {
            //     result = "Passed";
            // } else if (total >= 39) {
            //     result = "Condoned";
            // } else {
            //     result = "Failed";
            // }

            
            // switch (result) {
            //     case "Passed":
            //         System.out.println("Student passed the exam.");
            //         break;
            //     case "Condoned":
            //         System.out.println("Student is condoned.");
            //         break;
            //     case "Failed":
            //         System.out.println("Student failed.");
            //         break;
            // }
        
        

