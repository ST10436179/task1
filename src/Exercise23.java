import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("All combinations of two numbers:");
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
