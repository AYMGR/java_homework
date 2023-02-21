package com.selections.test;

import java.util.Scanner;

/**
 * **3.23 (a) Points inside and outside of the circle. (b) Points inside and outside of the
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter a point (x, y)
 * and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height
 * 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in
 * Figure 3.7b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than
 * or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test
 * your program to cover all cases.) Here are two sample runs: Enter a point with two coordinates:
 * −4.9 2.49 Point (−4.9, 2.49) is in the rectangle Enter a point with two coordinates: −5.1 −2.4
 * Point (−5.1, −2.4) is not in the rectangle
 */
public class CheckPointInRectangle {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a point(x, y)
    System.out.print("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    // Checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5.
    double width = 10.0;
    double height = 5.0;
    double horizontalDistance = Math.abs(x);
    double verticalDistance = Math.abs(y);

    // Display
    if (horizontalDistance <= width / 2 && verticalDistance <= height / 2) {
      System.out.println("Point (" + x + "," + y + ") is in the rectangle");
    } else {
      System.out.println("Point (" + x + "," + y + ") is in not the rectangle");
    }

  }

}
