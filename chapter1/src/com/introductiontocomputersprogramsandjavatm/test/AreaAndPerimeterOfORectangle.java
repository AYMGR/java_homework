package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.9 (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a
 * rectangle with a width of 4.5 and a height of 7.9 using the following formula: area = width *
 * height
 */
public class AreaAndPerimeterOfORectangle {

  public static void main(String[] args) {
    double width = 4.5;
    double height = 7.9;
    double area = width * height;
    double perimeter = 2 * (width + height);
    System.out.println("The perimeter of rectangle is: " + perimeter);
    System.out.println("The area of rectangle is: " + area);
  }

}
