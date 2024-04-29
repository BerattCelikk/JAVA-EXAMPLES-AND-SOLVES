//  PROGRAM THAT PRINTS A STRING REVERSE. (Hello world =>world Hello)

import java.util.Scanner;
public class Reversestring{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        
        System.out.println("enter a text");
        
        String text=get.nextLine();
        
        String words[]=text.split("\\s*,\\s*|\\s+"); //  \\s*,\\s* = this code split the words according to comma  , \\s+ = split the words according to space.
        
        int length1=words.length;
        
        String reversedwords[]=new String[length1];
        
        for(int i=0;i<length1;i++){
            reversedwords[i]=words[length1-i-1];
        }
        
        for(int i=0;i<length1;i++){
            System.out.print(reversedwords[i]+" ");
        }
    }
}