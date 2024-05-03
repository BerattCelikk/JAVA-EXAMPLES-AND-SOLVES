//  CODE THE PROGRAM THAT FINDS AND DISPLAYS THE MODE OF AN ARRAY.
import java.util.Scanner;
public class Modeofarray{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter length of the array:");
        int len=get.nextInt();
        int array[]=new int[len];
        for(int i=0;i<len;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        int counter=0;
        int number=0;
        int max=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(array[i]==array[j]){
                    counter++;
                }
            }
            if(max<counter){
                max=counter;
                number=array[i];
            }
            counter=0;
        }
        System.out.printf("%d number is mode of array and %d times repeated.",number,max);
    }
}