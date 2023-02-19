package com.elementaryprogramming.test;


import java.util.Scanner;

/**
 * *1.11 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *  * ■■ One birth every 7 seconds
 *  * ■■ One death every 13 seconds
 *  * ■■ One new immigrant every 45 seconds
 *  * Write a program to display the population for each of the next five years. Assume that the current population
 *  * is 312,032,486, and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer.
 *  * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result
 *  * with the fractional part, one of the values involved in the division must be a number with a decimal point. For example,
 *  * 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 *  2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter
 *  the number of years and display the population after the number of years.
 *  Use the hint in Programming Exercise 1.11 for this program. Here is a sample run of the program:
 *  Enter the number of years: 5
 * The population in 5 years is 325932969
 */
public class PopulationProjection {

  public static void main(String[] args) {
    // step1: create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt user to enter the number of years
    System.out.print("Enter the number of years: ");
    int years = input.nextInt();

    // step3: calculate population increase of one year; and compute the total population after  input  x years
    int numOfCurrentPopulation = 312032486;
    int secondsOfTheYear = 31536000;
    double NumberOfPeopleAddedPerSecond = (1.0 / 7 + 1.0 / 45) - 1.0 / 13;
    double NumberOfPeopleIncreasedEachYear = NumberOfPeopleAddedPerSecond * secondsOfTheYear;
    double TheTotalPopulationInYears = years * NumberOfPeopleIncreasedEachYear +numOfCurrentPopulation;

    // step4: Display the final population
    System.out.println("The population in " + years + " years is " + (long)TheTotalPopulationInYears);

  }

}
