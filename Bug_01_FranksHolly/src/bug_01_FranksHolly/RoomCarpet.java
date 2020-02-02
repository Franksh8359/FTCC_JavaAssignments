/**
* RoomCarpet class for the buddy code.
* 9/27/2017
* CSC 251 Bug_01
* @author Holly Franks
*/
package bug_01_FranksHolly;
public class RoomCarpet
{
   private RoomDimension size;   // The size of the room
   private double carpetCost;    // Carpet cost per square foot
   
   //Constructor
   public RoomCarpet(RoomDimension dim, double cost)
   {
      // Make size reference a copy of the object referenced
      // by the dim argument.
      size = dim;
      
      // Assign the cost.
      carpetCost = cost;
   }
   
   //getTotalCost method
   public double getTotalCost()
   {
      // Return the total cost.
      return carpetCost * size.getArea();
   }

   //toString method  
   public String toString()
   {  
      // Create a String with the object state.
      String str = String.format("\nRoom dimensions:\n" +
                                 "%s\nCarpet cost: $%,.2f", 
                                 size, getTotalCost());
      
      // Return the String
      return str;
   }
}

