package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 * 2.10 (Science: calculating energy) Write a program that calculates the energy needed to heat
 * water from an initial temperature to a final temperature. Your program should prompt the user to
 * enter the amount of water in kilograms and the initial and final temperatures of the water. The
 * formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184 where M
 * is the weight of water in kilograms, initial and final temperatures are in degrees Celsius, and
 * energy Q is measured in joules. Here is a sample run: Enter the amount of water in kilograms:
 * 55.5 Enter the initial temperature: 3.5 Enter the final temperature: 10.5 The energy needed is
 * 1625484.0
 */
public class CalculatingEnergy {

  public static void main(String[] args) {
//    step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

/*    step2: 2.1 Prompt user to enter the amount of water in kilograms, initial and final temperatures are in degrees Celsius; and Energy Q is measured in joules.
             2.2 Accept the value entered by the user and save it in a variable of type double
 */

    System.out.print("Enter the amount of water in kilograms: ");
    double amountOfWater = input.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double initialTemperature = input.nextDouble();

    System.out.print("Enter the final temperature: ");
    double finalTemperature = input.nextDouble();


//    step3: Compute the energy by the formula
    double M = amountOfWater;
    double Q = M * (finalTemperature - initialTemperature) * 4184;

//    step5: Display the energy needed to heat water from an initial temperature to a final temperature
    System.out.println("The energy needed to heat water from an initial temperature to a final temperature is: " + Q + "\tjoules");

  }

}
