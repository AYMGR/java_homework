package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v,
 *  you can compute the minimum runway length needed for an airplane to take off using the following formula:
 *                                    length = v^2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration
 * a in meters/second squared (m/s2), then, displays the minimum runway length.
 * Enter speed and acceleration: 60 3.5
 *            The minimum runway length for this airplane is 514.286
 */
public class ComputeMinimumRunwayLength {

  public static void main(String[] args) {
    // step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2)
    System.out.print("Enter speed and acceleration: ");
    double v = input.nextDouble();
    double a = input.nextDouble();

    // step3: compute the minimum runway length needed for an airplane to take off
    double minimumRunwayLength = (v * v) / (2 * a);

    // step4: displays the minimum runway length.
    System.out.println("The minimum runway length for this airplane is: " + minimumRunwayLength);
  }

}
