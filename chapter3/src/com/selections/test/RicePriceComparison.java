package com.selections.test;


import java.util.Scanner;

/**
 * *3.33 (Financial: compare costs) Suppose you shop for rice in two different packages. You would
 * like to write a program to compare the cost. The program prompts the user to enter the weight and
 * price of each package and displays the one with the better price. Here is a sample run: Enter
 * weight and price for package 1: 50 24.59 Enter weight and price for package 2: 25 11.99 Package 2
 * has a better price.
 */

public class RicePriceComparison {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the weight and price of the first package
    System.out.print("Enter weight and price for package 1: ");
    double weight1 = input.nextDouble();
    double price1 = input.nextDouble();

    // Prompt the user to enter the weight and price of the second package
    System.out.print("Enter weight and price for package 2: ");
    double weight2 = input.nextDouble();
    double price2 = input.nextDouble();

    // Calculate the cost per pound for each package
    double costPerPound1 = price1 / weight1;
    double costPerPound2 = price2 / weight2;

    // Compare the cost per pound for the two packages and display the better price
    if (costPerPound1 < costPerPound2) {
      System.out.println("The first package has the better price.");
    } else if (costPerPound2 < costPerPound1) {
      System.out.println("The second package has the better price.");
    } else {
      System.out.println("The two packages have the same price per pound.");
    }
  }
}
