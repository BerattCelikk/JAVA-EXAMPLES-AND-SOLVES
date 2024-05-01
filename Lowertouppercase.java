//  CODE THE PROGRAM THAT CONVERTS THE LOWERCASE CHARACTERS TO UPPERCASE CHARACTERS AND UPPERCASE CHARACTERS TO LOWERCASE CHARACTERS IN A CHAR ARRAY.
//  IF THE CHARACTER İS NOT A LETTER,İT İS NOT CHANGED.

import java.util.Scanner;
public class Lowertouppercase{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a text:");
        String text=get.nextLine();
        int len=text.length();
        for(int i=0;i<len;i++){
            char c=text.charAt(i);
            if((c>='A') && (c<='Z')){
                System.out.print(Character.toLowerCase(c));
            }else if((c>='a')&&(c<='z')){
                System.out.print(Character.toUpperCase(c));
            }else if (c == ' '){
                System.out.print(" ");
            }
            else{
                System.out.printf("%c is not a letter.",c);
                System.out.println();
            }
        }
    }
}