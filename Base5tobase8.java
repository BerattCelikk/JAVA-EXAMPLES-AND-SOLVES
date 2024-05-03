//  PROGRAM THAT CONVERTING BASE-5 SYSTEM NUMBERS TO BASE-8 SYSTEM.


import java.util.Scanner;
public class Base5tobase8{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number in base-5 system:");
        int base5=get.nextInt();
        int temp=base5,counter=0,base10=0;
        
        while (temp != 0){
            temp/=10;
            counter++;
        } 
        for(int i=0;i<counter;i++){
            temp=base5;
            for(int j=0;j<i;j++){
                temp/=10;
            }
            int exponential=1;
            for(int k=0;k<i;k++){
                exponential=exponential*5;
            }
            base10=base10+exponential*(temp%10);
        }
        System.out.printf("this number in base-10 = %d",base10);
        
        counter=0;
        temp=base10;
        
        while(temp != 0){
            temp/=10;
            counter++;
        }
        temp=base10;
        System.out.println();
        System.out.print("this number in base-8 =");
        for(int i=counter;i>0;i--){
            for(int j=i;j>1;j--){
                temp=temp/8;
            }
            System.out.print(temp%8);
            temp=base10;
        }
    }
}