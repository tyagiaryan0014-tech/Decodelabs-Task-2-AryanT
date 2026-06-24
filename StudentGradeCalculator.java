import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT GRADE CALCULATOR         ");
        System.out.println("========================================\n");

        // Step 1: Take the number of subjects from the user
        System.out.print("Enter the total number of subjects: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number of subjects.");
            System.out.print("Enter the total number of subjects: ");
            scanner.next();
        }
        int totalSubjects = scanner.nextInt();

        // Edge case handling if user enters 0 or negative numbers
        if (totalSubjects <= 0) {
            System.out.println("❌ Invalid number of subjects. Exiting program.");
            scanner.close();
            return;
        }

        int[] marks = new int[totalSubjects];
        int totalMarks = 0;

        // Step 2: Take marks (out of 100) for each subject
        System.out.println("\nEnter marks obtained out of 100 for each subject:");
        for (int i = 0; i < totalSubjects; i++) {
            while (true) {
                System.out.print("Subject " + (i + 1) + ": ");
                
                if (scanner.hasNextInt()) {
                    int currentMark = scanner.nextInt();
                    // Validate marks are between 0 and 100
                    if (currentMark >= 0 && currentMark <= 100) {
                        marks[i] = currentMark;
                        totalMarks += currentMark;
                        break; // Valid input, break inner loop
                    } else {
                        System.out.println("❌ Marks must be between 0 and 100. Try again.");
                    }
                } else {
                    System.out.println("❌ Invalid input! Please enter an integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Step 3 & 4: Calculate Average Percentage & Assign Grade
        double averagePercentage = (double) totalMarks / totalSubjects;
        char grade;

        // Customary grading scale structure using conditional statements
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Step 5: Display Results Clearly
        System.out.println("\n========================================");
        System.out.println("             FINAL REPORT               ");
        System.out.println("========================================");
        System.out.println("Total Marks Obtained : " + totalMarks + " / " + (totalSubjects * 100));
        System.out.printf("Average Percentage   : %.2f%%\n", averagePercentage);
        System.out.println("Assigned Grade       : " + grade);
        System.out.println("========================================");

        scanner.close();
    }
}