//PROGRAM THAT FINDS PERMUTATION.(P(c,k)= c! / (c-k)! )

import java.util.Scanner;
public class Permutation{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter P(c,k) respectively:");
        int c=get.nextInt();
        int k=get.nextInt();
        int permutation=1,above=1,below=1;
        
        if(c<k){
            System.out.println("permutation = 0");
        }else{
            
            for(int i=1;i<=c;i++){
            above*=i;
            }
            
            for(int i=1;i<=(c-k);i++){
            below*=i;
            }
            
            permutation=above/below;
            System.out.printf("P(%d,%d) = %d",c,k,permutation);
        }
    }
}