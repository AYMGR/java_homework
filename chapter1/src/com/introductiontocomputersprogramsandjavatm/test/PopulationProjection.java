package com.introductiontocomputersprogramsandjavatm.test;

/**
 * *1.11 (Population projection) The U.S. Census Bureau projects population based on the following
 * assumptions: ■■ One birth every 7 seconds ■■ One death every 13 seconds ■■ One new immigrant
 * every 45 seconds Write a program to display the population for each of the next five years.
 * Assume that the current population is 312,032,486, and one year has 365 days. Hint: In Java, if
 * two integers perform division, the result is an integer. The fractional part is truncated. For
 * example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the
 * fractional part, one of the values involved in the division must be a number with a decimal
 * point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
public class PopulationProjection {

  public static void main(String[] args) {
    int numOfCurrentPopulation = 312032486;
    int secondsOfTheYear = 31536000;  // == 365 * 86400

    // step1: calculate the number of a year people birth, death, immigrant
    long PerYearBirth = (long) secondsOfTheYear / 7;
    long PerYearDeath = (long) secondsOfTheYear / 13;
    long PerYearImmigrant = (long) secondsOfTheYear / 45;
    long annualGrowth = (PerYearBirth + PerYearImmigrant) - PerYearDeath;
    System.out.println("The current population is: " + numOfCurrentPopulation);
    System.out.println("Annual growth is: " + annualGrowth);
    System.out.println("next first year population is：" + (numOfCurrentPopulation + annualGrowth));
    System.out.println(
        "Population for the next second year is：" + (numOfCurrentPopulation + annualGrowth * 2));
    System.out.println(
        "Population for the next third year is：" + (numOfCurrentPopulation + annualGrowth * 3));
    System.out.println(
        "Population for the next fourth year is：" + (numOfCurrentPopulation + annualGrowth * 4));
    System.out.println(
        "Population for the next fifth year is：" + (numOfCurrentPopulation + annualGrowth * 5));

  }

}
