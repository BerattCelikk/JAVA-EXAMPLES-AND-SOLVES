//  CODE THE PROGRAM THAT CREATES A TWO-DIMENSIONAL BOOLEAN ARRAY ACCORDING TO THE VALUES OF THE ELEMENTS OF A TWO-DIMENSIONAL INTEGER ARRAY.IF THE NUMBER IN THE INTEGER ARRAY IS EVEN,"TRUE" IS ASSIGNED TO THE RELATED ELEMENT OF THE BOOLEAN ARRAY,OTHERWISE "FALSE" IS ASSIGNED TO THE RELATED ELEMENT OF THE BOOLEAN ARRAY.

import java.util.Scanner;
public class Booleanarray {
    public static void main(String[] args) {
        int integerArray[][] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        boolean booleanArray[][] = new boolean[1][10]; 
        
        for (int i = 0; i < 1; i++) { 
            for (int j = 0; j < 10; j++) {
                if (integerArray[i][j] % 2 == 0) {
                    booleanArray[i][j] = true;
                } else {
                    booleanArray[i][j] = false;
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(booleanArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
