// WRITE THE CODE OF PASCAL TRIANGLE WITH N (LENGTH = N)


import java.util.Scanner;
public class PascalTriangle{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter length of the pascal triangle :");
        int N=get.nextInt();
        int array[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    array[i][j]=1;
                }else{
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }
    }
}
