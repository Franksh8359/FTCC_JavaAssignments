/**
* This is Programming Problem 19 in Chapter 2. Here, I created a small program
*		that utilizes the JOptionPane to ask the user how many miles were
*		driven by a car and how many gallons were used. The program then
*		returns the miles per gallon.
* Date
* CSC 151 Tutorial 2 - Miles-per-Gallon Problem
* @author Holly Franks
*/

import javax.swing.JOptionPane;

public class StockTransaction
{
	public static void main(String[] args)
		{
			final String NAME = "Joe";
			final double SHARES_BOUGHT = 1000;
			final double BUY_PRICE = 32.87;
			final double BUY_COMM = .02;
			final double SHARES_SOLD = 1000;
			final double SALE_PRICE = 33.92;
			final double SALE_COMM = .02;
			double bought, totalBought, totalBuyComm;
			double sold, totalSold, totalSaleComm;
			double profit;

			//calcualte total stock bought
			bought = SHARES_BOUGHT * BUY_PRICE;
			//calculate total commission paid on purchase
			totalBuyComm = bought * BUY_COMM;
			//calculate purchase price minus the commission paid
			totalBought = bought - totalBuyComm;
			//calculate sale price
			sold = SHARES_SOLD * SALE_PRICE;
			//calcualte total commission paid on sale
			totalSaleComm = sold * SALE_COMM;
			//calculate sale price minus the commission paid
			totalSold = sold - totalSaleComm;
			//calculate profit
			profit = totalSold - totalBought;


			JOptionPane.showMessageDialog(null, "Statistics for "+NAME+"'s Stock Transaction:"
					+ "\n\nTotal Purchase: $"+bought
					+ "\nTotal Commission Paid on Purchase: $"+totalBuyComm
					+ "\nTotal Sales: $"+sold
					+ "\nTotal Commission Paid on Purchase: $"+totalSaleComm
					+ "\nProfits: $"+profit);

		}

}