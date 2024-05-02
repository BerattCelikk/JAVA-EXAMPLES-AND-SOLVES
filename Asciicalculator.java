//PROGRAM TO FIND THE ASCII VALUE OF A CHARACTER (ASCII = CONVERTING A CHARACTER TO AN INTEGER)

import java.util.Scanner;
public class Asciicalculator{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a character:");
        char character=get.next().charAt(0);
        int asciivalue=(int)character;
        System.out.printf("Ascii value of %c = %d",character,asciivalue);
    }
}