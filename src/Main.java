import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students: "));

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter score for student " + (i + 1) + ": "));
        }

        int bestScore = findBestScore(scores);
        char[] grades = assignGrades(scores, bestScore);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " score: " + scores[i] + ", grade: " + grades[i]);
        }

//        scanner.close();
    }

    public static int findBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }

    public static char[] assignGrades(int[] scores, int bestScore) {
        char[] grades = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        return grades;
    }
}




