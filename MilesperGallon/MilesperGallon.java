/**
* This is Programming Problem 9 in Chapter 2. Here, I created a small program
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
			const String NAME = "Joe";
			const double SHARES_BOUGHT = 1000;
			const double BUY_PRICE = 32.87;
			const double BUY_COMM = .02;
			const double SHARES_SOLD = 1000;
			const double SELL_PRICE = 33.92;
			const double SELL_COMM = .02;
			double = bought, totalBought, totalBuyComm;
			double = sold, totalSold, totalSaleComm;
			double = profit;

			//calcualte total stock bought
			bought = SHARES_BOUGHT * BUY_PRICE;
			//calculate total commission paid on purchase
			totalBuyComm = bought * BUY_COMM
			//calculate purchase price minus the commission paid
			totalBought = bought - totalBuyComm;
			//calculate sale price
			sold = SHARES_SOLD * SELL_PRICE;
			//calcualte total commission paid on sale
			totalSaleComm = sold * SALE_COMM;
			//calculate sale price minus the commission paid
			totalSold = sold - totalSaleComm;
			//calculate profit
			profit = totalBought - totalSold;


			JOptionPane.showMessageDialog(null, "Statistics for "+NAME+"'s Stock Transaction:"
					+ "\nTotal Purchase: $"+bought
					+ "\nTotal Commission Paid on Purchase: $"+totalBuyComm
					+ "\nTotal Sales: $"+sold
					+ "\nTotal Commission Paid on Purchase: $"+totalSaleComm
					+ "\nProfits: $"+profit);

		}

}