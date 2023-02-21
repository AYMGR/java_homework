package com.selections.test;

import java.util.Scanner;

/**
 * *3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer’s rule
 * given in Programming Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e,
 * and f and displays the result. If ad - bc is 0, report that “The equation has no solution.” Enter
 * a, b, c, d, e, f: 9.0 4.0 3.0 −5.0 −6.0 −21.0 x is −2.0 and y is 3.0 Enter a, b, c, d, e, f: 1.0
 * 2.0 2.0 4.0 4.0 5.0 The equation has no solution
 */
public class SolveLinearEquations {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to input enter a, b, c, d, e, and f
    System.out.print("Enter a, b, c, d, e, f: ");

    // receive input
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    // Compute the  linear equation  use Cramer’s rule
    double x0 = a * d - b * c;
    double x = (e * d - b * f) / x0;
    double y = (a * f - e * c) / x0;

    // Display the result
    if (x0 != 0) {
      System.out.println("x is " + x + " and y is " + y);
    } else {
      System.out.println("The equation han no solution");
    }

  }

}
