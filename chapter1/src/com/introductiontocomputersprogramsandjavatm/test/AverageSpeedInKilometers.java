package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and
 * 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note 1 mile
 * is equal to 1.6 kilometers.)
 */
public class AverageSpeedInKilometers {

  public static void main(String[] args) {
    // step1: convert miles to kilometers
    double miles = 24.0;
    double km = miles / 1.6;

    // step2: convert seconds to hours
    double seconds = 6035;
    double hours = seconds / 3600;

    // step3: calculate the Average speed in kilometers
    double avgSpeed = km / hours;
    System.out.println("Average speed in kilometers is: " + avgSpeed + " km/h");

  }

}
