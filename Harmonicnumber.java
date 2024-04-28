//PROGRAM THAT CALCULATE HARMONIK NUMBER UP TO N.(USER WILL ENTER THE N).

import java.util.Scanner;

public class Harmonicnumber {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = get.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("Harmonic number up to %d: %.2f", n, sum);
    }
}
