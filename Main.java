
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

    public static void displayDeviation() {
        double sum = ((double)(findSum("odd") + findSum("even")));
        double avg = sum / numbers.length;
        for(int i : numbers) {
            System.out.print((i - avg) + " ");
        }
        System.out.println();
    }

    public static void getUserChoice(){
        System.out.println("---Menu Options---");
        System.out.println("1. Find the minimum of the array :");
        System.out.println("2. Find the maximum of the array :");
        System.out.println("3. Find the average of the array :");
        System.out.println("4. Find the sum of elements with odd indexes :");
        System.out.println("5. Find the sum of elements with even indexes :");
        System.out.println("6. Exit ");
        System.out.print("Enter your choice: ");
    }
 

    public static int findSum(String choice) {

        int sum = 0;

        if (choice.equals("odd")) {
            for (int i = 1; i < numbers.length; i += 2) {
                sum += numbers[i];
            }
        } else {
            for (int i = 0; i < numbers.length; i += 2) {
                sum += numbers[i];
            }
        }
        return sum;

    }

    public static int findMinimum() {
        int minimum = numbers[0];
        for (int i : numbers) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }

    public static int findMaximum() {
        int maximum = numbers[0];
        for (int i : numbers) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int size = in.nextInt();
        numbers = new int[size];

        populate();
        int chc;

        System.out.print("The array is: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    
        do{
            getUserChoice();
            chc = in.nextInt();

        switch(chc) {
            
            case 1:
                System.out.println(findMinimum());
                break;
            case 2:
                System.out.println(findMaximum());
                break;
            case 3:
                displayDeviation();
                break;
            case 4:
                System.out.println(findSum("odd"));
                break;
            case 5:
                System.out.println(findSum("even"));
                break;
        }
    
        }while (chc != 6); 
            
        in.close();
    }    

}
