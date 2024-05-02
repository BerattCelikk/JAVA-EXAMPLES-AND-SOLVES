//WRITE A METHOD THAT CHECKS WHETHER THE ENTERED NUMBER IS BINARY OR NOT.
//BINARY = INCLUDES ONLY 1 AND 0.

import java.util.Scanner;
public class Findbinaryornot {
    public static boolean isBinary(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = get.nextInt();
        if (isBinary(number)) {
            System.out.printf("%d is a binary", number);
        } else {
            System.out.printf("%d is not a binary", number);
        }
    }
}
