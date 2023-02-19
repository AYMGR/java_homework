package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *
 * 2.15 (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance.
 * The formula for computing the distance is pow((x2 - x1)^2 + (y2 - y1)^2)
 * . Note you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 * Here is a sample run:
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * The distance between the two points is 8.764131445842194
 */
public class DistanceOfTwoPoints {

  public static void main(String[] args) {
    // step1: Create a Scanner Objet
    Scanner input = new Scanner(System.in);
    
    // step2: Prompt user to enter two points (x1, y1) and (x2, y2)
    System.out.print("Enter x1 and y1: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print("Enter x2 and y2: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    // step3: Computing the distance
    double a = ((x2 - x1) * (x2 - x1)) + ((y2 -y1) * (y2 -y1));
    double distance = Math.pow(a, 0.5);

    // step4: Display
    System.out.println("The distance between the two points is: " + distance);
    
  }

}
