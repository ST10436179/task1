import java.util.Scanner;

public class Exercise10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] reversedNumbers = reverse(numbers);

        System.out.print("The reversed numbers are: ");
        for (int num : reversedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            result[i] = list[j];
        }
        return result;
    }
}
