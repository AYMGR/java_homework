package com.selections.test;

import java.util.Scanner;

/**
 * **3.21 (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian
 * Zeller to calculate the day of the week. The formula is: h = (q + 26*(m+1) /10 + k + k /4 + j /4
 * + 5j) % 7 where ■■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * Wednesday, 5: Thursday, and 6: Friday). ■■ q is the day of the month. ■■ m is the month (3:
 * March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the
 * previous year. ■■ j is year. 100 ■■ k is the year of the century (i.e., year % 100). Note all
 * divisions in this exercise perform an integer division. Write a program that prompts the user to
 * enter a year, month, and day of the month, and displays the name of the day of the week. Here are
 * some sample runs: Enter year: (e.g., 2012): 2015 Enter month: 1−12: 1 Enter the day of the month:
 * 1−31: 25 Day of the week is Sunday Enter year: (e.g., 2012): 2012 Enter month: 1−12: 5 Enter the
 * day of the month: 1−31: 12 Day of the week is Saturday
 */
public class ComputeDayOfTheWeek {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter a year, month, and day of the month.
    System.out.print("Enter year(e.g., 2012): ");
    int year = input.nextInt();
    System.out.print("Enter month(1 -12): ");
    int month = input.nextInt();
    System.out.print("Enter the day of the month: 1−31: ");
    int dayOfMonth = input.nextInt();

    // convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year
    if (month == 1) {
      month = 13;
      year -= 1;
    } else if (month == 2) {
      month = 14;
      year -= 1;
    }

    // Compute the day of the week by th formula
    int h, j, k;
    int q = dayOfMonth;
    int m = month;
    j = year / 100;
    k = year % 100;
    h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

    // Display
    switch (h) {
      case 0:
        System.out.println("Day of the week is Saturday");
        break;
      case 1:
        System.out.println("Day of the week is Sunday");
        break;
      case 2:
        System.out.println("Day of the week is Monday");
        break;
      case 3:
        System.out.println("Day of the week is Tuesday");
        break;
      case 4:
        System.out.println("Day of the week is Wednesday");
        break;
      case 5:
        System.out.println("Day of the week is Thursday");
        break;
      case 6:
        System.out.println("Day of the week is Friday");
        break;
      default:
    }
  }
}
