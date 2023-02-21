package com.selections.test;

import java.util.Scanner;

/**
 * **3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10
 * digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the
 * other 9 digits using the following formula: (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9
 * *9),11 If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN
 * (including leading zeros). Your program should read the input as an integer. Here are sample
 * runs: Enter the first 9 digits of an ISBN as integer: 013601267 The ISBN-10 number is 0136012671
 * Enter the first 9 digits of an ISBN as integer: 013031997 The ISBN-10 number is 013031997X
 */
public class CheckISBN {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first 9 digits of the ISBN-10
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");

    // receive input
    int first9Digits = input.nextInt();

    // Calculate the checksum using the formula
    // first extracts each digit from the integer using integer division and the modulus operator
    int d9 = first9Digits % 10;
    first9Digits /= 10;
    int d8 = first9Digits % 10;
    first9Digits /= 10;
    int d7 = first9Digits % 10;
    first9Digits /= 10;
    int d6 = first9Digits % 10;
    first9Digits /= 10;
    int d5 = first9Digits % 10;
    first9Digits /= 10;
    int d4 = first9Digits % 10;
    first9Digits /= 10;
    int d3 = first9Digits % 10;
    first9Digits /= 10;
    int d2 = first9Digits % 10;
    first9Digits /= 10;
    int d1 = first9Digits % 10;

    // multiplies each digit by its corresponding weight and adds up the results
    int checksum =
        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
    System.out.println("checksum is " + checksum);

    // Display the 10-digit ISBN
    if (checksum == 10) {
      System.out.println(
          "The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
    } else {
      System.out.println(
          "The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
    }

  }

}
