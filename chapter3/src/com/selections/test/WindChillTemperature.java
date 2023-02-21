package com.selections.test;

import java.util.Scanner;

/**
 * *3.20 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the
 * wind-chill temperature. The formula is valid for temperatures in the range between -58°F and 41°F
 * and wind speed greater than or equal to 2. Write a program that prompts the user to enter a
 * temperature and a wind speed. The program displays the wind-chill temperature if the input is
 * valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is
 * invalid.
 */
public class WindChillTemperature {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the User to enter a temperature and a wind speed
    System.out.print("Enter the temperature in Fahrenheit: ");
    double fahrenheitTemperature = input.nextDouble();

    System.out.print("Enter the wind speed: ");
    double windSpeed = input.nextDouble();

    // Compute the wind-chill temperature if input is valid(temperature in Fahrenheit between -58°F and 41°F, the wind speed (>= 2) in miles per hour)
    // Displays the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid.
    double ta = fahrenheitTemperature;
    double v = windSpeed;
    double windChillTemperature =
        35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
    if ((ta < -58 || ta > 41) && windSpeed >= 2) {
      System.out.println("The temperature " + ta + " is invalid.");
    } else if ((ta >= -58 && ta <= 41) && windSpeed < 2) {
      System.out.println("The wind speed " + v + " is invalid.");
    } else if ((ta < -58 || ta > 41) && windSpeed < 2) {
      System.out.println("Both the temperature and wind speed is invalid");
    } else if ((ta >= -58 && ta <= 41) && windSpeed >= 2) {
    }
    System.out.println("The wind-chill temperature is " + windChillTemperature);

  }

}
