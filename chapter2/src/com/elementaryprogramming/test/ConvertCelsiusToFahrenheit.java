package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
 *      then converts it to Fahrenheit, and displays the result. The formula for the conversion is as follows:
 *      fahrenheit = (9 / 5) * celsius + 32
 *      Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. Here is a sample run:
 *      Enter a degree in Celsius: 43.5
 *      43.5 Celsius is 110.3 Fahrenheit
 */
public class ConvertCelsiusToFahrenheit {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);
    // step2: Prompt user to enter a degree in Celsius
    System.out.print("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();

    // step3: converts celsius to Fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // step4: displays the result
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }


}
