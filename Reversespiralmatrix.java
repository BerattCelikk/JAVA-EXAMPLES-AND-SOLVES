//USER WILL ENTER THE SIZE (N) OF THE MATRIX ON THE KEYBOARD.CODE THE PROGRAM THAT GENERATES A TWO DIMENSIONAL ARRAY[NxN] AND FILLS THE ARRAY WITH NUMBERS FROM 1 TO N2 IN REVERSE SPIRAL ORDER.
import java.util.Scanner;
public class Reversespiralmatrix {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int N = get.nextInt(); 
        int tour, i, j, number = 1;
        int array[][] = new int[N][N]; 

        int mid = N / 2;

        for (tour = 0; tour <= mid; tour++) {
            
            for (i = N - tour - 1, j = N - tour - 1; i > tour; i--) {
                array[i][j] = number++;
            }
            
            for (i = tour, j = N - tour - 1; j > tour; j--) {
                array[i][j] = number++;
            }
            
            for (i = tour, j = tour; i < N - tour - 1; i++) {
                array[i][j] = number++;
            }
            
            for (i = N - tour - 1, j = tour; j < N - tour - 1; j++) {
                array[i][j] = number++;
            }
        }

        if (N % 2 == 1) {
            array[mid][mid] = N*N;
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}