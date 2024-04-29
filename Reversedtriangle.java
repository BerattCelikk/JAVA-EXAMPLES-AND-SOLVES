//  PROGRAM THAT MAKES REVERSED TRIANGLE

import java.util.Scanner;
public class Reversedtriangle{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of reversed triangle:");
        int length = get.nextInt();
        
        for(int i=length;i>=1;i--){         //Only difference with normal triangle is 9. line code. You must write reverse of this line's code.
            for(int j=1;j<=length-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}