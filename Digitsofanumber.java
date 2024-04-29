//  PROGRAM THAT CALCULATES DIGITS OF A NUMBER.

import java.util.Scanner;
public class Digitsofanumber{
    public static void main (String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        int counter=0,temp=number;
        
        while (temp != 0){
            temp/=10;
            counter++;
        } 
        System.out.printf("total digits of %d is %d",number,counter);
    }
}