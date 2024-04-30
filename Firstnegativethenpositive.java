//CODE THE PROGRAM THAT DISPLAYS THE NEGATIVE INTEGERS OF AN ARRAY,AND THEN POSITIVE INTEGERS.  (For this code, we can think like smallest to highest )

/*import java.util.Scanner;
public class Firstnegativethenpositive{
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
            for(int j=0;j<length-i-1;j++){
                if(array[j]>array[j+1]){
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
}*/