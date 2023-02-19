package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.23 (Cost of driving) Write a program that prompts the user to enter the distance to drive,
 *  the fuel efficiency of the car in miles per gallon,
 *  and the price per gallon then displays the cost of the trip. Here is a sample run:
 *  Enter the driving distance: 900.5
 *  Enter miles per gallon: 25.5
 *  Enter price per gallon: 3.55
 *  The cost of driving is $125.36
 */
public class CostOfDriving {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
    System.out.print("Enter the driving distance: ");
    double drivingDistance = input.nextDouble();
    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();
    System.out.print("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();

    // Compute the cost of driving
    double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;

    // Display the cost of driving
    System.out.println("The cost of driving is: " + costOfDriving);
  }

}
