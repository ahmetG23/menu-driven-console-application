
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int[] numbers;

    public static void populate() {
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100) + 1;
        }
    }

    public static int findSum(int[] arr, String choice) {

        int sum = 0;

        if (choice.equals("odd")) {
            for (int i = 1; i < 100; i += 2) {
                sum += arr[i];
            }
        } else {
            for (int i = 0; i < 100; i += 2) {
                sum += arr[i];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        numbers = new int[size];

        populate();

        in.close();
    }

    private int findMinimum() {
        int minimum = numbers[0];
        for (int i : numbers) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }

    private int findMaximum() {
        int maximum = numbers[0];
        for (int i : numbers) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

}
