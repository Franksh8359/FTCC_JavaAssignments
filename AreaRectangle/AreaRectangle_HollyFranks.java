/**
* This is programming challenge 3 in chapter 5. Here, I finished coding a
		program that uses several methods to solve the area of a rectangle
		when given the length and width from the user. I went a little
		overboard and added a nice input validation of sorts. It was
		challenging, but I managed to pull it off with some thinking.
		There might be another, more reasonable way to accomplish what
		I was going for, but this was my solution!
* 4-18-2017
* CSC 151 Homework 5 - Rectangle Area - Complete the Program
* @author Holly Franks
*/

import javax.swing.JOptionPane;

public class AreaRectangle_HollyFranks
{
	public static double validateInput(String input)
	{
		double output;
		if (input == null) {System.exit(0);}
		try
		{
			output = Double.parseDouble(input);
			if (output <= 0) {output = 0;}
		}
		catch(Exception ex)
		{
			output = 0;
		}
		return output;
	}

	public static double getLength()
	{
		String input = JOptionPane.showInputDialog("What is the length of your rectangle?");
		double length = validateInput(input);
		while (length == 0)
		{
			input = JOptionPane.showInputDialog("Invalid input.\nWhat is the length of your rectangle?");
			length = validateInput(input);
		}
		return length;
	}

	public static double getWidth()
	{
		String input = JOptionPane.showInputDialog("What is the width of your rectangle?");
		double width = validateInput(input);
		while (width <= 0)
		{
			input = JOptionPane.showInputDialog("Invalid input.\nWhat is the width of your rectangle?");
			width = validateInput(input);
		}
		return width;
	}

	public static double getArea(double l, double w)
	{
		return l * w;
	}

	public static void displayData(double l, double w, double a)
	{
		JOptionPane.showMessageDialog(null, "The area of a rectangle with the dimensions:\n" + l + " x " + w +
										"\nhas an area of:\n" + a);
	}

	public static void main(String[] args)
	{
		double length, width, area;

		length = getLength();

		width = getWidth();

		area = getArea(length, width);

      	displayData(length, width, area);
	}

}