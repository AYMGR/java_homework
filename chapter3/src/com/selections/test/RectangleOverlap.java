package com.selections.test;

import java.util.Scanner;

/**
 * **3.28 (Geometry: two rectangles) Write a program that prompts the user to enter the center x-,
 * y-coordinates, width, and height of two rectangles and determines whether the second rectangle is
 * inside the first or overlaps with the first, as shown in Figure 3.9. Test your program to cover
 * all cases. Here are the sample runs: (x2, y2) Enter r1’s center x-, y-coordinates, width, and
 * height: 2.5 4 2.5 43 Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3 r2 is
 * inside r1 Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5 Enter r2’s center x-,
 * y-coordinates, width, and height: 3 4 4.5 5 r2 overlaps r1 Enter r1’s center x-, y-coordinates,
 * width, and height: 1 2 3 3 Enter r2’s center x-, y-coordinates, width, and height: 40 45 3 2 r2
 * does not overlap r1
 */
public class RectangleOverlap {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first rectangle information
    System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
    double r1x = input.nextDouble();
    double r1y = input.nextDouble();
    double r1Width = input.nextDouble();
    double r1Height = input.nextDouble();

    // Prompt the user to enter the second rectangle information
    System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
    double r2x = input.nextDouble();
    double r2y = input.nextDouble();
    double r2Width = input.nextDouble();
    double r2Height = input.nextDouble();

    // Compute the left, right, top, and bottom edges of each rectangle
    double r1Left = r1x - r1Width / 2;
    double r1Right = r1x + r1Width / 2;
    double r1Top = r1y + r1Height / 2;
    double r1Bottom = r1y - r1Height / 2;
    double r2Left = r2x - r2Width / 2;
    double r2Right = r2x + r2Width / 2;
    double r2Top = r2y + r2Height / 2;
    double r2Bottom = r2y - r2Height / 2;

    // Determine whether the second rectangle is inside the first or overlaps with the first
    if (r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom) {
      System.out.println("r2 is inside r1");
    } else if (r2Left <= r1Right && r2Right >= r1Left && r2Top >= r1Bottom && r2Bottom <= r1Top) {
      System.out.println("r2 overlaps r1");
    } else {
      System.out.println("r2 does not overlap r1");
    }

  }

}
