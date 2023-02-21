package com.selections.test;

import java.util.Scanner;

/**
 * *3.11 (Find the number of days in a month) Write a program that prompts the user to enter the
 * month and year and displays the number of days in the month. For example, if the user entered
 * month 2 and year 2012, the program should display that February 2012 has 29 days. If the user
 * entered month 3 and year 2015, the program should display that March 2015 has 31 days.
 */
public class NumberOfDaysInMonth {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the month and year
    System.out.print("Enter the month (1-12): ");
    int month = input.nextInt();
    System.out.print("Enter the year: ");
    int year = input.nextInt();

    // Determine the number of days in the specified month
    int daysInMonth = 0;
    switch (month) {
      case 1: // January
      case 3: // March
      case 5: // May
      case 7: // July
      case 8: // August
      case 10: // October
      case 12: // December
        daysInMonth = 31;
        break;
      case 4: // April
      case 6: // June
      case 9: // September
      case 11: // November
        daysInMonth = 30;
        break;
      case 2: // February
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          daysInMonth = 29;
        } else {
          daysInMonth = 28;
        }
        break;
      default:
        System.out.println("Invalid month.");
        return;
    }

    // Display the number of days in the specified month
    System.out.println("That " + getMonthName(month) + " " + year + " has " + daysInMonth + "days");
  }

  // the month name obtained from the getMonthName method.
  public static String getMonthName(int month) {
    String[] monthNames = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    return  monthNames[month -1];
  }
}


