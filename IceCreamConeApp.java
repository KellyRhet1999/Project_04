import java.util.Scanner;
/**
* Rhet Kelly
* 09/20/19
* Project_04
*
* Displays information about a given cone.
*/

public class IceCreamConeApp
{
/**
* Prints information on a cone.
* @param args Command line arguments(not used).
*/

   public static void main(String[] args)
   {
      String label = "";
      double radius = 0;
      double height = 0;
      Scanner userInput = new Scanner(System.in);
   
      // Prompt user to enter information
      System.out.println("Enter label, radius, and height"
         + " for an ice cream cone.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      // Enter radius
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
   
      if (radius <= 0)
      {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      
      // Enter height
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
   
      if (height <= 0)
      {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
   
   
      IceCreamCone newIceCreamCone = 
         new IceCreamCone(label, radius, height);
   
      System.out.println("");
      System.out.println(newIceCreamCone.toString());
   
   
   }

}