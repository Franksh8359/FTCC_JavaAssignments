/**
* This is the buggy program we corrected in class today.
* 9/27/2017
* CSC 251 Bug_01
* @author Holly Franks
*/
package bug_01_FranksHolly;
import java.util.Scanner;
public class Bug_01_FranksHolly //CarpetCalculator
{
   public static void main(String[] args)
   {
      final double CARPET_PRICE = 0.8; // Price per square foot
      double length;                   // To input room length
      double width;                    // To input room width

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Display intro.
      System.out.println("This program will display price to " +
                         "carpet a room. \nYou must input the " +
                         "room's dimensions in feet.");
      
      // Get the length of the room.
      System.out.print("Enter the length first: ");
      length = keyboard.nextDouble();
      
      // Get the width of the room.
      System.out.print("Now enter the width: ");
      width = keyboard.nextDouble();
      
      // Create RoomDimension and RoomCarpet objects.
      RoomDimension dimensions = new RoomDimension(length, width);
      RoomCarpet room = new RoomCarpet(dimensions, CARPET_PRICE);
      
      // Display the dimensions and cost.
      System.out.println(room);
   }
}
