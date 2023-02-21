package com.selections.test;

import java.util.Scanner;

/**
 * *3.30 (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * Here is a sample run: Enter the time zone offset to GMT: −5 The current time is 4:50:34 AM
 */
public class CurrentTime {

  public static void main(String[] args) {
    // Create a Scanner Object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter the time zone offset to GMT
    System.out.print("Enter the time zone offset to GMT: ");
    int offsetToGMT = input.nextInt();

    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;
    // Compute the current second in the minute, in the hour
    long currentSecond = totalSeconds % 60;
    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;
    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;
    // Obtain the totalHours
    long totalHour = totalMinutes / 60;
    // Compute the current hour
    long currentHour = totalHour % 24 ;

    // Displays the time in the specified time zone
    if (currentHour <= 12) {
      System.out.println("The current time is: " + currentHour+ ":" + currentMinute + ":" + currentSecond + " AM");
    } else if (currentHour > 12 && currentHour <= 24) {
      System.out.println("The current time is: " + currentHour % 12+ ":" + currentMinute % 12  + ":" + currentSecond % 12 + " PM");
    }
  }
}
