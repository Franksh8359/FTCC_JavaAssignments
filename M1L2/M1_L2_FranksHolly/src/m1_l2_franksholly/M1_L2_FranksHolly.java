/**
* Here is lab 2 from module 1 (Time Calculator) using NetBeans!
* 8-23-2017
* CSC 251 Lab 2 - Time Calculator
* @author Holly Franks
*/
package m1_l2_franksholly;
import javax.swing.JOptionPane;

public class M1_L2_FranksHolly {

    public static void main(String[] args) {

        String input;
        String timeString;
        double seconds;
        double outputTime;
        
        input = JOptionPane.showInputDialog("How many seconds?");
        seconds = Double.parseDouble(input);
        
        if (seconds >= 60 && seconds < 3600)
        {outputTime = seconds / 60;
        timeString = "minutes";
        }
        else if (seconds >= 3600 && seconds < 86400)
        {outputTime = seconds / 3600;
        timeString = "hours";
        }
        else if (seconds >= 86400)
        {outputTime = seconds / 86400;
        timeString = "days";
        }
        else
        {outputTime = seconds;
         timeString = "seconds";}
   
        JOptionPane.showMessageDialog(null, "There are " + 
                        String.format("%,.3f", outputTime) + " " +
                        timeString + " in " + seconds + " seconds.");
        
        System.exit(0);           
    }  
}
