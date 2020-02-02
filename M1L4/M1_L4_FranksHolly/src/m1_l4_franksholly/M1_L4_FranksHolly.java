/**
* Here is lab 4 from module 1 (Retail price Calculator) using NetBeans!
* 8-28-2017
* CSC 251 Lab 4 - Retail Price Calculator
* @author Holly Franks
*/
package m1_l4_franksholly;
import java.util.Scanner;

public class M1_L4_FranksHolly {
    
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the original price of the item?  ");
        double originalPrice = keyboard.nextDouble();
        System.out.print("What is the markup of the item? (as a decimal)  ");
        double markupPercentage = keyboard.nextDouble();
        
        double salePrice = GetRetailPrice(originalPrice, markupPercentage);
        System.out.printf("The retail price of the item is:  $%,.2f\n", salePrice);       
                   
    }
    
    public static double GetRetailPrice(double origPrice, double markup) 
    {
        double retailPrice = (origPrice * markup) + origPrice;
        return retailPrice;
    }
    
}
