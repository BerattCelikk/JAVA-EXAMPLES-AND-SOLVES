//  PROGRAM THAT FINDS LEAP YEARS.((LEAP YEAR % 4==0)  && (LEAP YEAR % 400 == 0) && (LEAP YEAR % 100 != 0))

import java.util.Scanner;
public class Findleapyear{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a year");
        int year=get.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d year is a leap year",year);
                }else{
                    System.out.printf("%d year is not a leap year",year);
                }
            }else{
                System.out.printf("%d year is a leap year",year);
            }
        }else{
            System.out.printf("%d year is not a leap year",year);
        }
    }
}