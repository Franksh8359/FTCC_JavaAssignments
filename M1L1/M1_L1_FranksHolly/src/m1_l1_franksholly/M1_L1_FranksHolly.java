/**
* Here is lab 1 from module 1 (Miles per Gallon) using NetBeans!
* 8-23-2017
* CSC 251 Lab 1 - Miles per Gallon
* @author Holly Franks
*/
package m1_l1_franksholly;
import javax.swing.JOptionPane;

public class M1_L1_FranksHolly {

    public static void main(String[] args) {

        String input;
        double miles, gallons, mpg;
        
        input = JOptionPane.showInputDialog("How many miles were driven?");
        miles = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("How many gallons of gas were used?");
        gallons = Double.parseDouble(input);
        
        mpg = miles / gallons;
              
        JOptionPane.showMessageDialog(null, "The car's miles-per-gallon was " + 
                                            String.format("%,.2f", mpg));
        
        System.exit(0);           
    }
    
}
