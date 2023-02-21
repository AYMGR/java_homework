package com.selections.test;

import java.util.Scanner;

/**
 * **3.19 (Compute the perimeter of a triangle) Write a program that reads three edges for a
 * triangle and computes the perimeter if the input is valid. Otherwise, display that the input is
 * invalid. The input is valid if the sum of every pair of two edges is greater than the remaining
 * edge.
 */
public class ComputeThePerimeterOfTriangle {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to input three edges for  a triangle
    System.out.print("Enter three edges for  a triangle:  ");
    double edge1 = input.nextDouble();
    double edge2 = input.nextDouble();
    double edge3 = input.nextDouble();

    // Validate input is valid
    // Computes the perimeter if the input is valid
    double perimeterOfTriangle;
    if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
      perimeterOfTriangle = edge1 + edge2 + edge3;
      // Display the perimeter of triangle
      System.out.println("The perimeter of triangle is " + perimeterOfTriangle);
    } else {
      System.out.println("The input is invalid");
    }

  }

}
