/*
The program should ask the user to enter the charge for the meal. The restaurant collects 6%  for  the  government  tax  and  10%  service  charge on  table  service.  Display the  meal charge, government tax, service charge and total bill on the screen
*/

import java.util.*;
class Main { 
  public static void main(String[] args) {

    // declare a constant variables
    final double TAX_RATE = 0.06;
    final double SERVICE_CHARGE = 0.1;
    
    // create scanner object for user inputs
    Scanner input = new Scanner(System.in);

    // Get charge meals
    System.out.println("Enter the meal's charge: ");
    double mealCharge = input.nextDouble();

    // Calculate tax and service charge
    double govTax = TAX_RATE * mealCharge;
    double serviceCharge = SERVICE_CHARGE * mealCharge;
    double totalBill = mealCharge + govTax + serviceCharge;

    // Display output
    System.out.println("Meal Charge: RM" + String.format("%.2f", mealCharge));
    System.out.println("Government Tax: RM" + String.format("%.2f", govTax));
    System.out.println("Service Charge: RM" + String.format("%.2f", serviceCharge));
    System.out.println("Total Bill: RM" + String.format("%.2f", totalBill));

    // close program
    input.close();
  }
}