import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class exercise13 {


    public static void main(String[] args) {
        int[] list = new int[10];

        // Prompt the user to enter ten integers
        System.out.println("Enter ten integers:");

        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter digit: "+(i+1)));
        }

        // Eliminate duplicates and display the result
        int[] resultArray = eliminateDuplicates(list);
        System.out.print("The distinct integers are: ");
        for (int number : resultArray) {
            System.out.print(number + " ");
        }

    }

    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : list) {
            if (!resultList.contains(number)) {
                resultList.add(number);
            }
        }

        // Convert the result list back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }


}
