import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {

        // Prompt the user to enter a string
        String input = JOptionPane.showInputDialog("Enter a string to sort:");

        // Get the sorted string
        String sortedString = sort(input);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);

    }

    public static String sort(String s) {
        // Convert the string to a character array
        char[] characters = s.toCharArray();

        // Sort the character array
        Arrays.sort(characters);

        // Convert the sorted character array back to a string
        return new String(characters);
    }
}
