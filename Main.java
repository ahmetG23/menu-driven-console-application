import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int[] numbers;   

    public static void populate() {
        Random rnd = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        numbers = new int[size];

        populate();

        in.close();
    }
}
