//WRITE A METHOD THAT CLEANS THE SAME ELEMENTS IN AN ARRAY.(WITHOUT REPETİTİON.)
//EX: 3 5 7 7 5 2 -> 3 5 7 2


/*import java.util.Scanner;

public class Withoutrepetition{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int len=get.nextInt();
        int array[]=new int[len];
        int isunique=0;
        int realar=0,delar=0;
        int realarray[]=new int[len],delarray[]=new int[len];
        
        for(int i=0;i<len;i++){
            System.out.println("enter a number:");
            array[i]=get.nextInt();
        }
        
        for(int i=0;i<len;i++){
            isunique=1;
            
            for(int j=0;j<realar;j++){
                if(array[i]==realarray[j]){
                    isunique=0;
                    break;
                }
            }
            
            if(isunique==1){
                realarray[realar]=array[i];
                realar++;
            } else {
                delarray[delar]=array[i];
                delar++;
            }
        }
        
        System.out.println("Deleted numbers:");
        for(int i=0;i<delar;i++){
            System.out.printf("%3d",delarray[i]);
        }
        
        System.out.println("Real array:");
        for(int i=0;i<realar;i++){
            System.out.printf("%3d",realarray[i]);
        }
    }
}*/
