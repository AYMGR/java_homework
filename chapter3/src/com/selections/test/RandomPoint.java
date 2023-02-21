package com.selections.test;

/**
 * 3.16 (Random point) Write a program that displays a random coordinate in a rectangle. The
 * rectangle is centered at (0, 0) with width 100 and height 200.
 */
public class RandomPoint {

  public static void main(String[] args) {
    // Define rectangle dimensions
    // width = 100, height = 200

    // Generate a random x-coordinate in the range [-50, 50]
    double x = -50.0 + (Math.random() * 101);

    // Generate a random y-coordinate in the range [-100, 100]
    double y = -100.0 + (Math.random() * 201);

    // Display the coordinates
    System.out.println("The random coordinate in rectangle is " + "(" + x + ", " + y + ").");

  }

}
