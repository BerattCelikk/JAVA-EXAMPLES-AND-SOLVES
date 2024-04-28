//  PROGRAM THAT FINDS THE NUMBER OF TOTAL WORDS IN A SENTENCE

import java.util.Scanner;
public class numberofwordsinsentence{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a sentence:");
        String sentence=get.nextLine();
        String words[]=sentence.split("\\s*,\\s*|\\s+");      //  \\s*,\\s* = this code split the words according to comma  , \\s+ = split the words according to space.
        int length=words.length;
        System.out.printf("this sentence include total %d words.",length);
    }
}