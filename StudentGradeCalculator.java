import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        // Input marks
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of Subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Validate input
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                System.out.print("Enter marks again: ");
                marks = sc.nextInt();
            }

            total = total + marks;
        }

        // Calculate average
        double average = (double) total / subjects;

        // Grade calculation
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display Result
        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Marks : " + total);
        System.out.println("Average Percentage : " + average + "%");
        System.out.println("Grade : " + grade);

        sc.close();
    }
}