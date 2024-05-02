 //USER WILL ENTER THE SIZE (N) OF THE MATRIX ON THE KEYBOARD.CODE THE PROGRAM THAT GENERATES A TWO DIMENSIONAL ARRAY[NxN] AND FILLS THE ARRAY WITH NUMBERS FROM 1 TO N2 IN SPIRAL ORDER.
 
 import java.util.Scanner;
 public class Spiralmatrix{
     public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of matrix:");
        int N=get.nextInt(),tour=0,i,j,number=1;
        int array[][]=new int[N][N];
        for(tour=0;tour<=N/2;tour++){
            for(i=tour,j=tour;j<N-tour;j++){
                array[i][j]=number++;
            }
            i++;j--;
            for( ;i<N-tour;i++){
                array[i][j]=number++;
            }
            i--;j--;
            for( ;j>=tour;j--){
                array[i][j]=number++;
            }
            i--;j++;
            for( ;i>tour;i--){
                array[i][j]=number++;
            }
        }
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                System.out.printf("%3d",array[i][j]);
            }
            System.out.println();
        }
     }
 }