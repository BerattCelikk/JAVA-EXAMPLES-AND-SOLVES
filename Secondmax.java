//PROGRAM THAT FINDS SECOND MAX NUMBER IN ARRAY.

import java.util.Scanner;
public class Secondmax{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of matrix:");
        int len=get.nextInt();
        int array[]=new int[len];
        System.out.println("enter a number:");
        array[0]=get.nextInt();
        int max = array[0];
        for(int i=1;i<len;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        int secondmax=0;
        for(int i=0;i<len;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        for(int i=0;i<len;i++){
            if((secondmax<array[i])&&(array[i]<max)){
                secondmax=array[i];
            }
        }
        
        System.out.printf("second max = %d",secondmax);
    }
}