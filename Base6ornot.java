//  PROGRAM THAT CHECK WHETHER BASE 6 IS OR NOT.
//  BASE 6 CAN USE ONLY [0,1,2,3,4,5] NUMBERS.

import java.util.Scanner;
public class Base6ornot{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        String number = get.nextLine();
        int isbase6=1;
        for(int i=0;i<number.length();i++){
            char c=number.charAt(i);
            
            if(!((c>='0') && (c<='5'))){
                isbase6=0;
                break;
            }
        }
        if(isbase6==1){
            System.out.println("this number is a base-6 system number.");
        }else{
            System.out.println("this number is not a base-6 system number.");
        }
        
    }
}