/**
* This is Lab 7 (BankAccount Class Copy Constructor) in module 2 for Chapter 8.
* 9-6-2017
* CSC 251 Lab 7 - BankAccount Class Copy Constructor
* @author Holly Franks
*/
package m2_l7_franksholly;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class M2_L7_FranksHolly {
    
    static DecimalFormat dollar = new DecimalFormat(".##");

    public static void main(String[] args) {
        
        String input;
        boolean valid = false;
        
        
        //issue: make program throw error when deposit is invalid
        try {
            while (valid == false) 
                {JOptionPane.showMessageDialog(null, "In order to create two accounts," +
                                            " the same amount must be deposited into each" +
                                            " account.");
                input = JOptionPane.showInputDialog("How much would you like to deposit to each" +
                                            " account?");   

                try {Double.parseDouble(input);} catch (Exception ex) {valid = false;}
                valid = true;
                }
            }
          
            BankAccount account1 = new BankAccount(input);
            BankAccount account2 = new BankAccount(account1);

            while (input != null)
            {
                input = showForm(account1, account2);
                input = input.toLowerCase();
                String[] tokens = input.split(" ");

                if (tokens.length == 3)
                {
                   if (tokens[0].equals("deposit")) 
                   {
                       if (tokens[2].equals("a")) {account1.deposit(tokens[1]);}
                       else if (tokens[2].equals("b")) {account2.deposit(tokens[1]);}
                       else {showErrorDialog();}
                   }
                   else if (tokens[0].equals("withdraw"))
                   {
                      if (tokens[2].equals("a")) {account1.withdraw(tokens[1]);}
                      else if (tokens[2].equals("b")) {account2.withdraw(tokens[1]);}
                      else {showErrorDialog();}
                   }
                   else {showErrorDialog();}
                }
                else {showErrorDialog();}
            }
        }
        catch (Exception e) {System.exit(0);}
    }
    
    public static String showForm(BankAccount account1, BankAccount account2)
    {
        return JOptionPane.showInputDialog("The balance in account A is $" 
                            + account1.getBalance() +
                            "\nThe balance in account B is $" 
                            + account2.getBalance() +
                            "\n\nWhat would you like to do? \n(Ex: Withdraw 200 A)");
    }
    
    public static void showErrorDialog()
    {
        JOptionPane.showMessageDialog(null, "Input is invalid. Try again."); 
    }
    
}
