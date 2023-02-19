package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  **2.6 (Sum the digits in an integer) Write a program that reads an integer between
 *  0 and 1000 and adds all the digits in the integer. For example, if an integer is 932,
 *  the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 */
public class SumTheDigitsInAnInteger {

  public static void main(String[] args) {
    // create a Scanner Object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter an integer between o ~ 1000
    System.out.print("Enter an integer between 0 ~ 1000: ");
    int num = input.nextInt();

    // Split the integer into units, tens and hundreds
    int hundreds = num / 100;
    int tens = (num / 10) % 10;   // int tens = (num % 100) / 10
    int units = num % 10;
    int sum = hundreds + tens + units;
    System.out.println("The sum of digits is: " + sum);
  }

}
