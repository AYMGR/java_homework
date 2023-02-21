package com.selections.test;

import java.util.Scanner;

/**
 * ** 3.27 (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as shown
 * below. The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0)
 * and (0, 100). Write a program that prompts the user to enter a point with x- and y-coordinates
 * and determines whether the point is inside the triangle. Here are the sample runs: Enter a
 * point’s x- and y-coordinates: 100.5 25.5 The point is in the triangle Enter a point’s x- and
 * y-coordinates: 100.5 50.5 The point is not in the triangle
 */
public class CheckPointsInTriangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // 1. Read in the point (x,y) from the user.
    System.out.print("Enter a point with x- and y-coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();

    // 2. Calculate the area of the triangle ABC using the formula:
    //    area = 0.5 * |(x2 - x1)(y3 - y1) - (x3 - x1)(y2 - y1)|
    //    where A(x1, y1) = (0,0), B(x2, y2) = (200,0), and C(x3, y3) = (0,100).
    double x1 = 0, y1 = 0;
    double x2 = 200, y2 = 0;
    double x3 = 0, y3 = 100;
    double areaOfTriangle_ABC = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));

    // 3. Calculate the area of the sub-triangles PAB, PBC, and PAC using the formula in step 2,
    //    but replacing the coordinates of one vertex with the coordinates of the point (x,y).
    double areaOfSubTriangle_PAB = 0.5 * Math.abs((x2 - x1) * (y - y1) - (x - x1) * (y2 - y1));
    double areaOfSubTriangle_PAC = 0.5 * Math.abs((x - x1) * (y3 - y1) - (x3 - x1) * (y - y1));
    double areaOfSubTriangle_PBC = 0.5 * Math.abs((x2 - x) * (y3 - y) - (x3 - x) * (y2 - y));

    // 4. If the sum of the areas of the sub-triangles is equal to the area of the triangle ABC,
    //    then the point is inside the triangle. Otherwise, the point is outside the triangle.
    double sumOfSubTriangles = areaOfSubTriangle_PAB + areaOfSubTriangle_PAC + areaOfSubTriangle_PBC;
    // 5. Print out the result.
    if (areaOfTriangle_ABC == sumOfSubTriangles) {
      System.out.println("The point is in the triangle");
    } else {
      System.out.println("The point is not in the triangle");
    }
  }
}
