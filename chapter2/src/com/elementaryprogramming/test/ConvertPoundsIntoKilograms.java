package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 * 2.4 (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The
 * program prompts the user to enter a number in pounds, converts it to kilograms, and displays the
 * result. One pound is 0.454 kilogram. Here is a sample run: Enter a number in pounds: 55.5 55.5
 * pounds is 25.197 kilograms
 */
public class ConvertPoundsIntoKilograms {

  public static void main(String[] args) {
    // create a Scanner Object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter a number in pounds
    System.out.print("Enter a number in pounds: ");
    double pounds = input.nextDouble();

    // convert pounds to kilograms
    double kilograms = pounds * 0.454;
    System.out.println(pounds + "\tpounds is " + kilograms + "\tkilograms" );

  }

}
