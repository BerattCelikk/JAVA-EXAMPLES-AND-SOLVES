//  Programs that finds greatest common divisior(GCD) and least common multiple(LCM)    (WITH FUNCTIONS)

import java.util.Scanner;
public class Lcmandgcdwithfunctions{
    public static int Gcd(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        } 
        return a;
    }
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter first number:");
        int number1=get.nextInt();
        System.out.println("enter second number:");
        int number2=get.nextInt();
        int gcd1=Gcd(number1,number2);
        int lcm=(number1*number2)/gcd1;          // RULE= gcd*lcm=number1*number2
        System.out.printf("gcd = %d and lcm = %d" ,gcd1,lcm);
    }
}