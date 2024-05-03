//  CODE THE PROGRAM THAT FINDS AND DISPLAYS THE TWIN PRIMES OF AN ARRAY.
//  TWIN PRIME NUMBER => THEY ARE PRIME NUMBERS WITH 2 DIFFERENCES BETWEEN THEM
//  EX => 41 43 OR 17 19

import java.util.Scanner;

public class Twinprimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        int twinPrime = number + 2;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (isPrime(twinPrime)) {
                System.out.printf("%d's twin prime is %d\n", number, twinPrime);
            } else {
                twinPrime = number - 2;
                if (isPrime(twinPrime)) {
                    System.out.printf("%d's twin prime is %d\n", number, twinPrime);
                } else {
                    System.out.println(number + " does not have a twin prime.");
                }
            }
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
