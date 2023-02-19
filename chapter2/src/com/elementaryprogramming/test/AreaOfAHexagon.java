package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of
 *  a hexagon and displays its area. The formula for computing the area of a hexagon is:
 *
 *          Area = ((3 * pow(3)) * s * s) / 2
 *
 *          where s is the length of a side. Here is a sample run:
 *          Enter the length of the side: 5.5
 *          The area of the hexagon is 78.5918
 */
public class AreaOfAHexagon {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: prompts the user to enter the side of a hexagon
    System.out.print("Enter the length of the side: ");
    double sideOfaHexagon = input.nextDouble();

    // step3: computing the area of a hexagon
    double s = sideOfaHexagon;
    double Area = ((3 * Math.pow(3, 0.5)) * s * s) / 2;

    // step4: Display its area
    System.out.println("The area of the hexagon is: " + Area);
  }
}
