package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.10 (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note 1 mile is equal
 * to 1.6 kilometers.)
 */
public class AverageSpeedInMiles {

  public static void main(String[] args) {
    // step1: Convert kilometers to miles
    double km = 14;
    double mileage = 1.6 * km;

    // step2: get mileage
    System.out.println("distance converted to miles is: " + mileage + " mi");

    // step3: Convert seconds to hours and calculate average speed
    double seconds = 2730;
    double hours = seconds / 3600;
    System.out.println("The time converted to hours is: " + hours + " h");
    double avgSpeed = mileage / hours;
    System.out.println("Average speed in miles is: " + avgSpeed + " mi/h");

  }

}
