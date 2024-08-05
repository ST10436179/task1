import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10];
        int count = 0;

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < count; j++) {
                if (numbers[i] == distinctNumbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[count] = numbers[i];
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are:");

        for (int i = 0; i < count; i++) {
            System.out.print(" " + distinctNumbers[i]);
        }

        scanner.close();
    }
}

