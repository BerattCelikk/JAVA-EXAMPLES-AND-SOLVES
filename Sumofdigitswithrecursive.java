//WRITE A METHOD THAT FINDS THE SUM OF THE DIGITS OF THE ENTERED NUMBER.(WITH USING RECURSIVE FUNCTION).

import java.util.Scanner;
public class Sumofdigitswithrecursive{
    public static int sumdigit(int number){
        int sum=0;
        while (number != 0){
            int digit=number%10;
            sum+=digit;
            digit=0;
            number/=10;
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        System.out.printf("sum of digits of %d = %d",number,sumdigit(number));
    }
}