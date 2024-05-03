// PROGRAM THAT DELETES REPEATING NUMBERS IN AN ARRAY.

import java.util.Scanner;

public class Deleterepeatingnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        
        int[] originalArray = new int[length];
        int[] uniqueArray = new int[length];
        int uniqueCounter = 0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCounter; j++) {
                if (originalArray[i] == uniqueArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[uniqueCounter] = originalArray[i];
                uniqueCounter++;
            }
        }
        
        System.out.println("Original Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array with repeating numbers removed:");
        for (int i = 0; i < uniqueCounter; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}


