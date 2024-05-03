/*

*
**
***
****

*/

//  PRINT THAT WITH USING FOR.

import java.util.Scanner;
public class Righttriangle{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of Right triangle:");
        int len=get.nextInt();
        for(int i=len;i>=1;i--){
            for(int j=i;j<=len;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}