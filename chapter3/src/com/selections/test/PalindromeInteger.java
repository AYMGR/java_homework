package com.selections.test;

import java.util.Scanner;

/**
 * 3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit integer
 * and determines whether it is a palindrome integer. An integer is palindrome if it reads the same
 * from right to left and from left to right. A negative integer is treated the same as a positive
 * integer. Here are sample runs of this program:
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 */
public class PalindromeInteger {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter a three-digit integer
    System.out.print("Enter a three-digit integer: ");

    // receive the integer
    int num = input.nextInt();

    // Determines whether it is a palindrome integer
    // first extracts each digit from the integer using integer division and the modulus operator
    int hundredsDigit = num / 100;
    int tensDigit = num % 100 / 10;
    int digit = num % 10;

    // Display
    if (hundredsDigit == digit && hundredsDigit != tensDigit) {
      System.out.println(num + " is a palindrome");
    } else {
      System.out.println(num + " is not a palindrome");
    }

  }

}
