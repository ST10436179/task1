import javax.swing.*;

public class Exercise8 {
    public static void main(String[] args) {
        double[] doubleArray = new double[10];

        // Prompt the user to enter ten double values
        JOptionPane.showMessageDialog(null,"Enter ten double values:");

        for (int i = 0; i < 10; i++) {
            doubleArray[i] = Double.valueOf(JOptionPane.showInputDialog("Enter Vaue: " + (1+i)));
        }

        // Find and display the minimum value
        double minValue = min(doubleArray);
        System.out.println("The minimum value is: " + minValue);

    }

    public static double min(double[] array) {
        double minValue = array[0];
        for (double value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
