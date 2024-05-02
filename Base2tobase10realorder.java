//DISPLAY THE BASE-2 SYSTEM EQUIVALENT OF A NUMBER ENTERED BY THE USER AS BASE-10 SYSTEM IN REAL ORDER.

import java.util.Scanner;
public class Base2tobase10realorder{
    public static void main (String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter a number in base-2 system:");
        int base2=get.nextInt();
        int counter=0,temp=base2,base10=0;
        
        while (temp != 0){
            temp /=10;
            counter++;
        } 
        
        for(int i=0;i<counter;i++){
            temp=base2;
            
            for(int j=0;j<i;j++){
                temp/=10;
            }
            
            int exponential=1;
            
            for(int k=0;k<i;k++){
                exponential=exponential*2;
            }
            base10=base10+exponential*(temp%10);
        }
        System.out.print("Your number in base-10 system ="+base10);
    }
}