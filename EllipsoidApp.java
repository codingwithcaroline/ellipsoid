import java.util.Scanner;
/**
*This program has a main method
*that reads in data, creates an
*Ellipsoid ojects, and then 
*prints the object.
*@author Caroline Kirkconnell
*@version 2/6/2020
*/
public class EllipsoidApp {

/**
*This main method reads in values for
*label and the axes a, b, and c. After
*the values have been read in, the main
*method creates an Ellipsoid object
*and then prints a new line and the object.
   *@param args Command-line arguments (unused).
*/
   public static void main(String[] args) {
      String label;
      double a, b, c;
      Scanner scan = new Scanner(System.in);
   
   //User enters value for label:
      System.out.print("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\n\tlabel: ");
      label = scan.nextLine();
   
   //User enters value for a:
      System.out.print("\ta: ");
      a = Double.parseDouble(scan.nextLine());
      if (a <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }


   //User enters value for b:
      System.out.print("\tb: ");
      b = Double.parseDouble(scan.nextLine());
      if (b <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }
      
   
   //User enters value for c:
      System.out.print("\tc: ");
      c = Double.parseDouble(scan.nextLine());
      if (c <= 0) {
         System.out.print("Error: axis value must be positive.");
         return;
      }

   //Create new object and print object.
      Ellipsoid elip = new Ellipsoid(label, a, b, c);
      System.out.println("\n" + elip);
   }
}