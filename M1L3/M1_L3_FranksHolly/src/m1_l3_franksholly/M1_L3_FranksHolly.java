/**
* Here is lab 3 from module 1 (Pennies for Pay) using NetBeans!
* 8-23-2017
* CSC 251 Lab 3 - Pennies for Pay
* @author Holly Franks
*/
package m1_l3_franksholly;
import java.util.Scanner;

public class M1_L3_FranksHolly {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int day;
        double pay = .01, totalPay = 0, count = 0;
        
        System.out.print("How many days did you work?  ");
        day = keyboard.nextInt();
            
        while (day < 1)
        {
            System.out.print("You must work at least 1 day.\n"
                    + "\n\nHow many days did you work?  ");
            day = keyboard.nextInt();
        }
        
        System.out.print("\nDAY\t\t\tSALARY");
        
        while (count < day)
        {
            count += 1;
            System.out.printf("\n%,.0f\t\t\t$%,.2f", count, pay);
            totalPay += pay;
            pay = pay * 2;
        }
        System.out.print("\n--------------------------------\n");
        System.out.printf("TOTAL\t\t\t$%,.2f\n", totalPay);
                  
    }
    
}
