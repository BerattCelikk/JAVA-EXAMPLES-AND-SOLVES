//CODE THE PROGRAM THAT FINDS THE COMMON VALUES OF TWO DIFFERENT ARRAYS AND DISPLAY THEM WITH THEIR SEQUENCE NUMBER IN THEIR OWN ARRAYS.

import java.util.Scanner;
public class Commonvaluesofarrays{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of arrays:");
        int length=get.nextInt();
        int array1[]=new int[length];
        int array2[]=new int[length];
        int common=0;
        for(int i=0;i<length;i++){
            System.out.println("enter a number for first array:");
            array1[i]=get.nextInt();
        }
        for(int i=0;i<length;i++){
            System.out.println("enter a number for second array:");
            array2[i]=get.nextInt();
        }
        System.out.println("COMMON VALUES:");
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(array1[i]==array2[j]){
                    common++;
                    System.out.println(array1[i]);
                }
            }
        }
        System.out.printf("total %d common values included in both arrays.",common);
        
    }
}