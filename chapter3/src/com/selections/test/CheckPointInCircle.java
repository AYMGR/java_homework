package com.selections.test;

import java.util.Scanner;

/**
 * **3.22 (Geometry: point in a circle?) Write a program that prompts the user to enter a point (x,
 * y) and checks whether the point is within the circle centered at (0, 0) with radius 10. For
 * example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. 22 program
 * to cover all cases.) Two sample runs are shown below: Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle Enter a point with two coordinates: 9 9 Point (9.0, 9.0) is not
 * in the circle
 */
public class CheckPointInCircle {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a point(x,y)
    System.out.print("Enter a point with two coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    // Check whether the point is within the circle centered at (0, 0) with radius 10.
    // Compute the distance between (0, 0) and (x, y)
    double a = (x - 0) * (x - 0) + (y - 0) * (y - 0);
    double distance = Math.pow(a, 0.5);

    // Display
    double radius = 10.0;
    if (distance <= radius) {
      System.out.println("Point (" + x + "," + y + ") is in the circle");
    } else if (distance > radius) {
      System.out.println("Point (" + x + "," + y + " ) is not in the circle");
    }
  }

}
