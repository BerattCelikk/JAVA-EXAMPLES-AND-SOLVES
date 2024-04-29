//  Programs that finds greatest common divisior(GCD) and least common multiple(LCM)    (WITHOUT FUNCTIONS)

import java.util.Scanner;
public class Lcmandgcd{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter first number:");
        
        int number1=get.nextInt();
        System.out.println("enter second number:");
        
        int number2=get.nextInt();
        int minimum=Math.min(number1,number2);
        int gcd=1;
        
        for(int i=1;i<=minimum;i++){
            
            if((number1%i==0) && (number2%i==0)){
                gcd=i;
            }
        }
        int lcm=(number1*number2)/ebob;                //  rule= gcd*lcm = number1*number2
        
        System.out.printf("gcd = %d and lcm = %d",gcd,lcm);
        
    }
}