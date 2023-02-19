package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.3 (Convert feet into meters) Write a program that reads a number in feet, converts it to meters,
 *  and displays the result. One foot is 0.305 meter. Here is a sample run:
 *  Enter a value for feet: 16.5
 *  16.5 feet is 5.0325 meters
 */
public class ConvertFeetIntoMeters {

  public static void main(String[] args) {
    // create a Scanner Object
    Scanner input = new Scanner(System.in);
    // Prompt user enter a value for feet
    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble();

    // convert feet to meters
    double meters = feet * 0.305;

    // display the result
    System.out.println(feet + "\tfeet is " + meters + "\tmeters");
  }

}
