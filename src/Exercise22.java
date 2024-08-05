import javax.swing.*;

public class Exercise22 {
    public static void main(String[] args) {

        // Prompt the user to enter the first list
        System.out.println("Enter the number of elements in the first list followed by the elements:");
        int size1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements in the first \n list followed by the elements:"));
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number " + (i+1) ));
        }

        // Prompt the user to enter the second list
        System.out.println("Enter the number of elements in the second list followed by the elements:");
        int size2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements in the second \n list followed by the elements:"));
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number " + (i+1) ));
        }

        // Check if the lists are strictly identical
        boolean areIdentical = equals(list1, list2);

        // Display the result
        if (areIdentical) {
            System.out.println("The two lists are strictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}
