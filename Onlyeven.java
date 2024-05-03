//  PROGRAM THAT FINDS ALL EVEN NUMBERS IN AN ARRAY AND SHOW SUM OF THESE EVEN NUMBERS.

import java.util.Scanner;
public class Onlyeven{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter  length of the array:");
        int number=get.nextInt();
        int array[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        int sum=0;
        for(int i=0;i<number;i++){
            if(i%2==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
    }
}