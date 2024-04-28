//PROGRAM THAT WRITING NUMBERS IN TEXT


import java.util.Scanner;

public class Writingnumbersintext{
    public static void main (String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a four-digit number:");
        int number=get.nextInt();
        int thousand=number/1000;
        int hundred=(number/100)%10;
        int tens=(number/10)%10;
        int units=(number%10);
        
        String thousnd[]={" ","one thousand","two thousand","three thousand","four thousand","five thousand","six thousand","seven thousand","eight thousand","nine thousand"};
        String hundrd[]={" ","one hundred","two hundred","three hundred","four hundred","five hundred"," six hundred","seven hundred","eight hundred","nine hundred"};
        String tns[]={" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String unit[]={" ","one","two","three","four","five","six","seven","eight","nine"};
        
        System.out.printf("%s %s %s %s",thousnd[thousand],hundrd[hundred],tns[tens],unit[units]);
    }
}
