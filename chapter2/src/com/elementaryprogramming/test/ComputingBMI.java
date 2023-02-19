package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
 *  It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters.
 *  Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 *  Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
 *  Enter weight in pounds: 95.5
 *  Enter height in inches: 50
 *  BMI is  26.8573
 */
public class ComputingBMI {

  public static void main(String[] args) {
    // step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: prompts the user to enter a weight in pounds and height in inches
    System.out.print("Enter your weight in pounds: ");
    double pounds = input.nextDouble();
    System.out.print("Enter your height in inches: ");
    double inches = input.nextDouble();

    // step3: calculated BMI by taking your weight in kilograms and dividing by the square of your height in meters
    //        convert pounds to kilograms, inches to meters
    double kg = pounds * 0.45359237;
    double meters = inches * 0.0254;
    double bmi = kg / (meters * meters);

    // step4: displays the BMI
    System.out.println("BMI is " + bmi);
  }

}
