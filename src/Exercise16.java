import java.util.Scanner;

public class Exercise16 {

    // Bubble sort method
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Test program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 double numbers:");

        // Read 10 double numbers from user input
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the numbers using bubble sort
        bubbleSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}