package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter three points,
 *  (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area. The formula for computing the area of a triangle is
 *
 *                  s = (side1 + side2 + side3) / 2;
 *                  area = pow(s(s - side1)(s - side2)(s - side3), 2)
 */
public class AreaOfATriangle {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompts the user to enter three points, (x1, y1), (x2, y2), and (x3, y3)
    System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    // step3: Compute the area of a triangle
    double side1 = Math.pow(((x2 - x1) * ( x2 - x1) + (y2 - y1) * (y2 - y1)), 0.5);
    double side2 = Math.pow(((x3 - x1) * ( x3 - x1) + (y3 - y1) * (y3 - y1)), 0.5);
    double side3 = Math.pow(((x2 - x3) * ( x2 - x3) + (y2 - y3) * (y2 - y3)), 0.5);
    double s = (side1 + side2 + side3) / 2;
    double a = s * (s - side1) * (s - side2) * (s - side3);
    double area =Math.pow(a, 0.5);

    // step4: Display the area
    System.out.println("The area of the triangle is: " + area);

  }

}
