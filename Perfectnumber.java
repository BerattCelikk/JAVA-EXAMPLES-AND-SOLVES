//  PROGRAM THAT FINDS PERFECT NUMBERS (PERFECT NUMBERS = EX:6 => 6%1==0 , 6%2==0 , 6%3==0 AND 1+2+3=6 TILL 6.)

import java.util.Scanner;
public class Perfectnumber{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        int sum=0;
       
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        
        if(sum==number){
            System.out.printf("%d is a perfect number",number);
        }else{
            System.out.printf("%d is not a perfect number",number);
        }
    }
}