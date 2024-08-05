import java.util.Scanner;

public class Exercise12 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int gcd = gcd(numbers);
        System.out.println("The greatest common divisor is: " + gcd);

        input.close();

    }
    public static int gcd(int... numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = greatestCommonDivisor(gcd, numbers[i]);
        }
        return gcd;
    }

    private static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
