//FIND FIBONACCI WITH USING RECURSIVE FUNCTION.

import java.util.Scanner;
public class Fibonaccirecursive{
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of fibonacci:");
        int len=get.nextInt();
        for(int i=0;i<len;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}




























