/* 11- Code the program that takes the numbers from the user and saves them to an array. Then,
the user will input numbers one by one until the user wants to stop the program. The
program gets the numbers, finds them in the array and moves them to the end of the array
one by one.*/





import java.util.Scanner;

public class FindAndMoveTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int len = scanner.nextInt();
        int array[] = new int[len];

        System.out.println("Enter the numbers to fill the array:");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Your array:");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter a number to move to the end of the array:");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < len; i++) {
            if (array[i] == number) {
                found = true;

                for (int j = i; j < len - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

                break;
            }
        }

        if (found) {
            System.out.println("Number moved to the end of the array:");
            for (int i = 0; i < len; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
