//PROGRAM THAT FINDS MAX AND MIN IN ARRAY

import java.util.Scanner;
public class Maxandmin{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int length=get.nextInt();
        int array[]=new int[length];
        System.out.println("enter a number:");
        array[0]=get.nextInt();
        int max=array[0],min=array[0];
        for(int i=1;i<length;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        for(int i=0;i<length;i++){
            if(max<array[i]){
                max=array[i];
            }else if(min>array[i]){
                min=array[i];
            }
        }
        System.out.printf("max = %d and min = %d",max,min);
    }
}