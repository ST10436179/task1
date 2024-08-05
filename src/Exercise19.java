public class Exercise19 {
    public static void main(String[] args) {
        // Initialize an array of 100 lockers, all set to false (closed)
        boolean[] lockers = new boolean[100];

        // Simulate each student passing through the lockers
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; // Change the state of the locker
            }
        }

        // Display all open locker numbers
        System.out.print("Open lockers: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
