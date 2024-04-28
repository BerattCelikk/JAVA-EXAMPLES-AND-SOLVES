//  a-)SORT FROM LARGEST TO SMALLEST
import java.util.Scanner;
public class Largesttosmallest{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int length=get.nextInt();
        int array[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        int temp;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){      //length-i-1 is more efficient than length-1 so we use that.
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.printf("%3d",array[i]);
        }
        
    }
}