package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.22 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java,
 *  to fix the possible loss of accuracy when converting a double value to an int value.
 *  Enter the input as an integer whose last two digits represent the cents. For example,
 *  the input 1156 represents 11 dollars and 56 cents.
 */
public class MonetaryUnits {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Receive the amount
    System.out.print("Enter an amount in integer (eg 8888888): ");
    int amount = input.nextInt();

    // step3: Find the number of dollars and cents
    int numberOfDollars = amount / 100;
    int numberOfCents = amount % 100;

    // Display results
    System.out.print("Your amount " + amount + " consists of");
    System.out.print("\t" + numberOfDollars + " dollars");
    System.out.println("\tand\t" + numberOfCents + " cents");

  }

}
