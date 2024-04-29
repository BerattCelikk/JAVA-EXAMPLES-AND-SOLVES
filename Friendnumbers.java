//PROGRAM THAT FINDS FRIEND NUMBERS (FRIEND NUMBERS =If two numbers are equal to the sum of their divisors excluding themselves, these numbers are called friend numbers.)

import java.util.Scanner;
public class Friendnumbers{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        int sum=0,number1=0;
        
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        
        for(int j=1;j<sum;j++){
            if(sum%j==0){
                number1+=j;
            }
        }
       
        if((number1==number) && (sum !=number)){
            System.out.printf("%d and %d are friend numbers",number,sum);
        }else{
            System.out.printf("%d is not have any friend numbers",number);
        }
        
    }
}
