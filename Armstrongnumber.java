//  PROGRAM THAT FINDS ARMSTRONG NUMBERS(EX: 1^3+5^3+3^3=153)(digit x number of digits)

import java.util.Scanner;
public class Armstrongnumber{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        int counter=0,temp=number;
        while (temp != 0 ){
            temp/=10;
            counter++;
        } 
        int sum=0,digit;
        temp=number;
        for(int i=0;i<counter;i++){
            digit=temp%10;
            sum+=Math.pow(digit,counter);
            digit=0;
            temp/=10;
        }
        if(number == sum){
            System.out.printf("%d is an armstrong number",number);
        }else{
            System.out.printf("%d is not an armstrong number",number);
        }
    }
}