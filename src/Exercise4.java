import javax.swing.*;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        int[] scores = new int[100];
        int count = 0;
        int sum = 0;

        System.out.println("Enter scores (enter a negative number to end):");

        // Read scores until a negative number is entered or the maximum number of scores is reached
        while (true) {
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter scores (enter a negative number to end):"));
            if (score < 0) {
                break;
            }
            if (count < 100) {
                scores[count] = score;
                sum += score;
                count++;
            } else {
                System.out.println("Maximum number of scores (100) reached.");
                break;
            }
        }

        // Calculate the average score
        double average = (count > 0) ? (double) sum / count : 0;

        // Count how many scores are above or equal to the average and how many are below
        int aboveOrEqual = 0;
        int below = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Output the results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);

    }
}

