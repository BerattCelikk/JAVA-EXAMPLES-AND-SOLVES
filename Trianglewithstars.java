//  PROGRAM THAT MAKING TRIANGLE WITH STARS

import java.util.Scanner;
public class Trianglewithstars{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of triangle:");
        int length=get.nextInt();
        for(int i=1;i<=length;i++){
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