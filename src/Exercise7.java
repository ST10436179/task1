import javax.swing.*;

public class Exercise7 {


    public static void main(String[] args) {
        double[] values = new double[10];

        JOptionPane.showMessageDialog(null,"Enter ten double values:");
        for (int i = 0; i < 10; i++) {
            values[i] = Integer.parseInt(JOptionPane.showInputDialog("Value " + (i + 1) + ": "));
        }

        double avg = average(values);
        System.out.printf("The average of the values is: %.2f", avg);

    }
    public static int average(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        if (array.length == 0) return 0;
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
