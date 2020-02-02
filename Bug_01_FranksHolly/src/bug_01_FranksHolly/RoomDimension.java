/**
* RoomDimension class for the buggy code.
* 9/27/2017
* CSC 251 Bug_01
* @author Holly Franks
*/
package bug_01_FranksHolly;
public class RoomDimension
{
   private double length;     // Room length
   private double width;      // Room width

   //Constructor
   public RoomDimension(double len, double wid)
   {
      length = len;
      width = wid;
   }
   
   //getLength method
   public double getLength()
   {
      return length;
   }

   //getWidth method
   public double getWidth()
   {
      return width;
   }

   //getArea method
   public double getArea()
   {
      return length * width;
   }

   //toString method
   public String toString()
   {
      String str = String.format("Length: %,.2f\n" +
                                 "Width: %,.2f\n" +
                                 "Area: %,.2f\n",
                                 length, width, getArea());
      return str;
   }
}
