import javax.swing.*;
import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter Student: "));

        // Arrays to store names and scores
        String[] names = new String[numStudents];
        double[] scores = new double[numStudents];

        // Input student names and scores
        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Enter name for student " + (i+1) + ": ");
            names[i] = JOptionPane.showInputDialog("Enter Student Name: "+(i+1));
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter score for " + names[i] + ": "));
        }

        // Sort students based on scores
        sortStudents(names, scores);

        // Print students in decreasing order of scores
        System.out.println("\nStudents in decreasing order of scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%s: %.2f%n", names[i], scores[i]);
        }

    }

    public static void sortStudents(String[] names, double[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores
                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}