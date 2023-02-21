package com.selections.test;

import java.util.Scanner;

/**
 * 3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange. java, to display
 * the nonzero denominations only, using singular words for single units such as 1 dollar and 1
 * penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
 */
public class CountingMonetaryUnits {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the amount as a decimal number
    System.out.print("Enter the amount as a decimal number, for example 11.56: ");
    double amount = input.nextDouble();
    int remainingAmount = (int) (amount * 100);

    // Find the number of dollars
    int numberOfDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies
    int numberOfPennies = remainingAmount;

    // Display the result
    if (numberOfDollars > 0) {
      System.out.println(numberOfDollars + "dollar" + (numberOfDollars > 1 ? "s" : "") + ", ");
    }

    if (numberOfQuarters > 0) {
      System.out.println(numberOfQuarters + "quarter" + (numberOfQuarters > 1 ? "s" : "") + ", ");
    }

    if (numberOfDimes > 0) {
      System.out.println(numberOfDimes + "dime" + (numberOfDimes > 1 ? "s" : "") + ", ");
    }

    if (numberOfNickels > 0) {
      System.out.println(numberOfNickels + "nickel" + (numberOfNickels > 1 ? "s" : "") + ", ");
    }

    if (numberOfPennies > 0) {
      System.out.println(numberOfQuarters + "pennie" + (numberOfPennies > 1 ? "s" : ""));
    }

  }

}
