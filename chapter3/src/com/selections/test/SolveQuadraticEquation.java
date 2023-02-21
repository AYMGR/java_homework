package com.selections.test;

import java.util.Scanner;

/**
 * 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation ax2 + bx + c = 0
 * can be obtained using the following formula: r1 = 2a and r2 = 2a b2 - 4ac is called the
 * discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it
 * is zero, the equation has one root. If it is negative, the equation has no real roots. Write a
 * program that prompts the user to enter values for a, b, and c and displays the result based on
 * the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0,
 * display one root. Otherwise, display “The equation has no real roots.” Note you can use
 * Math.pow(x, 0.5) to compute 2x. Here are some sample runs: Enter a, b, c: 1.0 3 1 The equation
 * has two roots −0.381966 and −2.61803 Enter a, b, c: 1 2.0 1 The equation has one root −1.0 Enter
 * a, b, c: 1 2 3 The equation has no real roots
 */
public class SolveQuadraticEquation {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    // Prompt user to enter values for a, b, c
    System.out.print("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    // Compute the discriminant and r1, r2
    double r = -b / 2 * a;
    double discriminant = b * b - 4 * a * c;
    double r1 = r + (Math.pow(discriminant, 0.5) / 2 * a);
    double r2 = r - (Math.pow(discriminant, 0.5) / 2 * a);

    // Display the result
    if (discriminant > 0) {
      System.out.println("The equation has two roots " + r1 + " and " + r2);
    } else if (discriminant == 0) {
      System.out.println("The equation has one root " + r);
    } else {
      System.out.println("The equation has no real roots");
    }

  }

}
