import java.util.Scanner;

public class RoughWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter exam score (-1 to stop): ");
            int exam = scanner.nextInt();
            if (exam == -1) break; 

            System.out.print("Enter assessment score: ");
            int assessment = scanner.nextInt();

            System.out.print("Enter fee paid (100 required for certificate): ");
            int fee = scanner.nextInt();

            int total = exam + assessment;
            boolean passedExam = exam >= 25;
            boolean passedAssessment = assessment >= 15;
            boolean condoned = total <= 39;
            boolean fullFeePaid = fee == 100;
            boolean failedBoth = !passedExam && !passedAssessment;

            int status;
            if (passedExam && passedAssessment) status = 1; 
            else if (condoned) status = 2; 
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
                        System.out.println("Student has failed both components and must repeat.");
                    } else {
                        if (!passedExam) System.out.println("Failed Exam.");
                        if (!passedAssessment) System.out.println("Failed Assessment.");
                    }
                    break;
            }

            char grade;
            switch (total / 10) {
                case 10, 9, 8 -> grade = 'A';
                case 7 -> grade = 'B';
                case 6 -> grade = 'C';
                case 5 -> grade = 'D';
                default -> grade = 'F';
            }
            System.out.println("Grade: " + grade);

            if (status != 3 && fullFeePaid) {
                System.out.println("Certificate Issued.");
            } else if (!fullFeePaid) {
                System.out.println("Certificate NOT Issued (Fee Not Paid / Free Not fully Paid).");
            }

            System.out.println("--------------------------");
        }

        scanner.close();
    }
}
