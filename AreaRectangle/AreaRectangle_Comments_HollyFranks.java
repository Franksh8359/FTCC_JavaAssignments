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

//import the JOptionPane tool

//create main class

//create input validation method (accepts input string as argument, returns double)
//			the purpose of this method is to validate input, if its bad just return 0
//create output variable
//if the input is null (if user hits Cancel or exit buttons), terminate program
//try this...
//
//parse the input and store it in output
//if the output is less than or equal to 0, the output made 0
//
//catch any exception (so if input throws an error on conversion to double...)
//
//make output 0
//
//return the output
//

//create method getLength
//
//input is what the user enters when asked for length
//length will become whatever validateInput returns when passed input
//while the length is 0 (remember validate will always be the valid input or 0 otherwise)
//
//ask the user for length again
//try to validate it again and store in length
//
//(so when the loop is finally terminated) return length value to method call
//

//create method getWidth
//
//input is what the user enters when asked for width
//width will become whatever validateInput returns when passed input
//while the width is 0
//
//ask the user for width again
//try to validate it again and store in width
//
//(so when the loop is finally terminated) return length value to method call
//

//create method getArea (receives two doubles as arguments)
//
//return product of those two doubles
//

//create method displayData (receives three doubles as arguments, returns nothing)
//
//show JOptionPane with results (dimensions and calculated area passed into paramaters)
//
//

//create main method
//
//create variables for length, width, and area
//
//length = return on getLength method
//
//width = return on getWidth method
//
//area = return on getArea method (passes length and width to the method)
//
//pass all three values above to displayData method to display results
//

//



/*Start File:
	I kept the start code for the most part--I just changed some minor
	punctuation errors and put all the variables on one line. From there,
	I added the four necessary methods and one extra one for inputValidation.

 *validateInput explained:
	The purpose of this method is to run a try/catch on the input.
	The method returns 0 if:
		-The input is less than or equal to 0
		-The input cannot be parsed and an exception is caught

	So in the getLength and getWidth methods, if length turns out to be 0,
		a loop is executed where the user is again asked for input and the
		input is again passed back through validateInput. The loop won't end
		until the user enters a valid value (a number greater than 0).

	An issue I ran into is the program would act as if there was invalid
		input when the user hits the exit button or cancel button.
		Thus, they'd be asked for input over and over and could not exit.
		To fix this, I added the if (input == null) line of code to
		terminate the program if either of these buttons are clicked.
*/