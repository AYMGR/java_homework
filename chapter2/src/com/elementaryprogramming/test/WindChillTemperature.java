package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.17 (Science: wind-chill temperature) How cold is it outside? The temperature alone is not enough to provide the answer.
 *  Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside.
 *  In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using temperature and wind speed.
 *  The formula is:
 *                twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275ta*v^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the speed measured in miles per hour, and twc is the wind-chill temperature.
 * The formula cannot be used for wind speeds below 2 mph or temperatures below - 58°F or above 41°F.
 * Write a program that prompts the user to enter a temperature between -58°F and 41°F and a wind speed greater than or equal to 2 then
 * displays the wind-chill temperature. Use Math.pow(a, b) to compute v0.16. Here is a sample run:
 * Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
 * Enter the wind speed (7= 2) in miles per hour: 6
 * The wind chill index is -5.56707
 */
public class WindChillTemperature {

  public static void main(String[] args) {
    // step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt the user to enter a temperature between -58°F and 41°F and a wind speed greater than or equal to 2
    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double fahrenheitTemperature = input.nextDouble();
    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double windSpeed = input.nextDouble();

    // step3: Compute the wind-chill temperature
    double outsideTemperature = fahrenheitTemperature;
    double v = windSpeed;
    double windChillTemperature = 35.74 + (0.6215 * outsideTemperature) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * outsideTemperature * Math.pow(v, 0.16));

    // step4: Display the wind-chill temperature
    System.out.println("The wind chill index is: " + windChillTemperature);
  }

}
