import javax.swing.*;
import java.util.Scanner;


public class ReverseInt {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        JOptionPane.showMessageDialog(null,"Enter ten integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: " + (i+1) + " "));
        }

        System.out.println("The integers in reverse order are as follows:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}


