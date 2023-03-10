package com.selections.test;

import java.util.Scanner;

/**
 * *3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user
 * enter weight, feet, and inches. For example, if a person is 5 feet and 10 inches, you will enter
 * 5 for feet and 10 for inches. Here is a sample run: Enter weight in pounds: 140 Enter feet: 5
 * Enter inches: 10 BMI is 20.087702275404553 Normal
 */
public class BMI {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds, feet, and inches
    System.out.print("Enter weight in pounds: ");
    double weightInPounds = input.nextDouble();

    System.out.print("Enter feet ");
    double feet = input.nextDouble();

    System.out.print("Enter inches ");
    double inches = input.nextDouble();

    // Convert feet and inches to meters
    double heightInMeters = ((feet * 12) + inches) * 0.0254;

    // Convert pounds to kilograms
    double weightInKilograms = weightInPounds * 0.45359237;

    // Compute BMI
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    // Display the result
    System.out.println("BMI is " + bmi);

    if (bmi < 18.5) {
      System.out.println("Underweight");
    } else if (bmi < 25) {
      System.out.println("Normal");
    } else if (bmi < 30) {
      System.out.println("Overweight");
    } else {
      System.out.println("Obese");
    }
  }
}
