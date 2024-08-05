import java.util.Scanner;



public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101]; // Array to store counts for numbers 1 to 100

        System.out.println("Enter integers between 1 and 100 (enter 0 to end):");

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }
        }

        System.out.println("Occurrences of each number:");

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + (counts[i] > 1 ? " times" : " time"));
            }
        }

        scanner.close();
    }
}


