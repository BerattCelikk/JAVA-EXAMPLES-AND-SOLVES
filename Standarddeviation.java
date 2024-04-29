//  PROGRAM THAT FINDS STANDARD DEVIATION OF ARRAY.

import java.util.Scanner;
public class Standarddeviation{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int length=get.nextInt();
        int array[]=new int[length];
        int sum=0;
        for(int i=0;i<length;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
            sum+=array[i];
        }
        double avg=(double)sum/length;
        double upperside=0;
        for(int i=0;i<length;i++){
            upperside+=Math.pow((double)array[i]-avg,2);
        }
        double total=Math.sqrt(upperside/length-1);
        System.out.printf("Standard deviation of array = %f",total);
    }
}