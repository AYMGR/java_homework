package com.selections.test;

import java.util.Scanner;

/**
 * *3.5 (Find future dates) Write a program that prompts the user to enter an integer for today’s
 * day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also prompt the user to
 * enter the number of days after today for a future day and display the future day of the week.
 * Here is a sample run: Enter today’s day: 1 Enter the number of days elapsed since today: 3 Today
 * is Monday and the future day is Thursday Enter today’s day: 0 Enter the number of days elapsed
 * since today: 31 Today is Sunday and the future day is Wednesday
 */
public class FindFutureDates {

  public static void main(String[] args) {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday"};

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6).
    // Also prompt the user to enter the number of days after today for a future day
    System.out.print(
        "Enter today's day of the week (Sunday is 0, Monday is 1, ..., Saturday is 6): ");
    int today = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int daysFuture = input.nextInt();

    // Display today and the future day of the week.
    int futureDay = (today + daysFuture) % 7;
    if (futureDay == 0) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Sunday");
    } else if (futureDay == 1) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Monday");
    } else if (futureDay == 2) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Tuesday");
    } else if (futureDay == 3) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Wednesday");
    } else if (futureDay == 4) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Thursday");
    } else if (futureDay == 5) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Friday");
    } else if (futureDay == 6) {
      System.out.println("Today is " + daysOfWeek[today] + " and the future day is Saturday");
    }
  }
}


