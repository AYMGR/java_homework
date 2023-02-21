package com.selections.test;

import java.util.Scanner;

/**
 * *3.18 (Cost of shipping) A shipping company uses the following function to calculate the cost (in
 * dollars) of shipping based on the weight of the package (in pounds). c(w) = 3.5, if 0 6 w 6 = 1
 * 5.5, if 1 6 w 6 = 3 8.5, if 3 6 w 6 = 10 10.5, if 10 6 w 6 = 20 Write a program that prompts the
 * user to enter the weight of the package and displays the shipping cost. If the weight is negative
 * or zero, display a message “Invalid input.” If the weight is greater than 20, display a message
 * “The package cannot be shipped.”
 */
public class CostOfShipping {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the weight of the package(in pounds)
    System.out.print("Enter the weight of the package(in pounds): ");
    double weight = input.nextDouble();

    // Compute the shipping cost
    double costOfShipping = 0;
    if (weight <= 0) {
      System.out.println("Invalid input");
    } else if (weight > 0 && weight <= 1) {
      costOfShipping = weight * 3.5;
    } else if (weight > 1 && weight <= 3) {
      costOfShipping = 1 * 3.5 + (weight - 1) * 5.5;
    } else if (weight > 3 && weight <= 10) {
      costOfShipping = 1 * 3.5 + 3 * 5.5 + (weight - 3) * 8.5;
    } else if (weight > 10 && weight <= 20) {
      costOfShipping = 1 * 3.5 + 3 * 5.5 + 10 * 8.5 + (weight - 10) * 10.5;
    } else {
      System.out.println("The package cannot be shipped.");
    }

    // Display the cost of shipping
    System.out.println("The shipping cost " + "$" +costOfShipping);

  }

}
