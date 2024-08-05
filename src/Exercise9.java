import javax.swing.*;


public class Exercise9 {
    public static int indexOfSmallestElement(int[] array) {
        if (array.length == 0) {
            return -1; // Handle empty array case
        }

        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter digit: "+(i+1)));
        }

        int index = indexOfSmallestElement(numbers);
        System.out.println("The index of the smallest element is " + index);

    }
}
