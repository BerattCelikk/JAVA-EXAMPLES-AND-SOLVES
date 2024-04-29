//  PROGRAM THAT FINDS FIBONACCI TILL N (USER WILL ENTER N)(WITHOUT FUNCTION)

import java.util.Scanner;
public class Fibonacci{
    public static void main (String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the length of Fibonacci:");
        int length=get.nextInt();
        int array[]=new int[length];
        array[0]=0;
        array[1]=1;
        System.out.println("FIBONACCI:");
        System.out.printf("%3d %3d",array[0],array[1]);
        for(int i=2;i<length;i++){
            array[i]=array[i-1]+array[i-2];
            System.out.printf("%3d",array[i]);
        }
    }
}