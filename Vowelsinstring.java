//PROGRAM THAT FINDS VOWELS IN STRING.

import java.util.Scanner;
public class Vowelsinstring{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a text:");
        String text=get.nextLine();
        int length=text.length();
        String lowercasetext=text.toLowerCase();
        
        int vowel=0;
        
        for(int i=0;i<length;i++){
            char c=lowercasetext.charAt(i);
            
            if((c=='a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')){
                vowel++;
            }
        }
        System.out.printf("this text include total %d vowels",vowel);
    }
}