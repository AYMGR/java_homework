package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.2 (Compute the volume of a cylinder) Write a program that reads in the radius and length of
 *      a cylinder and computes the area and volume using the following formulas:
 *      area = radius * radius * π
 *      volume = area * length
 *      Here is a sample run:
 *      Enter the radius and length of a cylinder: 5.5 12
 *      The area is 95.0331
 *      The volume is 1140.4
 */
public class ComputeTheVolumeOfACylinder {

  public static void main(String[] args) {
    // step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt user to enter the radius and length of a cylinder
    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double length = input.nextDouble();

    // step3: Compute the volume of a cylinder
    final double PI = 3.1415926535;
    double area = radius * radius * PI;
    double volume = area * length;
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);

  }

}
