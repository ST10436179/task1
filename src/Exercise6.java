import java.util.Random;
public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] counts = new int[10]; // Array to store counts for numbers 0 to 9

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10); // Generate a random number between 0 and 9
            counts[number]++; // Increment the count for the generated number
        }

        // Display the counts for each number
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}



