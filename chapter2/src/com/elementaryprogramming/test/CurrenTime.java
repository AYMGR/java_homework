package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 *  the current time in GMT. Revise the program so it prompts the user to enter the time zone
 *  offset to GMT and displays the time in the specified time zone. Here is a sample run:
 *  Enter the time zone offset to GMT: -5
 *  The current time is 4:50:34
 */
public class CurrenTime {

  public static void main(String[] args) {
    // create a Scanner Object
    Scanner input = new Scanner(System.in);
    // prompt user to enter the time zone offset to GMT
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
    long currentHour = totalHour % 24;

    // displays the time in the specified time zone
    System.out.println("The current time is: " + currentHour+ ":" + currentMinute + ":" + currentSecond);

  }

}
