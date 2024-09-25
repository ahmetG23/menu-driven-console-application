
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
    public static void getUserChoice(){
        System.out.println("---Menu Options---");
        System.out.println("1. Find the minimum of the array :");
        System.out.println("2. Find the maximum of the array :");
        System.out.println("3. Find the average of the array :");
        System.out.println("4. Find the sum of elements with odd indexes :");
        System.out.println("5. Find the sum of elements with even indexes :");
        System.out.println("6. Exit ");
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
        int chc;
        Scanner choice = new Scanner(System.in);
        getUserChoice();
        chc = choice.nextInt();
        do{
            getUserChoice();
            chc = choice.nextInt();

        switch(chc) {
            
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
        }
    
        }while (chc != 6); 
            
        

        
        choice.close();
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
