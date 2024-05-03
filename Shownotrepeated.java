/* 10- Array [ ][ ] has random numbers, which are repetitive excluding only one number. Find
and display the one number which is not repeated in the array. 

    int arraylong[10][10] = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        {81, 82, 83, 84, 85, 86, 87, 88, 89, 100},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 90}};
*/

import java.util.Scanner;
public class Shownotrepeated{
    public static void main (String[] args) {
        int arraylong[][] = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        {81, 82, 83, 84, 85, 86, 87, 88, 89, 100},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 90}};
        
        int repeatingnumber=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                repeatingnumber=0;
                for(int k=0;k<10;k++){
                    for(int l=0;l<10;l++){
                        if(arraylong[i][j]==arraylong[k][l]){
                            repeatingnumber++;
                        }
                    }
                }
            if(repeatingnumber==1){
                System.out.printf("%3d",arraylong[i][j]);
                break;
                }
            }
            if(repeatingnumber==1){
            break;
        }
        }
        
    }
}













