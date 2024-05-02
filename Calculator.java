//CODE THE PROGRAM THAT DISPLAYS THE RESULT OF THE OPERATION ENTERED BY THE USER AT ONCE(+ => SUMMATION,- => SUBSTRACTION ...)

import java.util.Scanner;
public class Calculator{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter first number:");
        int number1=get.nextInt();
        System.out.println("enter second number:");
        int number2=get.nextInt();
        System.out.println("Choose an event:");
        System.out.println("Summation= +");
        System.out.println("Substraction= -");
        System.out.println("Division= /");
        System.out.println("Multiplication= *");
        
        char operation = get.next().charAt(0);    //get operation from user.
        int result=0;
        
        switch(operation){
            case '+' :
                result = number1 + number2;break;
            case '-' :
                result = number1 - number2;break;
            case '/' :
                if(number2==0){
                    System.out.println("Error: cannot be divided by zero.");break;
                }else{
                    result = number1 / number2;break;    
                }
            case '*' :
                result = number1 * number2;
        }
        System.out.printf("%2d %2c %2d = %2d",number1,operation,number2,result);
    }
}