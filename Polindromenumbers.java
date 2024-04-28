//  PROGRAM THAT FINDS POLINDROME NUMBERS (EX: 14641 , 1001 , 32123) (remains same when its digits are reversed.)

import java.util.Scanner;
public class Polindromenumbers{
    public static void main (String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter a number:");
        int number=get.nextInt();
        int digit,temp=number,counter=0,reversednumber=0;
        while(temp!=0){
            temp/=10;
            counter++;
        }
        temp=number;
        for(int i=0;i<counter;i++){
            digit=temp%10;
            reversednumber=(reversednumber*10)+digit;
            digit=0;
            temp/=10;
        }
        if(number == reversednumber){
            System.out.printf("%d number is a polindrome number",number);
        }else{
            System.out.printf("%d number is not a polindrome number",number);
        }
    }
}