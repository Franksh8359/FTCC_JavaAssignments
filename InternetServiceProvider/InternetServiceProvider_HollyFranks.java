/**
* Here is programming problems 13 and 14 from Chapter 3. Here, I created
*		a program that calculates the user's ISP bill when given the
*		service pack and hours of use. The program is also designed to
*		inform the user if they could have saved money with a different
*		service pack. In order to do so, I had to experiment with if/else
*		codes. This one was a little tough!
* 2-26-2017
* CSC 151 Homework 3 - Internet Service Provider
* @author Holly Franks
*/

import javax.swing.JOptionPane;

public class InternetServiceProvider_HollyFranks
{
	public static void main(String[] args)
	{
		//variables for monthly charges for each pack
		final double A_CHARGE = 9.95;
		final double B_CHARGE = 13.95;
		final double C_CHARGE = 19.95;
		//variables for hours provided for each pack
		//C_HOURS (unlimited) declared in case it is later changed
		final double A_HOURS = 10.0;
		final double B_HOURS = 20.0;
		final double C_HOURS;
		//variables for additional hourly costs
		//C_OVERTIME_CHARGE (unlimited) declared in case it is later changed
		final double A_OVERTIME_CHARGE = 2.0;
		final double B_OVERTIME_CHARGE = 1.0;
		final double C_OVERTIME_CHARGE;

		//total charge that month (for each package and the user's)
		double aRate, bRate, cRate, monthCharge;
		String inputString;
		//turn input to char pack
		char pack;
		double hoursUsed;
		//hold the savings to compare
		double aSavings, bSavings, cSavings;


		inputString = JOptionPane.showInputDialog("Which service package did you have? (A, B, or C):");
		pack = inputString.charAt(0);
		inputString = JOptionPane.showInputDialog("How many hours of service were used?");
		hoursUsed = Double.parseDouble(inputString);


		//calculate package A rates with this information
		if (hoursUsed > A_HOURS)
			{aRate = ((hoursUsed - A_HOURS) * A_OVERTIME_CHARGE) + A_CHARGE;}
		else
			{aRate = A_CHARGE;}

		//calcualte package B rates
		if (hoursUsed > B_HOURS)
			{bRate = ((hoursUsed - B_HOURS) * B_OVERTIME_CHARGE) + B_CHARGE;}
		else
			{bRate = B_CHARGE;}

		//calculate package C rates
		cRate = C_CHARGE;


		//determine which pack and monthly charge based on user input
		if (pack == 'A' || pack == 'a')
			{monthCharge = aRate;}
		else if (pack == 'B' || pack == 'b')
			{monthCharge = bRate;}
		else
			{monthCharge = cRate;}

		//inform user of their month charge
		JOptionPane.showMessageDialog(null, "With service pack "+pack+":\nAt "+hoursUsed+
											" hours of usage, this month's bill is $" + String.format("%.2f", (monthCharge)) +
											".");

		//calculate potential savings on other packs
		aSavings = monthCharge - aRate;
		bSavings = monthCharge - bRate;
		cSavings = monthCharge - cRate;

		//determine if savings are possible, then inform the user if so
		if (monthCharge > aRate || monthCharge > bRate || monthCharge > cRate)
		{
			if ( monthCharge > aRate || monthCharge > bRate)
			{if (monthCharge > aRate)
				{JOptionPane.showMessageDialog(null, "NOTICE: You could have saved $" + String.format("%.2f", (aSavings)) +
															" this month with service pack A!");}
			 else
			 	{JOptionPane.showMessageDialog(null, "NOTICE: You could have saved $" + String.format("%.2f", (bSavings)) +
					 										" this month with service pack B!");}
			}
			else
			{JOptionPane.showMessageDialog(null, "NOTICE: You could have saved $" + String.format("%.2f", (cSavings)) +
					 										" this month with service pack C!");}
		}
		else
		{}
	}
}











