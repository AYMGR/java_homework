package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.7 (Find the number of years) Write a program that prompts the user to enter the minutes
 *  (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes.
 *  For simplicity, assume that a year has 365 days. Here is a sample run:
 *  Enter the number of minutes: 1000000000
 *                  1000000000 minutes is approximately 1902 years and 214 days
 */
public class FindTheNumberOfYears {

  public static void main(String[] args) {
    // create a Scanner object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter the minutes
    System.out.print("Enter the number of minutes: ");
    long minutes = input.nextLong();

    // convert minutes to maximum number of year and days
    int minutesOfAYear = 60 * 24 * 365;
    int minutesOfADay = 60 * 24;

    long years = minutes / minutesOfAYear;
    long days = minutes / minutesOfADay - years * 365;

    // displays the maximum number of years and remaining days for the minutes
    System.out.println(minutes + " minutes is approximately " + years + " years " + " and " + days + " days");

  }

}
