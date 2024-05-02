// A PROGRAM THAT FINDS NUMBERS AND CHARACTERS EXCEPT LETTERS IN A GIVEN STRING.

import java.util.Scanner;

public class Findexceptletter {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = get.nextLine();
        
        char[] array = input.toCharArray();
        
        for (char c : array) {
            if (!Character.isLetter(c)) { 
                System.out.printf("%2c", c);
            }
        }
    }
}

