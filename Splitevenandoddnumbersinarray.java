//SPLIT EVEN AND ODD NUMBERS IN ARRAY.


import java.util.Scanner;
public class Splitevenandoddnumbersinarray{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter length of the array:");
        int length=get.nextInt();
        int array[]=new int[length];
        int odd[]=new int[length],even[]=new int[length],oddnumber=0,evennumber=0;
        for(int i=0;i<length;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
            if(array[i] % 2 == 0){
                even[evennumber]=array[i];
                evennumber++;
            }else{
                odd[oddnumber]=array[i];
                oddnumber++;
            }
            
        }
        System.out.println("ODD NUMBERS:");
        for(int i=0;i<oddnumber;i++){
            System.out.printf("%3d",odd[i]);
        }
        System.out.println();
        System.out.println("EVEN NUMBERS:");
        for(int i=0;i<evennumber;i++){
            System.out.printf("%3d",even[i]);
        }
    }
}