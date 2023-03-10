package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity divided
 *  by the time taken to make the change, as given by the following formula:
 *                                  a=(v1 -v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/ second,
 * the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration. Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */
public class ComputeAverageAcceleration {

  public static void main(String[] args) {
    // step1: Create s Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt user to enter the starting velocity v0 in meters/seconds; the ending velocity v1 in meters/seconds
    //        and the time span t in seconds;
    System.out.print("Enter v0, v1, and t: ");
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double t = input.nextDouble();

    // step3: calculate the average acceleration by the formula
    double avgAcceleration = (v1 - v0) /t;

    // step4: display the result of average acceleration
    System.out.println("The average acceleration is: " + avgAcceleration);

  }

}
