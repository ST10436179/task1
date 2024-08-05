import java.util.Random;

public class Exercise11 {
    public static int getRandom(int... numbers) {
        Random rand = new Random();
        int randomNum;

        do {
            randomNum = rand.nextInt(54) + 1; // Generate random number between 1 and 54
        } while (contains(numbers, randomNum)); // Check if the generated number is in the excluded list

        return randomNum;
    }

    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] excludedNumbers = {5, 12, 23, 34};
        int randomNum = getRandom(excludedNumbers);
        System.out.println("Random number: " + randomNum);
    }
}
