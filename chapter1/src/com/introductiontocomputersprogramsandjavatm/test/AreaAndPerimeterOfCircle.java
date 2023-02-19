package com.introductiontocomputersprogramsandjavatm.test;

import java.util.Scanner;

/**
 * 1.8  (Area and perimeter of a circle) Write a program that displays the area and perimeter of a
 * circle that has a radius of 5.5 using the following formulas: perimeter = 2 * radius * pi area =
 * radius * radius * pi
 */
public class AreaAndPerimeterOfCircle {

  public static void main(String[] args) {
    // step1: get the radius from user input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a radius of circle: ");
    double r = input.nextDouble();

    // step2: compute the area and perimeter of circle by the formulas
    final double PI = 3.1415926535;
    double perimeter = 2 * r * PI;
    double area = r * r * PI;

    // step3: display the results
    System.out.println("The perimeter of circle is: " + perimeter);
    System.out.println("The area of circle is: " + area);

  }

}
